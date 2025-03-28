/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Lab4;

import Extension.Actions;
import Extension.Sql.Sql;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.sql.*;
import java.util.*;
import java.util.stream.Stream;

/**
 *
 * @author Admin
 */
public class Bai2 extends javax.swing.JFrame {

    /**
     * Creates new form Bai1
     */
    public Bai2() {
        initComponents();
        try (Connection connection = connection()) {
            String sqlQuery = "Select * From NGUOIDUNG";
            ResultSet rs = connection.prepareStatement(sqlQuery).executeQuery();
            while (rs.next())
                users.add(new User(rs));
            Actions.fillToTable(TableShow, users);
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GioiTinhGroup = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        EmailField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PhoneNumField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressField = new javax.swing.JTextArea();
        MaleRadio = new javax.swing.JRadioButton();
        FemaleRadio = new javax.swing.JRadioButton();
        addUserBtn = new javax.swing.JButton();
        updateUserBtn = new javax.swing.JButton();
        DeleteUserBtn = new javax.swing.JButton();
        SaveDatabaseBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableShow = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ NGƯỜI DÙNG");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setText("Tên");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setText("Email");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setText("Số ĐT");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel6.setText("Giới Tính");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel7.setText("Địa Chỉ");

        addressField.setColumns(20);
        addressField.setRows(5);
        jScrollPane1.setViewportView(addressField);

        GioiTinhGroup.add(MaleRadio);
        MaleRadio.setSelected(true);
        MaleRadio.setText("Nam");

        GioiTinhGroup.add(FemaleRadio);
        FemaleRadio.setText("Nữ");

        addUserBtn.setIcon(new javax.swing.ImageIcon("D:\\Icon\\AddNew.png")); // NOI18N
        addUserBtn.setText("Thêm");
        addUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserBtnActionPerformed(evt);
            }
        });

        updateUserBtn.setIcon(new javax.swing.ImageIcon("D:\\Icon\\update.png")); // NOI18N
        updateUserBtn.setText("Sửa");
        updateUserBtn.setEnabled(false);
        updateUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUserBtnActionPerformed(evt);
            }
        });

        DeleteUserBtn.setIcon(new javax.swing.ImageIcon("D:\\Icon\\delete.png")); // NOI18N
        DeleteUserBtn.setText("Xóa");
        DeleteUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteUserBtnActionPerformed(evt);
            }
        });

        SaveDatabaseBtn.setIcon(new javax.swing.ImageIcon("D:\\Icon\\save.png")); // NOI18N
        SaveDatabaseBtn.setText("Lưu");
        SaveDatabaseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveDatabaseBtnActionPerformed(evt);
            }
        });

        TableShow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên", "Giới tính", "Số ĐT", "Email", "Địa chỉ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableShowMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TableShow);
        if (TableShow.getColumnModel().getColumnCount() > 0) {
            TableShow.getColumnModel().getColumn(0).setPreferredWidth(5);
            TableShow.getColumnModel().getColumn(1).setPreferredWidth(20);
            TableShow.getColumnModel().getColumn(2).setPreferredWidth(5);
            TableShow.getColumnModel().getColumn(3).setPreferredWidth(10);
            TableShow.getColumnModel().getColumn(4).setPreferredWidth(25);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(idField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NameField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addUserBtn)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PhoneNumField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MaleRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FemaleRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(SaveDatabaseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(PhoneNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(MaleRadio)
                            .addComponent(FemaleRadio))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SaveDatabaseBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addUserBtn)
                            .addComponent(DeleteUserBtn)
                            .addComponent(updateUserBtn))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserBtnActionPerformed
        JTextComponent[] textFields =  {idField, NameField, EmailField, PhoneNumField, addressField};
        boolean HasFieldEmpty = Actions.checkEmptyTextFields(textFields);

        if (!users.stream().anyMatch(u -> u.getId().equals(idField.getText())))
        {
            if (HasFieldEmpty){
                JOptionPane.showMessageDialog(this,
                        "Vui lòng nhập đủ dữ liệu...");
                return;
            }
            else {
                users.add(new User(
                        idField.getText(), NameField.getText(),
                        MaleRadio.isSelected()? "Nam" : "Nữ",
                        PhoneNumField.getText(), EmailField.getText(),
                        addressField.getText()));
                Actions.fillToTable(TableShow, users);
            }
        }

        Actions.resetTextField(textFields);
        MaleRadio.setSelected(true);
        TableShow.clearSelection();
    }//GEN-LAST:event_addUserBtnActionPerformed

    private void DeleteUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteUserBtnActionPerformed
        String delQuery = "DELETE FROM NGUOIDUNG WHERE Ma_ND = ?;";

        try {
            Connection connection = connection();
            PreparedStatement ppstm = connection.prepareStatement(delQuery);
            List<User> usersToDelete = Arrays.stream(TableShow.getSelectedRows())
                .mapToObj(i -> users.get(i)).toList();
            usersToDelete.forEach(u -> {
                try {
                    ppstm.setString(1, u.getId());
                    ppstm.addBatch();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            });
            users.removeAll(usersToDelete);
            System.out.println(ppstm.executeBatch().length + " have been wiped");
            connection.commit();
            ppstm.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        JTextComponent[] textFields = {idField, NameField, EmailField, PhoneNumField, addressField};
        MaleRadio.setSelected(true);
        Actions.resetTextField(textFields);
        Actions.fillToTable(TableShow, users);
    }//GEN-LAST:event_DeleteUserBtnActionPerformed

    private void updateUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUserBtnActionPerformed
        if (Actions.checkEmptyTextFields(new JTextComponent[]
                {idField, NameField, EmailField, PhoneNumField, addressField})) {
            JOptionPane.showMessageDialog(this,
                    "Vui lòng nhập đủ dữ liệu");
            return;
        }

        Stream<User> stream = users.stream().filter(u -> u.getId().equals(idField.getText()));
        User user = stream.findFirst().orElse(null);
        if (user == null)
            users.add(new User(idField.getText(), NameField.getText(),
                MaleRadio.isSelected() ? "Nam" : "Nữ", PhoneNumField.getText(),
                    EmailField.getText(), addressField.getText()));
        else
            user.updateInfo(user.getId(), NameField.getText(),
                    MaleRadio.isSelected()? "Nam" : "Nữ", PhoneNumField.getText(),
                    EmailField.getText(), addressField.getText());

        Actions.fillToTable(TableShow, users);
    }//GEN-LAST:event_updateUserBtnActionPerformed

    private void SaveDatabaseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveDatabaseBtnActionPerformed
        for(User u : users) {
            updateUserToDB(u);
        }
    }//GEN-LAST:event_SaveDatabaseBtnActionPerformed

    private void TableShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableShowMouseClicked
        User user = users.get(TableShow.getSelectedRow());
        idField.setText(user.getId());
        NameField.setText(user.getName());
        EmailField.setText(user.getEmail());
        PhoneNumField.setText(user.getPhone());
        addressField.setText(user.getAddress());
        if (user.getSex().contains("Nam")) MaleRadio.setSelected(true);
        else FemaleRadio.setSelected(true);
        updateUserBtn.setEnabled(true);
    }//GEN-LAST:event_TableShowMouseClicked

    Connection connection() {
        return new Sql( """
            jdbc:sqlserver://localhost:1433;
            databaseName=QLNHATRO_nguyennthts01667;
            encrypt=true;
            trustServerCertificate=true;
            """, "sa", "123").Connect().connection;
    }

    void updateUserToDB(User user) {
        Connection connection = connection();
        final String SELECT = "SELECT 1 FROM NGUOIDUNG WHERE Ma_ND LIKE ?;";
        final String INSERT = """
                INSERT INTO NGUOIDUNG (Ma_ND, TEN, GioiTinh, SoDT, Email, DiaChi)
                VALUES (?,?,?,?,?,?);
        """;
        final String UPDATE = """
                UPDATE NGUOIDUNG
                SET TEN = ?, GioiTinh = ?, SoDT = ?,
                Email = ?, DiaChi = ?
                WHERE Ma_ND = ?;
                """;
        try {
            PreparedStatement ppstm = connection.prepareStatement(SELECT);
            ppstm.setString(1, user.getId());
            ResultSet rs = ppstm.executeQuery();
            if (rs.next()) {
                ppstm = connection.prepareStatement(UPDATE);
                ppstm.setString(1, user.getName());
                System.out.println(user.getName());
                ppstm.setString(2, user.getSex());
                ppstm.setString(3, user.getPhone());
                ppstm.setString(4, user.getEmail());
                ppstm.setString(5, user.getAddress());
                ppstm.setString(6, user.getId());
            }
            else {
                ppstm = connection.prepareStatement(INSERT);
                ppstm.setString(1, user.getId());
                ppstm.setString(2, user.getName());
                ppstm.setString(3, user.getSex());
                ppstm.setString(4, user.getPhone());
                ppstm.setString(5, user.getEmail());
                ppstm.setString(6, user.getAddress());
            }
            ppstm.executeUpdate();
            connection.commit();
            ppstm.close(); connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    List<User> users = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bai2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteUserBtn;
    private javax.swing.JTextField EmailField;
    private javax.swing.JRadioButton FemaleRadio;
    private javax.swing.ButtonGroup GioiTinhGroup;
    private javax.swing.JRadioButton MaleRadio;
    private javax.swing.JTextField NameField;
    private javax.swing.JTextField PhoneNumField;
    private javax.swing.JButton SaveDatabaseBtn;
    private javax.swing.JTable TableShow;
    private javax.swing.JButton addUserBtn;
    private javax.swing.JTextArea addressField;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton updateUserBtn;
    // End of variables declaration//GEN-END:variables
}
