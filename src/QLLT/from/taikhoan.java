/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLLT.from;

import QLLT.from.fromcon.suaTK;
import QLLT.from.fromcon.themTK;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vinh
 */
public class taikhoan extends javax.swing.JPanel {

    Connection cn;
    DefaultTableModel model;
    public static String ten, mk, manv, mq;

    /**
     * Creates new form taikhoan
     */
    public taikhoan() {
        initComponents();
        String heder[] = {"tên tài khoản", "mật khẩu", "mã nhân viên", "mã quyền"};
        String data[][] = null;
        model = new DefaultTableModel(data, heder);
        table.setModel(model);
      //  cn = helper.hepper.ketnoi("qllaptop4");
        System.out.println("kết nối thành công");
        jButton3.setEnabled(false);
        jButton1.setEnabled(false);

        loaddatatable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txttim = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jDesktopPane1.setBackground(new java.awt.Color(240, 240, 240));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Edit.png"))); // NOI18N
        jButton3.setText("sửa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Delete.png"))); // NOI18N
        jButton1.setText("xóa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add.png"))); // NOI18N
        jButton2.setText("thêm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txttim.setBorder(javax.swing.BorderFactory.createTitledBorder("tìm kiếm"));
        txttim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttimActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Search.png"))); // NOI18N
        jButton4.setText("tìm kiếm");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_replay_30px.png"))); // NOI18N
        jButton7.setText("làm mới");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "1", "2", "3"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jDesktopPane1.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txttim, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(txttim, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(64, 64, 64)
                        .addComponent(jButton1)
                        .addGap(77, 77, 77)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(20, 20, 20)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttim, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
        );

        add(jDesktopPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        suaTK slsp = new suaTK();
        jDesktopPane1.add(slsp);
        slsp.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {

      //      cn = helper.hepper.ketnoi("qllaptop4");

            String sql = "DELETE dbo.taikhoan\n"
                    + "WHERE tentaikhoan LIKE ?";

            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, table.getValueAt(table.getSelectedRow(), 0).toString());

            int hoi = JOptionPane.showConfirmDialog(this, "xóa tài khoản");
            if (hoi == JOptionPane.YES_OPTION) {

                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "xóa thành công");
                model.setRowCount(0);
                loaddatatable();

            } else {
                JOptionPane.showMessageDialog(this, "chưa xóa");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "lỗi xóa sp");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        themTK tlsp = new themTK();
        jDesktopPane1.add(tlsp);
        tlsp.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txttimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttimActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        try {
            String sql = "SELECT * FROM dbo.taikhoan\n"
                    + "WHERE tentaikhoan LIKE ?";
            PreparedStatement ptsm = cn.prepareStatement(sql);
            ptsm.setString(1, txttim.getText());
            ResultSet rs = ptsm.executeQuery();

            model.setRowCount(0);
            while (rs.next()) {

                Vector sp = new Vector();
                sp.add(rs.getString(1));
                sp.add(rs.getString(2));
                sp.add(rs.getString(3));
                sp.add(rs.getString(4));

                model.addRow(sp);

            }

            table.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi tìm kiếm");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        model.setRowCount(0);
        txttim.setText("");
        loaddatatable();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

        int row = table.getSelectedRow();
        ten = table.getValueAt(row, 0).toString();
        mk = table.getValueAt(row, 1).toString();

        manv = table.getValueAt(row, 2).toString();
        mq = table.getValueAt(row, 3).toString();
        jButton3.setEnabled(true);
        jButton1.setEnabled(true);
        jButton3.setEnabled(true);
    }//GEN-LAST:event_tableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txttim;
    // End of variables declaration//GEN-END:variables

    private void loaddatatable() {
        try {
            String sql = "SELECT * FROM dbo.taikhoan";
            Statement stm = cn.createStatement();
            //khai báo re sun sét nhận dữ liệu khi thực thi truy vấn select
            ResultSet rs = stm.executeQuery(sql);
            // duyệt rs đổ dữ liệu table
            while (rs.next()) {
                Vector lsp = new Vector();
                lsp.add(rs.getString(1));
                lsp.add(rs.getString(2));
                lsp.add(rs.getString(3));
                lsp.add(rs.getString(4));

                model.addRow(lsp);
            }
            table.setModel(model);

            rs.close();
            stm.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);

        }
    }
}
