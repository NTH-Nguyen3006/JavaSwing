package Assignment.dao;

import Assignment.dto.Grade;
import Assignment.dto.Students;
import Extension.Sql.Cursor;

import java.sql.Connection;
import java.util.Collections;
import java.util.List;

public class GradeDAO {
    private final static Cursor cursorGradeTab = MyConnection.connect.Cursor(Grade.class);

    public static List<Grade> getAllData () {
        List<Students> students = StudentsDAO.getAllStudent();
        List<Grade> gradeList = cursorGradeTab.execute("SELECT * FROM GRADE").fetchAll();
        gradeList.forEach(grade -> grade.getStudents().setHoten(StudentsDAO.getStudentById(
                grade.getStudents().getMASV()).getHoten()));
        return gradeList;
    }

    public static Grade getStudentGradeById(int id) {
        return (Grade) cursorGradeTab.execute(
                "SELECT * FROM GRADE WHERE id = ?", id).fetchOne();
    }

    public static Grade getStudentGradeByStudentId(String MaSv) {
        return (Grade) cursorGradeTab.execute(
                "SELECT * FROM GRADE WHERE MASV = ?", MaSv).fetchOne();
    }

    public static void deleteGradeData(Object[][] studentIds) {

    }

    public static void updateGradeByMaSV(String MaSv, double english, double java, double sql) {
        cursorGradeTab.execute("""
                UPDATE GRADE
                SET English = ?, Java = ?, [SQL] = ?
                WHERE MASV = ?;
                """, english, java, sql, MaSv);
    }
}
