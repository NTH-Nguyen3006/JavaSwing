package Extension.Sql;

import java.sql.*;

public class Sql {
    private final String connectString;
    private String username;
    private String password;
    public Connection connection;
    private PreparedStatement pprstm;

    public Sql(String connectString) {
        this.connectString = connectString;
    }

    public Sql(String connectString, String username, String password) {
        this.password = password;
        this.connectString = connectString;
        this.username = username;
    }

    public Sql Connect() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Connecting to database...");
            if (username == null && password == null)
                connection = DriverManager.getConnection(connectString);
            connection = DriverManager.getConnection(connectString, this.username, this.password);
            return this;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public int Commit() throws SQLException {
        int affectRows = pprstm.executeBatch().length;
        pprstm.closeOnCompletion();
        connection.commit();
        return affectRows;
    }

    public void setAutoCommit (boolean autoCommit) throws SQLException {
        connection.setAutoCommit(autoCommit);
    }

    public <O> Cursor Cursor(O o) {
        Cursor cursor = null;
        cursor = new Cursor(o);
        cursor.setConnection(connection);
        return cursor;
    }

    public Cursor Cursor(Class<?> cls) {
        Cursor c = null;
        c = new Cursor(cls);
        c.setConnection(this.connection);
        return c;
    }
}

