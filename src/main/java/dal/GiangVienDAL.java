

package dal;

import bll.Helpers;
import dto.GiangVien;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

public class GiangVienDAL {
    private Database database;
    public ArrayList<GiangVien> getList() {
        database = new Database();
        ArrayList<GiangVien> danhSachGiangVien = new ArrayList<>();
        try {
            ResultSet resultSet = database.sqlQuery("SELECT * FROM `GiangVien`");
            if (resultSet!=null)
            {
                while (resultSet.next())
                {
                    String idGiangVien = resultSet.getString("idGiangVien");
                    String ho = resultSet.getString("Ho");
                    String ten = resultSet.getString("Ten");
                    Date ngaySinh = resultSet.getDate("NgaySinh");
                    int gioiTinh = resultSet.getInt("GioiTinh");
                    String sdt = resultSet.getString("SDT");
                    String diaChi = resultSet.getString("DiaChi");
                    int luong=resultSet.getInt("Luong");
                    danhSachGiangVien.add(new GiangVien(idGiangVien, ho, ten, diaChi, sdt,  gioiTinh, luong, ngaySinh));
                }
            }
        }catch (Exception e)
        {
            e.printStackTrace();
            return null;
        } finally {
            database.closeConnect();
        }
        return danhSachGiangVien;
    }
    public boolean add(GiangVien giangVien)
    {
        database = new Database();
        boolean result = database.sqlUpdate("INSERT INTO `giangvien`(`IdGiangVien`, `Ho`, `Ten`, `NgaySinh`, `GioiTinh`, `SDT`, `DiaChi`, `Luong`) VALUES " +
                "('" + giangVien.getIdGiangVien() +
                "','" + giangVien.getHoGV() +
                "','" + giangVien.getTenGV() + "'," +
                "'" + Helpers.formatDate(giangVien.getNgaySinh()) +
                "','" + giangVien.getGioiTinh() +
                "','" + giangVien.getSDT() +
                "','" + giangVien.getDiaChi() +
                "','" + giangVien.getLuong() + "')");
        database.closeConnect();

        return result;
    }
    public boolean remove(String idGiangVien)
    {
        database = new Database();
        boolean result = database.sqlUpdate("DELETE FROM `giangvien` WHERE IdGiangVien = '" + idGiangVien+"'");
        database.closeConnect();
        return result;
    }
    public boolean update(GiangVien giangVien)
    {
        database = new Database();
        String sql = String.format("UPDATE `giangvien` SET `Ho`='%s',`Ten`='%s',`NgaySinh`='%s',`GioiTinh`='%s',`SDT`='%s',`DiaChi`='%s',`Luong`='%s' WHERE idGiangVien = '%s' ", giangVien.getHoGV(),
                giangVien.getTenGV(), Helpers.formatDate(giangVien.getNgaySinh()), giangVien.getGioiTinh(), giangVien.getSDT(), giangVien.getDiaChi(), giangVien.getLuong(), giangVien.getIdGiangVien());
        boolean result = database.sqlUpdate(sql);
        database.closeConnect();
        return result;
    }
}
