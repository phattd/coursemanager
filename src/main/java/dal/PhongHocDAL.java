/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package dal;

import dto.PhongHoc;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

public class PhongHocDAL {
    private Database database;
    public ArrayList<PhongHoc> getList() {
        Database.getInstance();
        ArrayList<PhongHoc> danhSachPhongHoc = new ArrayList<>();
        try {
            ResultSet resultSet = database.sqlQuery("SELECT * FROM `PhongHoc`");
            if (resultSet!=null)
            {
                while (resultSet.next())
                {


                    String idPhong = resultSet.getString("idPhongHoc");
                    String tenPhong = resultSet.getString("TenPhongHoc");
                    String toaNha = resultSet.getString("ToaNha");
                    String diaChi = resultSet.getString("DiaChi");



                    danhSachPhongHoc.add(new PhongHoc(idPhong, tenPhong, toaNha, diaChi));
                }
            }
        }catch (Exception e)
        {
            e.printStackTrace();
            return null;
        } finally {
            database.closeConnect();
        }
        return danhSachPhongHoc;
    }
    public boolean add(PhongHoc phongHoc)
    {
        Database.getInstance();
        String sql = String.format("INSERT INTO `phonghoc`(`IdPhongHoc`, `TenPhongHoc`, `ToaNha`, `DiaChi`) VALUES ('%s','%s','%s','%s')",
                phongHoc.getIdPhongHoc(), phongHoc.getTenPhongHoc(), phongHoc.getToaNha(), phongHoc.getDiaChi());
        boolean result = database.sqlUpdate(sql);
        database.closeConnect();

        return result;
    }
    public boolean remove(String idPhongHoc)
    {
        Database.getInstance();
        boolean result = database.sqlUpdate("DELETE FROM `phonghoc` WHERE idPhongHoc = " + idPhongHoc);
        database.closeConnect();
        return result;
    }
    public boolean update(PhongHoc phongHoc)
    {
        Database.getInstance();
        String sql = String.format("UPDATE `phonghoc` SET `TenPhongHoc`='%s',`ToaNha`='%s',`DiaChi`='%s' WHERE `IdPhongHoc`='%s'",
                phongHoc.getTenPhongHoc(), phongHoc.getToaNha(), phongHoc.getDiaChi(), phongHoc.getIdPhongHoc());
        boolean result = database.sqlUpdate(sql);
        database.closeConnect();
        return result;
    }
}
