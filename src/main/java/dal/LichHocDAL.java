/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package dal;

import bll.Helpers;
import dto.LichHoc;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

public class LichHocDAL {
    private Database database;
    public ArrayList<LichHoc> getList() {
        database  = new Database();
        ArrayList<LichHoc> danhSachLichHoc = new ArrayList<>();
        try {
            ResultSet resultSet = database.sqlQuery("SELECT * FROM `LichHoc`");
            if (resultSet!=null)
            {
                while (resultSet.next())
                {
                    String idGiangVien = resultSet.getString("IdGiangVien");
                    String idKhoaHoc = resultSet.getString("IdKhoaHoc");
                    String idPhong = resultSet.getString("IdPhong");
                    String thu = resultSet.getString("Thu");
                    int caHoc = resultSet.getInt("CaHoc");


                    danhSachLichHoc.add(new LichHoc(idGiangVien, idKhoaHoc, idPhong, thu, caHoc));
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
        database  = new Database();
        String sql = String.format("INSERT INTO `lichhoc`(`IdKhoaHoc`, `IdPhong`, `IdGiangVien`, `Thu`, `CaHoc`) VALUES ('%s','%s','%s','%s','%s')", lichHoc.getIdKhoaHoc(),
                lichHoc.getIdPhong(), lichHoc.getIdGiangVien(), lichHoc.getThu(), lichHoc.getCaHoc());
        boolean result = database.sqlUpdate(sql);
        database.closeConnect();

        return result;
    }
    public boolean remove(String idKhoaHoc, String idPhong, String idGiangVien)
    {
        database  = new Database();
        boolean result = database.sqlUpdate("DELETE FROM `lichhoc` WHERE IdGiangVien = '" + idGiangVien+ "'AND IdPhong = '"+
               idPhong +"' AND IdKhoaHoc ='" + idKhoaHoc + "'");
        database.closeConnect();
        return result;
    }
    public boolean update(LichHoc lichHoc)
    {
        database  = new Database();
        String sql = String.format("UPDATE `lichhoc` SET `Thu`='%s',`CaHoc`='%s' WHERE `IdKhoaHoc`='%s' AND `IdPhong`='%s' AND `IdGiangVien`='%s'",
                lichHoc.getThu(), lichHoc.getCaHoc(), lichHoc.getIdKhoaHoc(), lichHoc.getIdPhong(), lichHoc.getIdGiangVien());
        boolean result = database.sqlUpdate(sql);
        database.closeConnect();
        return result;
    }
}
