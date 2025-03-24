package Extension;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class Actions {
    public static void resetTextField(JTextComponent ... textFields) {
        for (JTextComponent field : textFields)
            field.setText("");
    }
    
    public static boolean checkEmptyTextFields(JTextComponent ... jtexts) {
        for (JTextComponent jtxt : jtexts)
            if (jtxt.getText().isEmpty()) {
                return true;
            }
        return false;
    }

    public static void fillToTable(JTable table, List<?> data, String... titles) {
        System.out.println();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // reset data table
        if (!data.getFirst().getClass().equals(Object[].class)) {
            for (Object obj : data) {
                Field[] f = obj.getClass().getDeclaredFields();
                Object[] rowData = new Object[f.length];
                for (int i = 0; i < f.length; i++) {
                    f[i].setAccessible(true);

                    try {
                        rowData[i] = f[i].get(obj);
                        f[i].setAccessible(false);
                    } catch (IllegalAccessException e) {
                        // Lỗi truy cập bất hợp pháp
                    }
                }
                model.addRow(rowData);
            }
        }
        else {
            data.forEach(o -> model.addRow((Object[]) o));
        }
    }
//    private void fillClassToTable (JTable table, Class<?> clazz, String[] nameFieldToAdd) {
//        for (String nameField : nameFieldToAdd) {
//            Field field = Arrays.stream(clazz.getDeclaredFields())
//                .filter(f -> f.getName().equalsIgnoreCase(nameField))
//                .findFirst().orElse(null);
//
//            if (field != null) {
//
//            }
//        }
//    }

}
