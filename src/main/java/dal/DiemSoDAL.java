package dal;

import bll.Helpers;
import dto.DiemSo;
import resoure.type.Message;

import javax.swing.*;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DiemSoDAL {
    private Database database;
    public ArrayList<DiemSo> getList() {
        database  = new Database();
        ArrayList<DiemSo> danhSachDiemSo = new ArrayList<>();
        try {
            ResultSet resultSet = database.sqlQuery("SELECT * FROM `Diem`");
            if (resultSet!=null)
            {
                while (resultSet.next())
                {
                    String idHocVien = resultSet.getString("idHocVien");
                    String idKhoaHoc = resultSet.getString("idKhoaHoc");
                    int diemGK1 = resultSet.getInt("DiemGiuaKi1");
                    int diemGK2 = resultSet.getInt("DiemGiuaKi2");
                    int diemThi = resultSet.getInt("DiemThi");
                    float diemKT = resultSet.getFloat("DiemKetThuc");
                    danhSachDiemSo.add(new DiemSo(idHocVien, idKhoaHoc, diemGK1, diemGK2, diemThi, diemKT));
                }
            }
        }catch (Exception e)
        {
            e.printStackTrace();
            return null;
        } finally {
            database.closeConnect();
        }
        return danhSachDiemSo;
    }
    public boolean add(DiemSo diemSo)
    {
        database  = new Database();
        String sql = String.format("INSERT INTO `diem`(`IdHocVien`, `IdKhoaHoc`, " +
                        "`DiemGiuaKi1`, `DiemGiuaKi2`, `DiemThi`, `DiemKetThuc`) " +
                        "VALUES ('%s','%s','%s','%s','%s','%s')",
                diemSo.getIdHocVien(), diemSo.getIdKhoaHoc(), diemSo.getDiemGiuaKi1(),
                diemSo.getDiemGiuaKi2(), diemSo.getdiemThi(), diemSo.getDiemKetThuc());
        boolean result = database.sqlUpdate(sql);
        database.closeConnect();

        return result;
    }
    public boolean remove(String idKhoaHoc,String idHocVien)
    {
        database  = new Database();
        boolean result = database.sqlUpdate("DELETE FROM `diem` WHERE idKhoaHoc='"+idKhoaHoc+"' AND idHocVien='"+idHocVien+"' ");
        database.closeConnect();

        return result;
    }
    public boolean update(DiemSo diemSo)
    {
        database  = new Database();
        String sql = String.format("UPDATE `diem` SET `DiemGiuaKi1`='%s', `DiemGiuaKi2`='%s',`DiemThi`='%s',`DiemKetThuc`='%s' WHERE `IdHocVien`='%s' AND `IdKhoaHoc`='%s'", diemSo.getDiemGiuaKi1(),diemSo.getDiemGiuaKi2(), diemSo.getdiemThi(), diemSo.getDiemKetThuc(), diemSo.getIdHocVien(), diemSo.getIdKhoaHoc());
        boolean result = database.sqlUpdate(sql);
        database.closeConnect();
        return result;
    }

}
