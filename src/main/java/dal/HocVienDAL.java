

package dal;

import bll.Helpers;
import dto.HocVien;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

public class HocVienDAL {
    private Database database;
    public ArrayList<HocVien> getList() {
        database  = new Database();
        ArrayList<HocVien> danhSachHocVien = new ArrayList<>();
        try {
            ResultSet resultSet = database.sqlQuery("SELECT * FROM `HocVien`");
            if (resultSet!=null)
            {
                while (resultSet.next())
                {
                    String idHocVien = resultSet.getString("idHocVien");
                    String ho = resultSet.getString("HoHV");
                    String ten = resultSet.getString("TenHV");
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
        database  = new Database();
        String sql = String.format("INSERT INTO `hocvien`(`IdHocVien`, `HoHV`, `TenHV`, `NgaySinh`, `GioiTinh`, `SDT`, `DiaChi`) VALUES ('%s','%s','%s','%s','%s','%s','%s')", hocVien.getIdHocVien(),
                hocVien.getHoHV(), hocVien.getTenHV(), Helpers.formatDate(hocVien.getNgaySinh()), hocVien.getGioiTinh(), hocVien.getSDT(), hocVien.getDiaChi());
        boolean result = database.sqlUpdate(sql);
        database.closeConnect();

        return result;
    }
    public boolean remove(String idHocVien)
    {
        database  = new Database();
        boolean result = database.sqlUpdate("DELETE FROM `hocvien` WHERE IdHocVien = '" + idHocVien +"'");
        database.closeConnect();
        return result;
    }
    public boolean update(HocVien hocVien)
    {
        database  = new Database();
        String sql = String.format("UPDATE `hocvien` SET `HoHV`='%s',`TenHV`='%s',`NgaySinh`='%s',`GioiTinh`='%s',`SDT`='%s',`DiaChi`='%s' WHERE idHocVien = '%s' ", hocVien.getHoHV(),
                hocVien.getTenHV(),Helpers.formatDate( hocVien.getNgaySinh()), hocVien.getGioiTinh(), hocVien.getSDT(), hocVien.getDiaChi(), hocVien.getIdHocVien());
        boolean result = database.sqlUpdate(sql);
        database.closeConnect();
        return result;
    }
}
