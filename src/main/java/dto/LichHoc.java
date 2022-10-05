package dto;

import java.util.Date;

public class LichHoc {
    private  String idGiangVien, idKhoaHoc, idPhong;
    private Date ngay;
    private int tiet;

    public LichHoc(String idGiangVien, String idKhoaHoc, String idPhong, Date ngay, int tiet) {
        this.idGiangVien = idGiangVien;
        this.idKhoaHoc = idKhoaHoc;
        this.idPhong = idPhong;
        this.ngay = ngay;
        this.tiet = tiet;
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

    public int getTiet() {
        return tiet;
    }

    public void setTiet(int tiet) {
        this.tiet = tiet;
    }
}
