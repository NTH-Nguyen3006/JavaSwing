package FinalTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentDAO {
    String url = """
            jdbc:sqlserver://localhost:1433;
            databaseName=finaltest;
            encrypt=true;
            trustServerCertificate=true
            """;
    Connection connection = null;

    public StudentDAO() {
        try {
            connection = DriverManager.getConnection(url, "sa", "123");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    
    
}
