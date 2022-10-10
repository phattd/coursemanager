package dto;

import java.util.Date;

public class KhoaHoc {
    private String idKhoaHoc, tenKhoaHoc;
    private Date thoiGianBatDau, thoiGianKetThuc;
    private int gia;

    public KhoaHoc() {}
    public KhoaHoc(String idKhoaHoc, String tenKhoaHoc, Date thoiGianBatDau, Date thoiGianKetThuc, int gia) {
        this.idKhoaHoc = idKhoaHoc;
        this.tenKhoaHoc = tenKhoaHoc;
        this.thoiGianBatDau = thoiGianBatDau;
        this.thoiGianKetThuc = thoiGianKetThuc;
        this.gia = gia;
    }

    public String getIdKhoaHoc() {
        return idKhoaHoc;
    }

    public void setIdKhoaHoc(String idKhoaHoc) {
        this.idKhoaHoc = idKhoaHoc;
    }

    public String getTenKhoaHoc() {
        return tenKhoaHoc;
    }

    public void setTenKhoaHoc(String tenKhoaHoc) {
        this.tenKhoaHoc = tenKhoaHoc;
    }

    public Date getThoiGianBatDau() {
        return thoiGianBatDau;
    }

    public void setThoiGianBatDau(Date thoiGianBatDau) {
        this.thoiGianBatDau = thoiGianBatDau;
    }

    public Date getThoiGianKetThuc() {
        return thoiGianKetThuc;
    }

    public void setThoiGianKetThuc(Date thoiGianKetThuc) {
        this.thoiGianKetThuc = thoiGianKetThuc;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
    public Object[] parseArrayLite() {
        return new Object[] { idKhoaHoc,  tenKhoaHoc, thoiGianBatDau};
    }
    public Object[] parseArray() {
        return new Object[] { idKhoaHoc,  tenKhoaHoc, thoiGianBatDau, thoiGianKetThuc, gia};
    }

    @Override
    public String toString() {
        return "KhoaHoc{" +
                "idKhoaHoc='" + idKhoaHoc + '\'' +
                ", tenKhoaHoc='" + tenKhoaHoc + '\'' +
                ", thoiGianBatDau=" + thoiGianBatDau +
                ", thoiGianKetThuc=" + thoiGianKetThuc +
                ", gia=" + gia +
                '}';
    }
}
