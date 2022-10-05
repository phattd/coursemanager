package dal;

import dto.DiemSo;
import resoure.type.Message;

import javax.swing.*;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DiemSoDAL {
    private Database database;
    public ArrayList<DiemSo> getList() {
        Database.getInstance();
        ArrayList<DiemSo> danhSachDiemSo = new ArrayList<>();
        try {
            ResultSet resultSet = database.sqlQuery("SELECT * FROM `DiemSo`");
            if (resultSet!=null)
            {
                while (resultSet.next())
                {
                    String idKhoaHoc = resultSet.getString("idKhoaHoc");
                    String idHocVien = resultSet.getString("idHocVien");
                    int diem=resultSet.getInt("Diem");
                    danhSachDiemSo.add(new DiemSo(idKhoaHoc, idHocVien, diem));
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
        Database.getInstance();
        boolean result = database.sqlUpdate("INSERT INTO `diem`(`IdHocVien`, `IdKhoaHoc`, `Diem`) VALUES ('"+diemSo.getIdHocVien()+"','"+diemSo.getIdKhoaHoc()+"','"+diemSo.getDiem()+"')");
        database.closeConnect();

        return result;
    }
    public boolean remove(String idKhoaHoc,String idHocVien)
    {
        Database.getInstance();
        boolean result = database.sqlUpdate("DELETE FROM `diem` WHERE idKhoaHoc='"+idKhoaHoc+"' AND idHocVien='"+idHocVien+"' ");
        database.closeConnect();

        return result;
    }
    public boolean update(DiemSo diemSo)
    {
        Database.getInstance();
        boolean result = database.sqlUpdate("UPDATE `diem` SET `Diem`='"+diemSo.getDiem()+"' WHERE `IdHocVien`='"+diemSo.getIdHocVien()+"' AND `IdKhoaHoc`='"+diemSo.getIdKhoaHoc()+"'");
        database.closeConnect();
        return result;
    }

}
