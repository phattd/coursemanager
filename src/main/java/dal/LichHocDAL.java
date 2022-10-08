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
                    Date ngay = resultSet.getDate("Ngay");
                    int tietBD = resultSet.getInt("TietBatDau");
                    int tietKT = resultSet.getInt("TietKetThuc");
                    int thuTu = resultSet.getInt("ThuTu");


                    danhSachLichHoc.add(new LichHoc(idGiangVien, idKhoaHoc, idPhong, ngay, tietBD, tietKT, thuTu));
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
        String sql = String.format("INSERT INTO `lichhoc`(`IdKhoaHoc`, `IdPhong`, `IdGiangVien`, `TietBatDau`, `TietKetThuc`, `Ngay`, `ThuTu`) VALUES ('%s','%s','%s','%s','%s','%s','%s')", lichHoc.getIdKhoaHoc(),
                lichHoc.getIdPhong(), lichHoc.getIdGiangVien(), lichHoc.getTietBatDau(), lichHoc.getTietKetThuc(), Helpers.formatDate(lichHoc.getNgay()), lichHoc.getThuThu());
        boolean result = database.sqlUpdate(sql);
        database.closeConnect();

        return result;
    }
    public boolean remove(String idKhoaHoc, String idPhong, String idGiangVien)
    {
        database  = new Database();
        boolean result = database.sqlUpdate("DELETE FROM `khoahoc` WHERE idGiangVien = '" + idGiangVien+ "'AND idPhong = '"+
               idPhong +"' AND idKhoaHoc ='" + idKhoaHoc + "'");
        database.closeConnect();
        return result;
    }
    public boolean update(LichHoc lichHoc)
    {
        database  = new Database();
        String sql = String.format("UPDATE `lichhoc` SET `TietBatDau`='%s',`TietKetThuc`='%s',`Ngay`='%s',`ThuTu`='%s' WHERE `IdKhoaHoc`='%s' AND `IdPhong`='%s' AND `IdGiangVien`='%s'",
                lichHoc.getTietBatDau(), lichHoc.getTietKetThuc(),Helpers.formatDate(lichHoc.getNgay()), lichHoc.getThuThu(), lichHoc.getIdKhoaHoc(), lichHoc.getIdPhong(), lichHoc.getIdGiangVien());
        boolean result = database.sqlUpdate(sql);
        database.closeConnect();
        return result;
    }
}
