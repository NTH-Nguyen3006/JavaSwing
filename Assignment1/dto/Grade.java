package Assignment1.dto;

public class Grade {
    int ID;
    private Students students;
    private double English, Java, SQL;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public double getEnglish() {
        return English;
    }

    public void setTienganh(double english) {
        English = english;
    }

    public double getJava() {
        return Java;
    }

    public void setJava(int java) {
        Java = java;
    }

    public double getSQL() {
        return SQL;
    }

    public void setSQL(int SQL) {
        this.SQL = SQL;
    }
}
