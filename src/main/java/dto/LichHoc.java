package dto;

import java.util.Date;

public class LichHoc {
    private  String idGiangVien, idKhoaHoc, idPhong;
    private Date ngay;
    private int tietBatDau, tietKetThuc, thuThu;

    public LichHoc(String idGiangVien, String idKhoaHoc, String idPhong, Date ngay, int tietBatDau, int tietKetThuc, int thuThu) {
        this.idGiangVien = idGiangVien;
        this.idKhoaHoc = idKhoaHoc;
        this.idPhong = idPhong;
        this.ngay = ngay;
        this.tietBatDau = tietBatDau;
        this.tietKetThuc = tietKetThuc;
        this.thuThu = thuThu;
    }

    public LichHoc() {
    }

    public String getIdGiangVien() {
        return idGiangVien;
    }

    public void setIdGiangVien(String idGiangVien) {
        this.idGiangVien = idGiangVien;
    }

    public String getIdKhoaHoc() {
        return idKhoaHoc;
    }

    public void setIdKhoaHoc(String idKhoaHoc) {
        this.idKhoaHoc = idKhoaHoc;
    }

    public String getIdPhong() {
        return idPhong;
    }

    public void setIdPhong(String idPhong) {
        this.idPhong = idPhong;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public int getTietBatDau() {
        return tietBatDau;
    }

    public void setTietBatDau(int tietBatDau) {
        this.tietBatDau = tietBatDau;
    }

    public int getTietKetThuc() {
        return tietKetThuc;
    }

    public void setTietKetThuc(int tietKetThuc) {
        this.tietKetThuc = tietKetThuc;
    }

    public int getThuThu() {
        return thuThu;
    }

    public void setThuThu(int thuThu) {
        this.thuThu = thuThu;
    }
}
