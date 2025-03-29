package Extension.Sql;

import Lab5.LoaiSanPham;

import javax.management.ObjectName;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.spec.RSAOtherPrimeInfo;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Cursor {
    private PreparedStatement pprstm;
    protected Connection connection;
    List data;
    Class<?> cls;
    Object foreignTableType;

    private Type[] DefaultDbType = new Type[] {
            int.class, String.class, BigDecimal.class,
            float.class, double.class, Long.class, BigInteger.class};

    protected Cursor(){}

    protected <O> Cursor(O o) {
        cls = o.getClass();
//        this.o = o;
        data = new ArrayList<O>();
    }

    protected <O> Cursor (Class<?> clazz) {
        this.cls = clazz;
        data = new ArrayList<O>();
    }

    protected void setConnection(Connection connection) {
        this.connection = connection;
    }

    private boolean isCtorHasParamResultSetType() {
        return Arrays.stream(cls.getConstructors())
            .anyMatch(c -> Arrays.stream(c.getParameterTypes())
                .anyMatch(p -> p.equals(ResultSet.class)));
    }

    public Object convertToFieldType(Object obj, String fieldName, Object columnData) throws NoSuchFieldException, IllegalAccessException {
        try {
            Field field = obj.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            if (field.getType() == float.class)
                return (float) columnData;
            else if (field.getType() == double.class)
                return (double) columnData;

            return columnData;
        } catch (Exception e) {
            return columnData;
        }
    }

//    private void InjectDataToClass () {
//
//    }

    private <O> List<?> getRowData() throws SQLException, NoSuchFieldException {
        List<Object> listData = new ArrayList<>();
        ResultSet rs = pprstm.executeQuery();
        Object obj;
        data = new ArrayList<>();
        try {
            if (isCtorHasParamResultSetType()) {
                Constructor<?> ctor = cls.getConstructor(ResultSet.class);
                while (rs.next()) {
                    obj = ctor.newInstance(rs);
                    listData.add(obj);
                }
            }
            else {
                Field[] fields = cls.getDeclaredFields();
                while (rs.next()) {
                    Constructor<?> constructor = cls.getConstructor();
                    Object o = constructor.newInstance();
                    ResultSetMetaData meta = rs.getMetaData();
                    fieldf: for (int i = 0; i < meta.getColumnCount(); i++) {
                        String ColumnName = meta.getColumnName(i+1);
                        Field field = Arrays.stream(fields).filter(
                                f -> f.getName().equalsIgnoreCase(ColumnName))
                                .findFirst().orElse(null);
                        if (field != null) {
                            field.setAccessible(true);
                            Object columnData = convertToFieldType(
                                    field, field.getName(), rs.getObject(ColumnName));
                            field.set(o, columnData);
                            field.setAccessible(false);
                        }
                        else {
                            Field[] fieldsother = Arrays.stream(fields)
                                    .filter(f -> !Arrays.asList(DefaultDbType)
                                            .contains(f.getType())).toArray(Field[]::new);

                            for (Field fie : fieldsother) {
                                Class<?> fieldType = fie.getType();
                                boolean hasFieldDbName = Arrays.stream(fieldType.getDeclaredFields())
                                        .anyMatch(f -> f.getName().equalsIgnoreCase(ColumnName));
                                if (hasFieldDbName) {
                                    Object childObject = fieldType.getConstructor().newInstance();
                                    Field childField = Arrays.stream(childObject.getClass().getDeclaredFields())
                                            .filter(f -> f.getName().equalsIgnoreCase(ColumnName))
                                            .findFirst().orElseThrow();
                                    Object columnData = convertToFieldType(
                                            childField, childField.getName(), rs.getObject(ColumnName));
                                    childField.setAccessible(true);
                                    childField.set(childObject, columnData);
                                    childField.setAccessible(false);
                                    Field superClsFie = o.getClass().getDeclaredField(fie.getName());
                                    superClsFie.setAccessible(true);
                                    superClsFie.set(o, childObject);
                                    superClsFie.setAccessible(false);

                                }
                            }
                        }
                    }
                    listData.add(o);
                }
            }
            return listData;
        } catch (NoSuchMethodException | InstantiationException |
                 InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public Cursor execute(String query, Object... formats) {
        try {
            pprstm = connection.prepareStatement(query);
            for (int i = 0; i < formats.length; i++)
                pprstm.setObject(i+1, formats[i]);

            if (pprstm.execute()) { // SELECT QUERY
                this.data = getRowData();
                return this;
            }
            else // DELETE/ UPDATE/ INSERT QUERY
                return null;
        } catch (SQLException | NoSuchFieldException e) {
            throw new RuntimeException(e);
        }

    }

    public Cursor executeMany(String query, Object[][] objects) throws SQLException, NoSuchFieldException {
        pprstm = connection.prepareStatement(query);
        if (query.startsWith("update"))
            return execute(query, objects[0]);
        else{
            for (Object[] objs : objects) {
                for (int i = 0; i < objs.length; i++)
                    pprstm.setObject(i+1, objs[i]);
                pprstm.addBatch();
                pprstm.executeBatch();
            }
            return null;
        }
    }

//    public  setForeignTable() {
//
//
//    }

    public Object fetchOne() {
        if (data.isEmpty()) return null;
        return fetchAll().getFirst();
    }

    public <O> List<O> fetchAll() {
        return this.data;
    }
}
