package dto;

import java.util.Date;

public class GiangVien {
    private String idGiangVien, hoGV, tenGV, diaChi, SDT;
    private int gioiTinh, luong;
    private Date ngaySinh;
    public GiangVien() {}

    public GiangVien(String idGiangVien, String hoGV, String tenGV, String diaChi, String SDT, int gioiTinh, int luong, Date ngaySinh) {
        this.idGiangVien = idGiangVien;
        this.hoGV = hoGV;
        this.tenGV = tenGV;
        this.diaChi = diaChi;
        this.SDT = SDT;
        this.setGioiTinh(gioiTinh);
        this.luong = luong;
        this.ngaySinh = ngaySinh;
    }

    public String getIdGiangVien() {
        return idGiangVien;
    }

    public void setIdGiangVien(String idGiangVien) {
        this.idGiangVien = idGiangVien;
    }

    public String getHoGV() {
        return hoGV;
    }

    public void setHoGV(String hoGV) {
        this.hoGV = hoGV;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        if (gioiTinh == 0) {
            this.gioiTinh = gioiTinh;
        } else {
            this.gioiTinh = 1;
        }
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public Object[] parseArray() {
        return new Object[] {idGiangVien, hoGV, tenGV, diaChi, SDT, gioiTinh, luong, ngaySinh};
    }
}
