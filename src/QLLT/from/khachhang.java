/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLLT.from;

import Ketnoi.KetNoi;
import QLLT.DAO.DAo_KH;
import QLLT.classs.QLKH;
import QLLT.classs.XuatExcel;
import QLLT.from.fromcon.chitiethoadonkhachhangmua;
import QLLT.from.fromcon.suaKH;
import QLLT.from.fromcon.themkh1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vinh
 */
public class khachhang extends javax.swing.JPanel {

Ketnoi.KetNoi cn= new KetNoi();
    QLKH n= new QLKH();
    public static String makh,ten,diachi,sdt,trangthai;
 long count,sotrang,trang=1;
  DefaultTableModel model;
    /**
     * Creates new form khachhang
     */
    public khachhang() {
        initComponents();
        laysodong();
        if(count % 5 ==0 )
        {
            sotrang = count/5;
        }
        else
        {
            sotrang=count/5 + 1;
        }
       
        DAo_KH.dolentable(tblkh, 1);
         lbltrang.setText("1");
         lblsotrang.setText("1/"+sotrang);
        jButton1.setEnabled(false);
        jButton3.setEnabled(false);

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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblkh = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        bltthem = new javax.swing.JButton();
        txttim = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        lblsotrang = new javax.swing.JLabel();
        nextlui1tk = new javax.swing.JButton();
        nextvetk = new javax.swing.JButton();
        lbltrang = new javax.swing.JLabel();
        nexttien1tk = new javax.swing.JButton();
        nexttientk = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1044, 703));
        setLayout(new java.awt.CardLayout());

        jDesktopPane1.setBackground(new java.awt.Color(240, 240, 240));

        tblkh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Khách Hàng", "Tên Khách Hàng", "Địa Chỉ", "Số Điện Thoại", "Trạng Thái"
            }
        ));
        tblkh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblkhMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblkh);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Edit.png"))); // NOI18N
        jButton3.setText("Sửa");
        jButton3.setPreferredSize(new java.awt.Dimension(93, 33));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Delete.png"))); // NOI18N
        jButton1.setText("Xóa");
        jButton1.setPreferredSize(new java.awt.Dimension(93, 33));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bltthem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add.png"))); // NOI18N
        bltthem.setText("Thêm");
        bltthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bltthemActionPerformed(evt);
            }
        });

        txttim.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm Kiếm"));
        txttim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttimActionPerformed(evt);
            }
        });
        txttim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttimKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttimKeyReleased(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_replay_30px.png"))); // NOI18N
        jButton7.setText("Làm Mới");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        lblsotrang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsotrang.setText("Trang");

        nextlui1tk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/107816534_335383491191669_6858896409213148801_n.png"))); // NOI18N
        nextlui1tk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextlui1tkActionPerformed(evt);
            }
        });

        nextvetk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/109458344_606525943604283_1735448384254130874_n.png"))); // NOI18N
        nextvetk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextvetkActionPerformed(evt);
            }
        });

        lbltrang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltrang.setText("Trang");

        nexttien1tk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/108190622_330299054646593_925802538658998860_n.png"))); // NOI18N
        nexttien1tk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nexttien1tkActionPerformed(evt);
            }
        });

        nexttientk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/107792122_206608630685120_4490402718207329408_n (1).png"))); // NOI18N
        nexttientk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nexttientkActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_ms_excel_30px.png"))); // NOI18N
        jButton2.setText("Xuất EXCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton9.setText("Xem Chi Tiết");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(bltthem, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txttim, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblsotrang, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(nextlui1tk, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(nextvetk, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lbltrang, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(nexttien1tk, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(nexttientk, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(nextvetk, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nextlui1tk, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbltrang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nexttien1tk, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nexttientk, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblsotrang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(312, 312, 312))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(txttim)
                                .addGap(18, 18, 18)
                                .addComponent(jButton7))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(bltthem)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(261, 261, 261))))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bltthem)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttim, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblsotrang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltrang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nextvetk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nextlui1tk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nexttien1tk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nexttientk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        add(jDesktopPane1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        laydl();
        DAo_KH.Delete(n);
         DAo_KH.dolentable(tblkh, 1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bltthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bltthemActionPerformed
        // TODO add your handling code here:
        themkh1 kh = new themkh1();
        jDesktopPane1.add(kh);
        kh.setVisible(true);

    }//GEN-LAST:event_bltthemActionPerformed

    private void txttimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttimActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        suaKH skh= new suaKH();
        jDesktopPane1.add(skh);
        skh.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tblkhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblkhMouseClicked
        // TODO add your handling code here:
          int row = tblkh.getSelectedRow();

        makh=tblkh.getValueAt(row, 0).toString();
        ten=tblkh.getValueAt(row, 1).toString();
        diachi=tblkh.getValueAt(row, 2).toString();
        sdt=tblkh.getValueAt(row, 3).toString();
        trangthai=tblkh.getValueAt(row, 4).toString();
          jButton1.setEnabled(true);
        jButton3.setEnabled(true);
        
    }//GEN-LAST:event_tblkhMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        txttim.setText("");
        DAo_KH.dolentable(tblkh, 1);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void txttimKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttimKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttimKeyPressed

    private void txttimKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttimKeyReleased
        // TODO add your handling code here:
  laydl();
    try {
        DAo_KH.TimKiemKH(n, tblkh);
    } catch (SQLException ex) {
        Logger.getLogger(khachhang.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_txttimKeyReleased

    private void nextlui1tkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextlui1tkActionPerformed
        // TODO add your handling code here:
        if (trang > 1) {
            trang--;
           DAo_KH.dolentable(tblkh, trang);
            lblsotrang.setText(trang + "/" + sotrang);
            lbltrang.setText("" + trang);
        }
    }//GEN-LAST:event_nextlui1tkActionPerformed

    private void nextvetkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextvetkActionPerformed
        // TODO add your handling code here:
        trang = 1;

     DAo_KH.dolentable(tblkh, trang);
        lblsotrang.setText(trang + "/" + sotrang);
        lbltrang.setText("" + trang);
    }//GEN-LAST:event_nextvetkActionPerformed

    private void nexttien1tkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nexttien1tkActionPerformed
        // TODO add your handling code here:
        if (trang < sotrang) {
            trang++;
        DAo_KH.dolentable(tblkh, trang);
            lblsotrang.setText(trang + "/" + sotrang);
            lbltrang.setText("" + trang);
        }
    }//GEN-LAST:event_nexttien1tkActionPerformed

    private void nexttientkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nexttientkActionPerformed
        // TODO add your handling code here:
        trang = sotrang;

      DAo_KH.dolentable(tblkh, trang);
        lblsotrang.setText(trang + "/" + sotrang);
        lbltrang.setText("" + trang);
    }//GEN-LAST:event_nexttientkActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         dskh();
        new XuatExcel().xuatFileExcelKhachHang(tblkh, model);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        chitiethoadonkhachhangmua dm= new chitiethoadonkhachhangmua();
        jDesktopPane1.add(dm);
        dm.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bltthem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblsotrang;
    private javax.swing.JLabel lbltrang;
    private javax.swing.JButton nextlui1tk;
    private javax.swing.JButton nexttien1tk;
    private javax.swing.JButton nexttientk;
    private javax.swing.JButton nextvetk;
    private javax.swing.JTable tblkh;
    private javax.swing.JTextField txttim;
    // End of variables declaration//GEN-END:variables

    private void laydl() {
        n.setMakh(makh);
        n.setTim(txttim.getText());
    }        

    private void laysodong() {
         try {
             String sql = "SELECT COUNT(*) FROM dbo.khachhang";
            ResultSet rs=KetNoi.Select(sql);
            while (rs.next()) {
              count=rs.getLong(1);
            }
            
        } catch (Exception e) {
        }
    }
    public void dskh()
    {
         try {
          
            String sql = "SELECT *\n"
                    + "FROM dbo.khachhang";
           model = (DefaultTableModel) tblkh.getModel();
            ResultSet rs = KetNoi.Select(sql);
            Vector v = null;
            model.setRowCount(0);
            while (rs.next()) {
                v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
            
                model.addRow(v);

            }
            tblkh.setModel(model);
        } catch (Exception e) {
        }
       
    }
}
