package Assignment1.dao;

import Assignment1.dto.Grade;
import Extension.Sql.Cursor;

public class GradeDAO {
    private final Cursor cursorGradeTab = MyConnection.connect.Cursor(Grade.class);

    public Grade getStudentGradeById(int id) {
        return (Grade) cursorGradeTab.execute(
                "SELECT * FROM GRADE WHERE id = ?", 2).fetchOne();
    }
}
