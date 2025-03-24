package Lab2;

import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Helper {
    public static void updateStudent(){} 
    
    public static void fillToTable(List<Student> studentList, JTable table){
        DefaultTableModel Tmodel = (DefaultTableModel) table.getModel();
        Tmodel.setRowCount(0);
        String[] titles = {"HỌ VÀ TÊN", "ĐIỂM", "KHÓA HỌC", "XẾP LOẠI", "THƯỞNG"};
        
        for (Student st : studentList) 
           Tmodel.addRow(st.toInfoArray());
    } 
    
    public static void showDetail(
            JTextField fullname, JTextField Grade, JTextField course,
            JTextField XepLoai, JCheckBox Bonus, Student st){
        fullname.setText(st.getName());
        Grade.setText(String.valueOf(st.getMarks()));
        XepLoai.setText(st.getXepLoai());
        Bonus.setSelected(st.isBonus());
    }
    
}
