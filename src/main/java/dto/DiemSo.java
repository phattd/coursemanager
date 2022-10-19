    /*Package*/
package dto;
    /*Import*/

public class DiemSo {
    /*Thuộc tính*/
    private String idHocVien, idKhoaHoc;
    private  int diemGiuaKi1, diemGiuaKi2, diemThi;
    private float diemKetThuc;

    /*Phương thức*/

    public DiemSo(String idHocVien, String idKhoaHoc, int diemGiuaKi1, int diemGiuaKi2, int diemThi, float diemKetThuc) {
        this.idHocVien = idHocVien;
        this.idKhoaHoc = idKhoaHoc;
        this.diemGiuaKi1 = diemGiuaKi1;
        this.diemGiuaKi2 = diemGiuaKi2;
        this.diemThi = diemThi;
        this.diemKetThuc = diemKetThuc;
    }

    public DiemSo() {}

    public String getIdHocVien() {
        return idHocVien;
    }

    public void setIdHocVien(String idHocVien) {
        this.idHocVien = idHocVien;
    }

    public String getIdKhoaHoc() {
        return idKhoaHoc;
    }

    public void setIdKhoaHoc(String idKhoaHoc) {
        this.idKhoaHoc = idKhoaHoc;
    }

    public int getdiemThi() {
        return diemThi;
    }

    public void setdiemThi(int diemThi) {
        this.diemThi = diemThi;
    }

    public float getDiemKetThuc() {
        return diemKetThuc;
    }

    public void setDiemKetThuc(float diemKetThuc) {
        this.diemKetThuc = diemKetThuc;
    }

    public int getDiemGiuaKi1() {
        return diemGiuaKi1;
    }

    public void setDiemGiuaKi1(int diemGiuaKi1) {
        this.diemGiuaKi1 = diemGiuaKi1;
    }

    public int getDiemGiuaKi2() {
        return diemGiuaKi2;
    }

    public void setDiemGiuaKi2(int diemGiuaKi2) {
        this.diemGiuaKi2 = diemGiuaKi2;
    }



    @Override
    public String toString() {
        return "DiemSo{" +
                "idHocVien='" + idHocVien + '\'' +
                ", idKhoaHoc='" + idKhoaHoc + '\'' +
                ", diemGiuaKi1=" + diemGiuaKi1 +
                ", diemGiuaKi2=" + diemGiuaKi2 +
                ", diemThi=" + diemThi +
                ", diemKetThuc=" + diemKetThuc +
                '}';
    }

    public Object[] parseArray() {
        return new Object[] { idHocVien,  idKhoaHoc,  diemGiuaKi1, diemGiuaKi2, diemThi,  diemKetThuc};
    }
    public static String[] getHeader() {
        return new String[] { "Mã Học Viên",  "Mã Khóa Học",  "Điểm GK1", "Điểm GK2", "Điểm Thi",  "Điểm KT"};
    }
}
