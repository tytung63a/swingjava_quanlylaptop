/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLLT.from.fromcon;

import Ketnoi.KetNoi;
import QLLT.DAO.DAO_CTSP;
import QLLT.DAO.DAO_QLSP;
import QLLT.DAO.nextid;
import QLLT.classs.QLCTSP;
import QLLT.classs.QLSP;
import QLLT.from.sanpham1;

import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author vinh
 */
public class themsp extends javax.swing.JInternalFrame {

    String loadanh = "";
    QLSP n = new QLSP();
    QLCTSP m=new QLCTSP();
    Ketnoi.KetNoi cn = new KetNoi();
    nextid id=new nextid();

    /**
     * Creates new form NewJInternalFrame
     */
    public themsp() {
        initComponents();
        id.layid();
        txtmasp.setText(id.masp());
        loadMaLoai();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtgianhap = new javax.swing.JTextField();
        txtanh = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txttrangthai = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        lblhinh = new javax.swing.JLabel();
        txtgiaban = new javax.swing.JTextField();
        txttensp = new javax.swing.JTextField();
        txtmasp = new javax.swing.JTextField();
        cboMaLoai = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtpin = new javax.swing.JTextField();
        txtcpu = new javax.swing.JTextField();
        txtram = new javax.swing.JTextField();
        txtvo = new javax.swing.JTextField();
        txtbonho = new javax.swing.JTextField();
        txtcamera = new javax.swing.JTextField();
        txtkhac = new javax.swing.JTextField();
        txtmanhinh = new javax.swing.JTextField();

        setTitle("Th??m S???n Ph???m");

        txtgianhap.setBorder(javax.swing.BorderFactory.createTitledBorder("Gi?? Nh???p"));

        txtanh.setEditable(false);
        txtanh.setBorder(javax.swing.BorderFactory.createTitledBorder("T??n ???nh"));

        txttrangthai.setColumns(20);
        txttrangthai.setRows(5);
        txttrangthai.setBorder(javax.swing.BorderFactory.createTitledBorder("M?? T???"));
        jScrollPane1.setViewportView(txttrangthai);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ch???n ???nh"));

        lblhinh.setText("Click Ch???n ???nh");
        lblhinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblhinhMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblhinh, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblhinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        txtgiaban.setBorder(javax.swing.BorderFactory.createTitledBorder("Gi?? B??n"));

        txttensp.setBorder(javax.swing.BorderFactory.createTitledBorder("T??n S???n Ph???m"));

        txtmasp.setBorder(javax.swing.BorderFactory.createTitledBorder("M?? S???n Ph???m"));

        cboMaLoai.setBorder(javax.swing.BorderFactory.createTitledBorder("M?? Lo???i S???n Ph???m"));
        cboMaLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMaLoaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtgiaban)
                        .addGap(32, 32, 32)
                        .addComponent(txtgianhap, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cboMaLoai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtmasp, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttensp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtanh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 120, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(507, 507, 507)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(120, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmasp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttensp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboMaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtgiaban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtgianhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(181, Short.MAX_VALUE)))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add.png"))); // NOI18N
        jButton1.setText("Th??m");
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

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Log out.png"))); // NOI18N
        jButton3.setText("Tho??t");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("C???u H??nh Chi Ti???t"));

        txtpin.setBorder(javax.swing.BorderFactory.createTitledBorder("Pin"));

        txtcpu.setBorder(javax.swing.BorderFactory.createTitledBorder("CPU"));

        txtram.setBorder(javax.swing.BorderFactory.createTitledBorder("Ram"));

        txtvo.setBorder(javax.swing.BorderFactory.createTitledBorder("V???"));

        txtbonho.setBorder(javax.swing.BorderFactory.createTitledBorder("B??? Nh???"));

        txtcamera.setBorder(javax.swing.BorderFactory.createTitledBorder("Camera"));

        txtkhac.setBorder(javax.swing.BorderFactory.createTitledBorder("Chi Ti???t Kh??c"));

        txtmanhinh.setBorder(javax.swing.BorderFactory.createTitledBorder("M??n H??nh"));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtram, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(txtpin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbonho, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmanhinh, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtcamera, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtkhac, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtvo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcpu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbonho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcamera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtvo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmanhinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtkhac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblhinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblhinhMouseClicked
        // TODO add your handling code here:
        try {
            //d??ng jfilechooer l???y ???????ng ?????n ?????c ghi
            JFileChooser jc = new JFileChooser();
            int chon = jc.showOpenDialog(null);
            if (chon == JFileChooser.APPROVE_OPTION) {
                File file = jc.getSelectedFile();
                String fullpath = file.getAbsolutePath();
                loadanh = jc.getSelectedFile().getName();
                hinh(fullpath);
                Path src = Paths.get(fullpath);
                Path desl = Paths.get("src\\img\\" + loadanh);
                Files.copy(src, desl, StandardCopyOption.REPLACE_EXISTING);
                txtanh.setText(loadanh);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "l???i ");
        }
    }//GEN-LAST:event_lblhinhMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            if(check()){
            laydl();
        DAO_QLSP.Insert(n);
        DAO_CTSP.Insert(m);
        dispose();
       }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Th??m th??nh c??ng");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.clear();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        sanpham1 sp = new sanpham1();
        sp.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void cboMaLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMaLoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboMaLoaiActionPerformed
    public void hinh(String hinh) {
        ImageIcon img = new ImageIcon("src\\img\\" + hinh);
        Image im = img.getImage();
        ImageIcon icon = new ImageIcon(im.getScaledInstance(lblhinh.getWidth(), lblhinh.getHeight(), im.SCALE_SMOOTH));
        lblhinh.setIcon(icon);
    }

    public void clear() {
        txtgiaban.setText("");
        cboMaLoai.setSelectedIndex(0);
        txtmasp.setText("");
        txttrangthai.setText("");
        txttensp.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboMaLoai;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblhinh;
    private javax.swing.JTextField txtanh;
    private javax.swing.JTextField txtbonho;
    private javax.swing.JTextField txtcamera;
    private javax.swing.JTextField txtcpu;
    private javax.swing.JTextField txtgiaban;
    private javax.swing.JTextField txtgianhap;
    private javax.swing.JTextField txtkhac;
    private javax.swing.JTextField txtmanhinh;
    private javax.swing.JTextField txtmasp;
    private javax.swing.JTextField txtpin;
    private javax.swing.JTextField txtram;
    private javax.swing.JTextField txttensp;
    private javax.swing.JTextArea txttrangthai;
    private javax.swing.JTextField txtvo;
    // End of variables declaration//GEN-END:variables

    private void laydl() {
        n.setMasp(txtmasp.getText());
        n.setMaloai(cboMaLoai.getSelectedItem().toString());
        n.setTensp(txttensp.getText());
        n.setMota(txttrangthai.getText());
        n.setGiaban(Float.valueOf(txtgiaban.getText()));
        n.setGianhap(Float.valueOf(txtgianhap.getText()));
        n.setHinhanh(txtanh.getText());
       m.setBonho(txtbonho.getText());
        m.setMasp(txtmasp.getText());
        m.setRam(txtram.getText());
        m.setManhinh(txtmanhinh.getText());
        m.setPin(txtpin.getText());
        m.setVo(txtvo.getText());
        m.setCpu(txtcpu.getText());
        m.setKhac(txtkhac.getText());
        m.setCamera(txtcamera.getText());
    }

    private void loadMaLoai() {
        try {
            String sql = "SELECT malsp FROM dbo.loaisanpham";
            
            ResultSet rs = KetNoi.Select(sql);

            while (rs.next()) {
                cboMaLoai.addItem(rs.getString(1));

            }

        } catch (Exception e) {
        }
    }
    private boolean check(){
        try {
             try {
            if(txtbonho.getText().equals("") || txtcamera.getText().equals("") || txtcpu.getText().equals("") ||
                    txtgiaban.getText().equals("") || txtgianhap.getText().equals("") || txtmanhinh.getText().equals("") ||
                    txtmasp.getText().equals("") || txtpin.getText().equals("") || txtram.getText().equals("") || txtvo.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Nh???p ?????y ????? th??ng tin");
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if(Float.parseFloat(txtgiaban.getText()) < 0){
                JOptionPane.showMessageDialog(this, "Gi?? b??n ph???i l???n h??n 0");
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if(Float.parseFloat(txtgianhap.getText()) < 0){
                JOptionPane.showMessageDialog(this, "Gi?? nh???p ph???i l???n h??n 0");
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Th??m th???t b???i");
        }
        return true;
    }
}
