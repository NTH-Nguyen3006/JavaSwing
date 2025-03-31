package Assignment.dto;

public class Grade {
    int ID;
    private Students students;
    private double English, Java, SQL;

    public void updateGrade(double English, double Java, double SQL) {
        this.English = English;
        this.Java = Java;
        this.SQL = SQL;
    }

    public Grade() {
    }

    public Grade(double SQL, double java, double english, Students students) {
        this.SQL = SQL;
        Java = java;
        English = english;
        this.students = students;
    }

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

    public void setJava(double java) {
        Java = java;
    }

    public double getSQL() {
        return SQL;
    }

    public void setSQL(double SQL) {
        this.SQL = SQL;
    }

    public double getAverageMark() {
        return (English + Java + SQL) / 3;
    }
}
