/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLLT.DAO;

import Ketnoi.KetNoi;
import QLLT.classs.QLSP;
import QLLT.classs.piceFormatter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vinh
 */
public class DAO_QLSP {
     public static void dolentable(JTable tblsp, long trang) {
        try {
            String sql = "SELECT TOP 10 *\n"
                    + "FROM dbo.sanpham \n"
                    + "WHERE masp NOT IN (SELECT TOP " + (trang * 5 - 5) + " masp FROM dbo.sanpham)";
            DefaultTableModel model = (DefaultTableModel) tblsp.getModel();
            ResultSet rs = KetNoi.Select(sql);
            Vector v = null;
            model.setRowCount(0);
            while (rs.next()) {
                v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(piceFormatter.format(rs.getFloat(4)));
                v.add(piceFormatter.format(rs.getFloat(5)));
                v.add(rs.getInt(6));
                v.add(rs.getString(7));
                v.add(rs.getString(8));
                model.addRow(v);

            }
            tblsp.setModel(model);
        } catch (Exception e) {
        }

    }

    public static void Insert(QLSP n) {
        try {
            String sql = "insert into sanpham(masp , tensp ,malsp , giaban , gianhap , soluong ,hinhanh , mota) \n"
                    + "values(N'" + n.getMasp() + "'"
                    + ",N'" + n.getTensp()+ "'"
                    + ",N'" + n.getMaloai()+ "'"
                    + ",N'" + n.getGiaban()+ "'"
                    + ",N'" + n.getGianhap()+ "'"
                    + ",'" + n.getSoluong()+ "'"
                    + ",N'" + n.getHinhanh()+ "'"
                    + ",N'" + n.getMota()+ "')";
            if (Ketnoi.KetNoi.Update2(sql) > 0) {
                System.out.println("Th??m m???i th??nh c??ng");
            } else {
                System.out.println("Th???t b???i");
            }

        } catch (Exception ex) {

        }
    }
    public static void Delete(QLSP n) {
        try {
            String sql = "delete from sanpham\n"
                    + "where masp = N'" + n.getMasp()+ "'";

            if (Ketnoi.KetNoi.Update(sql) > 0) {

            } else {
                System.out.println("Th???t b???i");
            }

        } catch (Exception e) {
        }

    }
        public static void DeleteCTSP(QLSP n) {
        try {
            String sql = "delete from chitietsanpham\n"
                    + "where masp = N'" + n.getMasp()+ "'";

            if (Ketnoi.KetNoi.Update(sql) > 0) {

            } else {
                System.out.println("Th???t b???i");
            }

        } catch (Exception e) {
        }

    }

    public static void update(QLSP n) {
        try {
            String sql = "update sanpham\n"
                    + "set tensp = N'" + n.getTensp()+ "'"
                    + ",malsp = '" + n.getMaloai()+ "'"
                    + ",giaban=N'" + n.getGiaban()+ "'"
                    + ",gianhap=N'" + n.getGianhap()+ "'"
                    + ",hinhanh=N'" + n.getHinhanh()+ "'"
                      + ",mota=N'" + n.getMota()+ "'"
                    + "where masp = '" + n.getMasp()+ "'";
            if (Ketnoi.KetNoi.Update(sql) > 0) {
                System.out.println("C???p nh???t th??nh c??ng");
            } else {
                System.out.println("Th???t b???i");
            }

        } catch (Exception e) {
        }

    }
     public static  void TimKiemSP(QLSP n,JTable tblsp) throws SQLException {
        String sql = "";
        sql = "select * from sanpham\n"
                    + "where tensp like N'%" + n.getTim()+ "%'"
                + "or masp like N'%" + n.getTim()+ "%'"
                + "or tensp like N'%" + n.getTim()+ "%'"
                + "or malsp like N'%" + n.getTim()+ "%'"
                + "or giaban like N'%" + n.getTim()+ "%'"
                + "or soluong like N'%" + n.getTim()+ "%'"
                + "or hinhanh like N'%" + n.getTim()+ "%'"
                + "or mota like N'%\" + n.getTim()+ \"%'";
                    
        ResultSet rs = KetNoi.Select(sql);
           DefaultTableModel model = (DefaultTableModel) tblsp.getModel();
        Vector v = null;
            model.setRowCount(0);
            while (rs.next()) {
                v = new Vector();
              v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(piceFormatter.format(rs.getFloat(4)));
                v.add(piceFormatter.format(rs.getFloat(5)));
                v.add(rs.getInt(6));
                v.add(rs.getString(7));
                v.add(rs.getString(8));
      
            
                model.addRow(v);
            }
            tblsp.setModel(model);
        }

    
}
