

package bll;

import dal.DiemSoDAL;
import dto.DiemSo;
import dto.KhoaHoc;
import resoure.type.Message;

import java.util.ArrayList;
import java.util.HashMap;

public class DiemSoBLL {
    private ArrayList<DiemSo> danhSachDiemSo = new ArrayList<>();
    private DiemSoDAL diemSoDAL = new DiemSoDAL();

    private static final int min = 0;
    private static final int max = 10;
    public DiemSoBLL() {
        readList();
    }
    public void readList() {
        danhSachDiemSo = diemSoDAL.getList();
    }
    public ArrayList<DiemSo> getList() {
        return  danhSachDiemSo;
    }
    public Message add(ArrayList<String> data)
    {
        Object[] rs = checkData(data);
        if (rs[0] == Message.OK) {
            DiemSo diemSo = (DiemSo) rs[1];
            if (checkUnique(diemSo)) {
                if (diemSoDAL.add(diemSo))
                {
                    danhSachDiemSo.add(diemSo);
                    return Message.OK;
                }
                return Message.ERROR_ADD_DATA;
            }
            return Message.ERROR_EXIST_VALUE;
        }
        return (Message) rs[0];
    }
    public Message remove(String idKhoaHoc, String idHocVien)
    {
        if (!idKhoaHoc.trim().equals("") && !idHocVien.trim().equals("")) {
            if (checkUnique(idKhoaHoc, idHocVien) == false) {
                if ( diemSoDAL.remove( idKhoaHoc, idHocVien) )
                {
                    for (int index = 0; index < danhSachDiemSo.size(); index++) {
                        DiemSo temp = danhSachDiemSo.get(index);
                        if (temp.getIdKhoaHoc().equals(idKhoaHoc) && temp.getIdHocVien().equals(idHocVien)) {
                            danhSachDiemSo.remove(index);
                            return Message.OK;
                        }
                    }
                }
                return Message.ERROR_REMOVE_DATA;
            }
            return Message.ERROR_UNEXIST_VALUE;
        }
        return Message.ERROR_EMPTY_INPUT;
    }

    public Message update(ArrayList<String> data)
    {
        Object[] rs = checkData(data);
        if (rs[0] == Message.OK) {
            DiemSo diemSo = (DiemSo) rs[1];
            if (checkUnique(diemSo) == false) {
                if (diemSoDAL.update(diemSo) ) {
                    for (int index = 0; index < danhSachDiemSo.size(); index++) {
                        DiemSo temp = danhSachDiemSo.get(index);
                        if (temp.getIdKhoaHoc().equals(diemSo.getIdKhoaHoc()) && temp.getIdHocVien().equals(diemSo.getIdHocVien())) {
                            danhSachDiemSo.set(index, diemSo);
                            return Message.OK;
                        }
                    }
                }
                return Message.ERROR_UPDATE_DATA;
            }
            return Message.ERROR_UNEXIST_VALUE;
        }
        return (Message) rs[0];
    }
    private Object[] checkData(ArrayList<String> data) {
        if (data.get(0).trim().equals("") && data.get(1).trim().equals("")){
            return new Object[] {Message.ERROR_EMPTY_INPUT, null};
        }
        for (int i = 2; i < data.size(); i++) {
            if (data.get(i).trim().equals("")){
                data.set(i, "0");
            }
        }
        DiemSo diemSo = new DiemSo();
        try {
            diemSo.setIdHocVien(data.get(0));
            diemSo.setIdKhoaHoc(data.get(1));
            Message ms = checkDiem(data.get(2), data.get(3), data.get(4));
            if (ms != Message.OK) {return new Object[] {ms, null};}
            diemSo.setDiemGiuaKi1(Integer.parseInt(data.get(2)));
            diemSo.setDiemGiuaKi2(Integer.parseInt(data.get(3)));
            diemSo.setdiemThi(Integer.parseInt(data.get(4)));
            float avg = (float) (diemSo.getDiemGiuaKi1()*0.2+ diemSo.getDiemGiuaKi2()*0.3+diemSo.getdiemThi()*0.5);
            diemSo.setDiemKetThuc(avg);
            return new Object[] {Message.OK, diemSo};

        } catch (Exception exception) {
            return new Object[] {Message.ERROR_DATATYPE_INPUT, null};
        }
    }
    private Message checkDiem(String diemGK1,String diemGK2, String diemThi) {
        try {
            int diemgk1Int = Integer.parseInt(diemGK1);
            int diemgk2Int = Integer.parseInt(diemGK2);
            int diemThiInt = Integer.parseInt(diemThi);
            if ((diemgk1Int>=min && diemgk1Int<=max) && (diemgk2Int>=min && diemgk2Int<=max) && (diemThiInt>=min && diemThiInt<=max)) {
                return  Message.OK;
            } else {
                return Message.ERROR_LIMIT_SCORE_INPUT;
            }
        } catch (Exception e){
            return Message.ERROR_DATATYPE_INPUT;
        }
    }

    private boolean checkUnique(DiemSo diemSo) {
        //System.out.println(diemSo.toString());
        for (int index = 0; index < danhSachDiemSo.size(); index++) {
            DiemSo temp = danhSachDiemSo.get(index);
          //  System.out.println(temp.toString());
            if (temp.getIdKhoaHoc().equals(diemSo.getIdKhoaHoc())  && temp.getIdHocVien().equals(diemSo.getIdHocVien())) {
                return false;
            }
        }
        return true;
    }
    private boolean checkUnique(String idKhoaHoc, String idHocVien) {
        for (int index = 0; index < danhSachDiemSo.size(); index++)  {
            DiemSo temp = danhSachDiemSo.get(index);
            if (temp.getIdKhoaHoc().equals(idKhoaHoc) && temp.getIdHocVien().equals(idHocVien)) {
                return false;
            }
        }
        return true;
    }


}
