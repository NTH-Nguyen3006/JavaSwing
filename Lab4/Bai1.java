package Lab4;

import java.math.BigDecimal;
import java.sql.*;

public class Bai1 {
    public static void main(String[] args) throws SQLException {
        new Bai1().getDataDB();
    }

    void getDataDB() throws SQLException {
        PreparedStatement preStm = connectDB().prepareStatement("Select * from NHATRO");
        ResultSet resultSet = preStm.executeQuery();
        StringBuilder builder = new StringBuilder();
        builder.append("MaNha   DienTich    Gia             DiaChi                                  LoaiNha\n");

        while (resultSet.next()) {
            builder.append(resultSet.getString("Ma_Nha")).append("\t");
            builder.append(resultSet.getString("DienTich")).append("\t\t");
            builder.append(resultSet.getLong("Gia")).append("\t\t");
            builder.append(resultSet.getString("DiaChi")).append("\t\t\t");
            builder.append(resultSet.getString("LoaiNha")).append("\n");
        }
        System.out.println(builder);
    }

    Connection connectDB () {
        final String connectionString = """
            jdbc:sqlserver://localhost:1433;
            databaseName=QLNHATRO_nguyennthts01667;
            encrypt=true;
            trustServerCertificate=true
            """;
        final String usernameDB = "sa", password = "123";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(
                    connectionString, usernameDB, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
