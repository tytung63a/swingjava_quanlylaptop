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
            String sql = "SELECT TOP 5 *\n"
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
                System.out.println("Thêm mới thành công");
            } else {
                System.out.println("Thất bại");
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
                System.out.println("Thất bại");
            }

        } catch (Exception e) {
        }

    }

//    public static void update(QLSP n) {
//        try {
//            String sql = "update taikhoan\n"
//                    + "set tentaikhoan = N'" + n.getTentk() + "'"
//                    + ",matkhau = '" + n.getMk() + "'"
//                    + ",maquyen=N'" + n.getMaquyen() + "'"
//                    + "where masp = '" + n.getManv() + "'";
//            if (Ketnoi.KetNoi.Update(sql) > 0) {
//                System.out.println("Cập nhật thành công");
//            } else {
//                System.out.println("Thất bại");
//            }
//
//        } catch (Exception e) {
//        }
//
//    }

    public static void TimKiemnhanvien(QLSP n, JTable tbltk) throws SQLException {
        String sql = "";

        sql = "select * from taikhoan\n"
                + "where tentaikhoan like N'%" + n.getTim() + "%'"
                + "or matkhau like N'%" + n.getTim() + "%'"
                + "or manv like N'%" + n.getTim() + "%'"
                + "or maquyen like N'%" + n.getTim() + "%'";
        ResultSet rs = KetNoi.Select(sql);
        DefaultTableModel model = (DefaultTableModel) tbltk.getModel();
        Vector v = null;
        model.setRowCount(0);
        while (rs.next()) {
            v = new Vector();
            v.add(rs.getString(1));
            v.add(rs.getString(2));
            v.add(rs.getString(3));
            v.add(rs.getString(4));

            model.addRow(v);
        }
        tbltk.setModel(model);
    }
}