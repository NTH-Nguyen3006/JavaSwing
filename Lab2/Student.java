package Lab2;

import javax.swing.*;

class Student {
   private String _name;
   private double _marks;
   private String _course;


    public Student() {}

    public Student(String _name, double _marks, String _course) {
        this._name = _name;
        this._marks = _marks;
        this._course = _course;
    }
    
    public String getXepLoai() {
        if (_marks < 3.5) return "Kém";
        if (_marks < 5) return "Yếu";
        if (_marks < 6.5) return "Trung bình";
        if (_marks < 7.5) return "Khá";
        if (_marks < 9) return "Giỏi";
        return "Xuất sắc";
    }

    public boolean isBonus() {
        return _marks >= 7.5;
    }
    
    public Object[] toInfoArray() {
        return new Object[] {
            getName(), getMarks(), getCourse(), getXepLoai(), isBonus()? "Có" : "Không"
        };
    }

    public void UpdateInfo(JTextField fullname, JTextField mark, JTextField course) {
        _name = fullname.getText();
        _marks = Double.parseDouble(mark.getText());
        _course = course.getText();
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public double getMarks() {
        return _marks;
    }

    public void setMarks(double _marks) {
        this._marks = _marks;
    }

    public String getCourse() {
        return _course;
    }

    public void setCourse(String _course) {
        this._course = _course;
    }
}
