/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package dal;

import dto.HocVien;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

public class HocVienDAL {
    private Database database;
    public ArrayList<HocVien> getList() {
        Database.getInstance();
        ArrayList<HocVien> danhSachHocVien = new ArrayList<>();
        try {
            ResultSet resultSet = database.sqlQuery("SELECT * FROM `HocVien`");
            if (resultSet!=null)
            {
                while (resultSet.next())
                {
                    String idHocVien = resultSet.getString("idHocVien");
                    String ho = resultSet.getString("Ho");
                    String ten = resultSet.getString("Ten");
                    Date ngaySinh = resultSet.getDate("NgaySinh");
                    int gioiTinh = resultSet.getInt("GioiTinh");
                    String sdt = resultSet.getString("SDT");
                    String diaChi = resultSet.getString("DiaChi");
                    danhSachHocVien.add(new HocVien(idHocVien, ho, ten, diaChi, sdt,  gioiTinh, ngaySinh));
                }
            }
        }catch (Exception e)
        {
            e.printStackTrace();
            return null;
        } finally {
            database.closeConnect();
        }
        return danhSachHocVien;
    }
    public boolean add(HocVien hocVien)
    {
        Database.getInstance();
        String sql = String.format("INSERT INTO `hocvien`(`IdHocVien`, `HoHV`, `TenHV`, `NgaySinh`, `GioiTinh`, `SDT`, `DiaChi`) VALUES ('%s','%s','%s','%s','%s','%s','%s')", hocVien.getIdHocVien(),
                hocVien.getHoHV(), hocVien.getTenHV(), hocVien.getNgaySinh(), hocVien.getGioiTinh(), hocVien.getSDT(), hocVien.getDiaChi());
        boolean result = database.sqlUpdate(sql);
        database.closeConnect();

        return result;
    }
    public boolean remove(String idKhoaHoc,String idHocVien)
    {
        Database.getInstance();
        boolean result = database.sqlUpdate("DELETE FROM `hocvien` WHERE idHocVien = " + idHocVien);
        database.closeConnect();
        return result;
    }
    public boolean update(HocVien hocVien)
    {
        Database.getInstance();
        String sql = String.format("UPDATE `hocvien` SET `Ho`='%s',`Ten`='%s',`NgaySinh`='%s',`GioiTinh`='%s',`SDT`='%s',`DiaChi`='%s' WHERE idHocVien = '%s' ", hocVien.getHoHV(),
                hocVien.getTenHV(), hocVien.getNgaySinh(), hocVien.getGioiTinh(), hocVien.getSDT(), hocVien.getDiaChi(), hocVien.getIdHocVien());
        boolean result = database.sqlUpdate(sql);
        database.closeConnect();
        return result;
    }
}
