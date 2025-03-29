package Assignment1.dao;

import Assignment1.dto.Users;
import Extension.Sql.Cursor;

public class UsersDAO {
    private final Cursor cursorUsers = MyConnection.connect.Cursor(Users.class);

    public Users getUserOnUsername(String username) {
        return (Users) cursorUsers.execute(
            "SELECT * FROM USERS WHERE username = ?", username).fetchOne();
    }
}
