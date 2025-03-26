/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Lab6;

/**
 *
 * @author Admin
 */
public class Bai4 extends javax.swing.JFrame {

    /**
     * Creates new form Bai4
     */
    public Bai4() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textFirst = new javax.swing.JTextField();
        textSecond = new javax.swing.JTextField();
        textThird = new javax.swing.JTextField();
        startBtn1 = new javax.swing.JButton();
        startBtn2 = new javax.swing.JButton();
        startBtn3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Xổ Số Kiến Thiết");

        textFirst.setEditable(false);
        textFirst.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textFirst.setForeground(new java.awt.Color(0, 0, 204));
        textFirst.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        textSecond.setEditable(false);
        textSecond.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textSecond.setForeground(new java.awt.Color(204, 0, 0));
        textSecond.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        textThird.setEditable(false);
        textThird.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textThird.setForeground(new java.awt.Color(0, 102, 0));
        textThird.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        startBtn1.setText("Bắt đầu");
        startBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtn1ActionPerformed(evt);
            }
        });

        startBtn2.setText("Bắt đầu");
        startBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtn2ActionPerformed(evt);
            }
        });

        startBtn3.setText("Bắt đầu");
        startBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtn3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(startBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(textFirst))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textSecond, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textThird, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSecond, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textThird, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 85, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void startBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtn1ActionPerformed
        new Thread(new Runnable() {
            @Override
            public void run() {
                startBtn1.setEnabled(false);
                for (int i = 0; i < 1000; i++) {
                    textFirst.setText(String.valueOf(Math.round(Math.random()*9)));
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                startBtn1.setEnabled(true);
            }
        }).start();
    }//GEN-LAST:event_startBtn1ActionPerformed

    private void startBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtn2ActionPerformed
        new Thread(new Runnable() {
            @Override
            public void run() {
                startBtn2.setEnabled(false);
                for (int i = 0; i < 1000; i++) {
                    textSecond.setText(String.valueOf(Math.round(Math.random()*9)));
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                startBtn2.setEnabled(true);
            }
        }).start();
    }//GEN-LAST:event_startBtn2ActionPerformed

    private void startBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtn3ActionPerformed
        new Thread(new Runnable() {
            @Override
            public void run() {
                startBtn3.setEnabled(false);
                for (int i = 0; i < 1000; i++) {
                    textThird.setText(String.valueOf(Math.round(Math.random()*9)));
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                startBtn3.setEnabled(true);
            }
        }).start();
    }//GEN-LAST:event_startBtn3ActionPerformed

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
            java.util.logging.Logger.getLogger(Bai4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bai4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bai4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bai4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bai4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton startBtn1;
    private javax.swing.JButton startBtn2;
    private javax.swing.JButton startBtn3;
    private javax.swing.JTextField textFirst;
    private javax.swing.JTextField textSecond;
    private javax.swing.JTextField textThird;
    // End of variables declaration//GEN-END:variables
}
