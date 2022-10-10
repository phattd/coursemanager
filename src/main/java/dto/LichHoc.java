package dto;

import java.util.Date;

public class LichHoc {
    private  String idGiangVien, idKhoaHoc, idPhong, thu;
    private int caHoc;

    public LichHoc() {}
    public LichHoc(String idGiangVien, String idKhoaHoc, String idPhong, String thu, int caHoc) {
        this.idGiangVien = idGiangVien;
        this.idKhoaHoc = idKhoaHoc;
        this.idPhong = idPhong;
        this.thu = thu;
        this.caHoc = caHoc;
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

    public String getThu() {
        return thu;
    }

    public void setThu(String thu) {
        this.thu = thu;
    }

    public int getCaHoc() {
        return caHoc;
    }

    public void setCaHoc(int caHoc) {
        this.caHoc = caHoc;
    }
    public Object[] parseArray() {
        return  new Object[] { idKhoaHoc, idGiangVien,idPhong, thu, caHoc};
    }

    @Override
    public String toString() {
        return "LichHoc{" +
                "idGiangVien='" + idGiangVien + '\'' +
                ", idKhoaHoc='" + idKhoaHoc + '\'' +
                ", idPhong='" + idPhong + '\'' +
                ", thu='" + thu + '\'' +
                ", caHoc=" + caHoc +
                '}';
    }
}
