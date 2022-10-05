package dto;

public class PhongHoc {
    private String idPhongHoc, tenPhongHoc, toaNha, diaChi;

    public PhongHoc(String idPhongHoc, String tenPhongHoc, String toaNha, String diaChi) {
        this.idPhongHoc = idPhongHoc;
        this.tenPhongHoc = tenPhongHoc;
        this.toaNha = toaNha;
        this.diaChi = diaChi;
    }

    public String getIdPhongHoc() {
        return idPhongHoc;
    }

    public void setIdPhongHoc(String idPhongHoc) {
        this.idPhongHoc = idPhongHoc;
    }

    public String getTenPhongHoc() {
        return tenPhongHoc;
    }

    public void setTenPhongHoc(String tenPhongHoc) {
        this.tenPhongHoc = tenPhongHoc;
    }

    public String getToaNha() {
        return toaNha;
    }

    public void setToaNha(String toaNha) {
        this.toaNha = toaNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
