package Assignment.dao;

import Assignment.dto.Students;
import Extension.Sql.Cursor;

import java.beans.Statement;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class StudentsDAO {
    private static final Cursor cursorStudents = MyConnection.connect.Cursor(Students.class);

    public static List<Students> getAllStudent() {
        return cursorStudents.execute(
                "SELECT * FROM STUDENTS").fetchAll();
    }

    public static Students getStudentById(String maSv) {
        return (Students) cursorStudents.execute(
                "SELECT * FROM STUDENTS WHERE MASV = ?", maSv
        ).fetchOne();
    }

    public static void saveStudentToDB(Students student) {
        String qr = """
                INSERT INTO STUDENTS (MASV, Hoten, Email, SoDT, Gioitinh, Diachi, Hinh)
                VALUES (?, ?, ?, ?, ?, ?, ?)""";
        Object[] studentData = {
                student.getMASV(), student.getHoten(), student.getEmail(), student.getSoDT(),
                student.isGioitinh(), student.getDiachi(), student.getHinh()
        };

        cursorStudents.execute(qr, studentData);
    }

    public static void updateStudentDB (Students studentUpdate) {
        String qr = """
                UPDATE STUDENTS
                SET Hoten = ?, Email = ?, SoDT = ?,
                Gioitinh = ?, Diachi = ? , Hinh = ?
                WHERE MASV = ?;""";
        Object[] studentData = {
                studentUpdate.getHoten(), studentUpdate.getEmail(), studentUpdate.getSoDT(),
                studentUpdate.isGioitinh(), studentUpdate.getDiachi(), studentUpdate.getHinh(),
                studentUpdate.getMASV()
        };
        cursorStudents.execute(qr, studentData);
    }

    public static void deleteStudentById(String id) {
        cursorStudents.execute(
                "DELETE FROM STUDENTS WHERE MASV = ?", id);
    }

    public static void deleteStudents(Students[] students) {
        Object[][] studentIds = Arrays.stream(students)
                .map(st -> new String[]{st.getMASV()}).toArray(Object[][]::new);

        try {
            CallableStatement callableStatement = cursorStudents.getConnection()
                    .prepareCall("{Call deleteStudents(?)}");
            for (Students st : students) {
                callableStatement.setString(1, st.getMASV());
                callableStatement.addBatch();
            }
            System.out.printf("Đã có %d dòng dữ liệu bị tác động.\n",
                    callableStatement.executeBatch().length);
            callableStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
