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

    public static List<Grade> getStudentGradeByStudentId(String MaSv) {
        return getAllData().stream().filter(grade -> grade.getStudents().getMASV().equalsIgnoreCase(MaSv))
                .toList();
    }

    public static void deleteGradeData(Object[][] studentIds) {
        cursorGradeTab.executeMany("""
                UPDATE GRADE
                SET English = NULL, Java = NULL, [SQL] = NULL
                WHERE MASV = ?;
                """, studentIds);
    }

    public static void updateGradeByMaSV(String MaSv, double english, double java, double sql) {
        cursorGradeTab.execute("""
                UPDATE GRADE
                SET English = ?, Java = ?, [SQL] = ?
                WHERE MASV = ?;
                """, english, java, sql, MaSv);
    }

    public static void updateGradeList(List<Grade> gradeList) {
        Object[][] dataToUpdate = gradeList.stream().map(g -> new Object[] {
                g.getEnglish(), g.getJava(), g.getSQL(), g.getStudents().getMASV()
        }).toArray(Object[][]::new);

        cursorGradeTab.executeMany("""
                UPDATE GRADE
                SET English = ?, Java = ?, [SQL] = ?
                WHERE MASV = ?;
                """, dataToUpdate);
    }
}
