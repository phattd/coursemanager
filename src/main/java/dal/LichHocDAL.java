/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package dal;

import dto.LichHoc;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

public class LichHocDAL {
    private Database database;
    public ArrayList<LichHoc> getList() {
        Database.getInstance();
        ArrayList<LichHoc> danhSachLichHoc = new ArrayList<>();
        try {
            ResultSet resultSet = database.sqlQuery("SELECT * FROM `LichHoc`");
            if (resultSet!=null)
            {
                while (resultSet.next())
                {
                    String idGiangVien = resultSet.getString("idGiangVien");
                    String idKhoaHoc = resultSet.getString("idKhoaHoc");
                    String idPhong = resultSet.getString("idPhong");
                    Date ngay = resultSet.getDate("ngay");
                    int tiet = resultSet.getInt("tiet");


                    danhSachLichHoc.add(new LichHoc(idGiangVien, idKhoaHoc, idPhong, ngay, tiet));
                }
            }
        }catch (Exception e)
        {
            e.printStackTrace();
            return null;
        } finally {
            database.closeConnect();
        }
        return danhSachLichHoc;
    }
    public boolean add(LichHoc lichHoc)
    {
        Database.getInstance();
        String sql = String.format("INSERT INTO `lichhoc`(`IdGiangVien`, `IdKhoaHoc`, `IdPhong`, `Ngay`, `Tiet`) VALUES ('%s','%s','%s','%s','%s')",
                lichHoc.getIdGiangVien(), lichHoc.getIdKhoaHoc(), lichHoc.getIdPhong(),lichHoc.getNgay(), lichHoc.getTiet() );
        boolean result = database.sqlUpdate(sql);
        database.closeConnect();

        return result;
    }
    public boolean remove(String idKhoaHoc, String idPhong, String idGiangVien)
    {
        Database.getInstance();
        boolean result = database.sqlUpdate("DELETE FROM `khoahoc` WHERE idGiangVien = '" + idGiangVien+ "'AND idPhong = '"+
               idPhong +"' AND idKhoaHoc ='" + idKhoaHoc + "'");
        database.closeConnect();
        return result;
    }
    public boolean update(LichHoc lichHoc)
    {
        Database.getInstance();
        String sql = String.format("UPDATE `lichhoc` SET `Ngay`='%s',`Tiet`='%s' WHERE `IdGiangVien`='%s' AND `IdKhoaHoc`='%s' AND `IdPhong`='%s'",
                lichHoc.getNgay(), lichHoc.getTiet(), lichHoc.getIdKhoaHoc(), lichHoc.getIdKhoaHoc(), lichHoc.getIdPhong());
        boolean result = database.sqlUpdate(sql);
        database.closeConnect();
        return result;
    }
}
