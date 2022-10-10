/*
 * Copyright (c) 2022. Developed by Tran Dai Phat
 */

package bll;

import dal.HocVienDAL;
import dto.HocVien;
import dto.HocVien;
import dto.HocVien;
import dto.HocVien;
import resoure.type.Message;
import resoure.type.Prefix;

import java.util.ArrayList;

public class HocVienBLL {
    private ArrayList<HocVien> danhSachHocVien = new ArrayList<>();
    private HocVienDAL hocVienDAL = new HocVienDAL();
    private static String lastInsertId ="";
    public HocVienBLL() {
        readList();
    }
    public void readList() {
        danhSachHocVien = hocVienDAL.getList();
    }
    public ArrayList<HocVien> getList() {
        return  danhSachHocVien;
    }
    public Message add(ArrayList<String> data)
    {
        Object[] rs = checkData(data);
        if (rs[0] == Message.OK) {
            HocVien hocVien = (HocVien) rs[1];
            if (checkUnique(hocVien)) {
                if (hocVienDAL.add(hocVien)) {
                    danhSachHocVien.add(hocVien);
                    return Message.OK;
                }
                return Message.ERROR_ADD_DATA;
            }
            return Message.ERROR_EXIST_VALUE;
        }
        return (Message) rs[0];
    }
    public Message remove(String idHocVien)
    {
        if (!idHocVien.trim().equals("")) {
            if (checkUnique(idHocVien) == false) {
                if ( hocVienDAL.remove(idHocVien) )
                {
                    for (int index = 0; index < danhSachHocVien.size(); index++) {
                        HocVien temp = danhSachHocVien.get(index);
                        if (temp.getIdHocVien().equals(idHocVien)) {
                            danhSachHocVien.remove(index);
                            return Message.OK;
                        }
                    }
                }
                return Message.ERROR_REMOVE_DATA;
            }
            return Message.ERROR_UNEXIST_VALUE;
        }
        return  Message.ERROR_EMPTY_INPUT;
    }

    public Message update(ArrayList<String> data)
    {
        Object[] rs = checkData(data);
        if (rs[0] == Message.OK){
            HocVien hocVien = (HocVien) rs[1];
            if (checkUnique(hocVien) == false) {
                if (hocVienDAL.update(hocVien))
                {
                    for (int index = 0; index < danhSachHocVien.size(); index++)
                    {
                        HocVien temp = danhSachHocVien.get(index);
                        if (temp.getIdHocVien().equals(hocVien.getIdHocVien())) {
                            danhSachHocVien.set(index, hocVien);
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


        for (String index : data) {
            if (index.trim().equals("")) {
                return new Object[] {Message.ERROR_EMPTY_INPUT, null};
            }
        }

        HocVien hocVien = new HocVien();
        try {
            hocVien.setIdHocVien(data.get(0));
            hocVien.setHoHV(data.get(1));
            hocVien.setTenHV(data.get(2));
            hocVien.setDiaChi(data.get(3));
            if (Helpers.isNum(data.get(4))) {
                hocVien.setSDT(data.get(4));
            } else
            {
                return new Object[] {Message.ERROR_DATATYPE_INPUT, null};
            }
            hocVien.setGioiTinh(Integer.parseInt(data.get(5)));
            if (Helpers.isDate(data.get(6))){
                hocVien.setNgaySinh(Helpers.stringToDate(data.get(6)));
            }else {
                return new Object[] {Message.ERROR_DATATYPE_INPUT, null};
            }
            return new Object[] {Message.OK, hocVien};
        } catch (Exception exception) {
            return new Object[] {Message.ERROR_DATATYPE_INPUT, null};
        }
    }
    public HocVien getHocVienByArray(ArrayList<String> data) {
        return (HocVien) checkData(data)[1];
    }

    public static String generatorKey(){
        return Helpers.keyGenerator(Prefix.STUDENT.toString());
    }

    public static void setLastInsertId(String lastInsertId) {
        HocVienBLL.lastInsertId = lastInsertId;
    }

    public static String getLastInsertId() {
        return lastInsertId;
    }
    private boolean checkUnique(HocVien hocVien) {
        for (int index = 0; index < danhSachHocVien.size(); index++) {
            HocVien temp = danhSachHocVien.get(index);
            if (temp.getIdHocVien().equals(hocVien.getIdHocVien())) {
                return false;
            }
        }
        return true;
    }
    private boolean checkUnique(String idHocVien) {
        for (int index = 0; index < danhSachHocVien.size(); index++) {
            HocVien temp = danhSachHocVien.get(index);
            if (temp.getIdHocVien().equals(idHocVien)) {
                return false;
            }
        }
        return true;
    }
    public ArrayList<HocVien> search(String tuKhoa) {
        tuKhoa = tuKhoa.toLowerCase();
        ArrayList<HocVien> dsindex = new ArrayList<>();
        for (HocVien index : danhSachHocVien) {
            String id = index.getIdHocVien().toLowerCase();
            String ho = index.getHoHV().toLowerCase();
            String ten = index.getTenHV().toLowerCase();
            String diaChi = index.getDiaChi().toLowerCase();
            String sdt =index.getSDT();

            if (ho.contains(tuKhoa) || ten.contains(tuKhoa) || id.contains(tuKhoa) || diaChi.contains(tuKhoa) ||
                    sdt.contains(tuKhoa)) {
                dsindex.add(index);
            }
        }
        return dsindex;
    }
}
