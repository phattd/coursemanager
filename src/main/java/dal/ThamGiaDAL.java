/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package dal;

import dto.ThamGia;

import java.sql.ResultSet;
import java.util.ArrayList;

public class ThamGiaDAL {
    private Database database;
    public ArrayList<ThamGia> getList() {
        Database.getInstance();
        ArrayList<ThamGia> danhSachThamGia = new ArrayList<>();
        try {
            ResultSet resultSet = database.sqlQuery("SELECT * FROM `ThamGia`");
            if (resultSet!=null)
            {
                while (resultSet.next())
                {
                    String idKhoaHoc = resultSet.getString("idKhoaHoc");
                    String idHocVien = resultSet.getString("idHocVien");
                    danhSachThamGia.add(new ThamGia(idKhoaHoc, idHocVien));
                }
            }
        }catch (Exception e)
        {
            e.printStackTrace();
            return null;
        } finally {
            database.closeConnect();
        }
        return danhSachThamGia;
    }
    public boolean add(ThamGia thamGia)
    {
        Database.getInstance();
        String sql = String.format("INSERT INTO `thamgia`(`IdKhoaHoc`, `IdHocVien`) VALUES ('%s','%s')",
               thamGia.getIdKhoaHoc(), thamGia.getIdHocVien() );
        boolean result = database.sqlUpdate(sql);
        database.closeConnect();

        return result;
    }
    public boolean remove(ThamGia thamGia)
    {
        Database.getInstance();
        boolean result = database.sqlUpdate("DELETE FROM `thamgia` WHERE idKhoaHoc = '"+thamGia.getIdKhoaHoc()+"' AND idHocVien ='"+thamGia.getIdHocVien()+"' ");
        database.closeConnect();
        return result;
    }
    
}
