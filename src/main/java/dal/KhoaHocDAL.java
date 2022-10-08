/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package dal;

import bll.Helpers;
import dto.KhoaHoc;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

public class KhoaHocDAL {
    private Database database;
    public ArrayList<KhoaHoc> getList() {
        database = new Database();
        ArrayList<KhoaHoc> danhSachKhoaHoc = new ArrayList<>();
        try {
            ResultSet resultSet = database.sqlQuery("SELECT * FROM `KhoaHoc`");
            if (resultSet!=null)
            {
                while (resultSet.next())
                {
                    String idKhoaHoc = resultSet.getString("idKhoaHoc");
                    String tenKhoaHoc = resultSet.getString("TenKhoaHoc");
                    Date ngayBD = resultSet.getDate("ThoiGianBatDau");
                    Date ngayKT = resultSet.getDate("ThoiGianKetThuc");
                    int gia = resultSet.getInt("Gia");

                    danhSachKhoaHoc.add(new KhoaHoc(idKhoaHoc, tenKhoaHoc, ngayBD, ngayKT, gia));
                }
            }
        }catch (Exception e)
        {
            e.printStackTrace();
            return null;
        } finally {
            database.closeConnect();
        }
        return danhSachKhoaHoc;
    }
    public boolean add(KhoaHoc khoaHoc)
    {
        database = new Database();
        String sql = String.format("INSERT INTO `khoahoc`(`IdKhoaHoc`, `TenKhoaHoc`, `ThoiGianBatDau`, `ThoiGianKetThuc`, `Gia`) VALUES ('%s','%s','%s','%s','%s')", khoaHoc.getIdKhoaHoc(),
                khoaHoc.getTenKhoaHoc(), Helpers.formatDate(khoaHoc.getThoiGianBatDau()), Helpers.formatDate(khoaHoc.getThoiGianKetThuc()), khoaHoc.getGia());

        boolean result = database.sqlUpdate(sql);
        database.closeConnect();

        return result;
    }
    public boolean remove(String idKhoaHoc)
    {
        database = new Database();
        boolean result = database.sqlUpdate("DELETE FROM `khoahoc` WHERE IdKhoaHoc = '" + idKhoaHoc +"'");
        database.closeConnect();
        return result;
    }
    public boolean update(KhoaHoc khoaHoc)
    {
        database = new Database();
        String sql = String.format("UPDATE `khoahoc` SET `TenKhoaHoc`='%s',`ThoiGianBatDau`='%s',`ThoiGianKetThuc`='%s',`Gia`='%s' WHERE idKhoaHoc = '%s' ",
                khoaHoc.getTenKhoaHoc(), Helpers.formatDate(khoaHoc.getThoiGianBatDau()), Helpers.formatDate(khoaHoc.getThoiGianKetThuc()), khoaHoc.getGia(), khoaHoc.getIdKhoaHoc());
        boolean result = database.sqlUpdate(sql);
        database.closeConnect();
        return result;
    }
}
