

package dto;

public class ThamGia {
    private String idKhoaHoc, idHocVien;

    public ThamGia(String idKhoaHoc, String idHocVien) {
        this.idKhoaHoc = idKhoaHoc;
        this.idHocVien = idHocVien;
    }

    public String getIdKhoaHoc() {
        return idKhoaHoc;
    }

    public void setIdKhoaHoc(String idKhoaHoc) {
        this.idKhoaHoc = idKhoaHoc;
    }

    public String getIdHocVien() {
        return idHocVien;
    }

    public void setIdHocVien(String idHocVien) {
        this.idHocVien = idHocVien;
    }

}
