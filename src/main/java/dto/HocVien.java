package dto;

import java.util.Date;

public class HocVien {
    private String idHocVien, hoHV, tenHV, diaChi, SDT;
    private int gioiTinh;
    private Date ngaySinh;

    public HocVien() {}
    public HocVien(String idHocVien, String hoHV, String tenHV, String diaChi, String SDT, int gioiTinh, Date ngaySinh) {
        this.idHocVien = idHocVien;
        this.hoHV = hoHV;
        this.tenHV = tenHV;
        this.diaChi = diaChi;
        this.SDT = SDT;
        this.setGioiTinh(gioiTinh);
        this.ngaySinh = ngaySinh;
    }

    public String getIdHocVien() {
        return idHocVien;
    }

    public void setIdHocVien(String idHocVien) {
        this.idHocVien = idHocVien;
    }

    public String getHoHV() {
        return hoHV;
    }

    public void setHoHV(String hoHV) {
        this.hoHV = hoHV;
    }

    public String getTenHV() {
        return tenHV;
    }

    public void setTenHV(String tenHV) {
        this.tenHV = tenHV;
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

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public Object[] parseArray() {
        return new Object[] {idHocVien,hoHV, tenHV, diaChi,SDT, gioiTinh, ngaySinh};
    }
}
