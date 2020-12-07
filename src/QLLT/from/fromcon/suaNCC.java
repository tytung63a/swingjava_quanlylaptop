/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLLT.from.fromcon;

import QLLT.DAO.DAO_NCC;
import QLLT.classs.QLNCC;
import QLLT.from.nhacungcap;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author vinh
 */
public class suaNCC extends javax.swing.JInternalFrame {

    QLNCC n = new QLNCC();

    /**
     * Creates new form suaNCC
     */
    public suaNCC() {
        initComponents();
        this.txtdiachi.setText(nhacungcap.diachi);
        this.txtdienthoai.setText(nhacungcap.sdt);
        this.txtfax.setText(nhacungcap.fax);
        this.txtmancc.setText(nhacungcap.mancc);
        this.txttenncc.setText(nhacungcap.ten);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtmancc = new javax.swing.JTextField();
        txttenncc = new javax.swing.JTextField();
        txtdiachi = new javax.swing.JTextField();
        txtfax = new javax.swing.JTextField();
        txtdienthoai = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Sửa Nhà Cung Cấp");

        txtmancc.setEditable(false);
        txtmancc.setBorder(javax.swing.BorderFactory.createTitledBorder("Mã Nhà Cung Cấp"));
        txtmancc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmanccActionPerformed(evt);
            }
        });

        txttenncc.setBorder(javax.swing.BorderFactory.createTitledBorder("Tên Nhà Cung Cấp"));
        txttenncc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttennccActionPerformed(evt);
            }
        });

        txtdiachi.setBorder(javax.swing.BorderFactory.createTitledBorder("Địa Chỉ"));
        txtdiachi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdiachiActionPerformed(evt);
            }
        });

        txtfax.setBorder(javax.swing.BorderFactory.createTitledBorder("Số FAX"));
        txtfax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfaxActionPerformed(evt);
            }
        });

        txtdienthoai.setBorder(javax.swing.BorderFactory.createTitledBorder("Số Điện Thoại"));
        txtdienthoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdienthoaiActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Edit.png"))); // NOI18N
        jButton1.setText("Sửa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_replay_30px.png"))); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Exit.png"))); // NOI18N
        jButton3.setText("Thoát");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttenncc)
                            .addComponent(txtmancc, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtdienthoai)
                            .addComponent(txtfax, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(34, 34, 34)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmancc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttenncc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfax, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtmanccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmanccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmanccActionPerformed

    private void txttennccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttennccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttennccActionPerformed

    private void txtdiachiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiachiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiachiActionPerformed

    private void txtfaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfaxActionPerformed

    private void txtdienthoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdienthoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdienthoaiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
             if (check()) {
            laydl();
            DAO_NCC.update(n);
            dispose();
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Sửa thất bại");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.clear();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        nhacungcap nv = new nhacungcap();
        nv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txtdienthoai;
    private javax.swing.JTextField txtfax;
    private javax.swing.JTextField txtmancc;
    private javax.swing.JTextField txttenncc;
    // End of variables declaration//GEN-END:variables

    private void clear() {
        txtdiachi.setText("");
        txtdienthoai.setText("");
        txtfax.setText("");
        txtmancc.setText("");
        txttenncc.setText("");

    }

    public void laydl() {
        n.setDiachi(txtdiachi.getText());
        n.setFax(txtfax.getText());
        n.setMancc(txtmancc.getText());
        n.setSdt(txtdienthoai.getText());
        n.setTenncc(txttenncc.getText());
    }

    private boolean check() {
        if (txtdiachi.getText().equals("") || txtdienthoai.getText().equals("") || txtfax.getText().equals("")
                || txtmancc.getText().equals("") || txttenncc.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Nhập đầy đủ thông tin");
            return false;
        }
        String mauPhone = "((84)|(0))\\d{9}";
        if (!txtdienthoai.getText().matches(mauPhone)) {
            JOptionPane.showMessageDialog(this, "số điện thoại không hợp lệ");
            return false;
        }
        if (!txtfax.getText().matches(mauPhone)) {
            JOptionPane.showMessageDialog(this, "số fax không hợp lệ");
            return false;
        }
        return true;
    }

}
