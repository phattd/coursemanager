    /*Package*/
package dto;
    /*Import*/

public class DiemSo {
    /*Thuộc tính*/
    private String idHocVien, idKhoaHoc;
    private  int diem;

    /*Phương thức*/

    public DiemSo(String idHocVien, String idKhoaHoc, int diem) {
        this.idHocVien = idHocVien;
        this.idKhoaHoc = idKhoaHoc;
        this.diem = diem;
    }

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

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }
}
