package Lab4;

import java.sql.ResultSet;
import java.sql.SQLException;

public class User {
    private String id;
    private String name;
    private String sex;
    private String phone;
    private String email;
    private String address;

    public User(String id, String name, String sex, String phone, String email, String address) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public User(ResultSet resultSet) throws SQLException {
        this.id = resultSet.getString("Ma_ND");
        this.name = resultSet.getString("TEN");
        this.sex = resultSet.getString("GioiTinh");
        this.phone = resultSet.getString("SoDT");
        this.email = resultSet.getString("Email");
        this.address = resultSet.getString("DiaChi");
    }

    public void updateInfo(String id, String name, String sex, String phone, String email, String address) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
