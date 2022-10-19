/*
 * Copyright (c) 2022. Developed by Tran Dai Phat
 */

package bll;

import dal.KhoaHocDAL;
import dto.KhoaHoc;
import dto.KhoaHoc;
import dto.KhoaHoc;
import resoure.type.Message;
import resoure.type.Prefix;

import java.util.ArrayList;
import java.util.Date;

public class KhoaHocBLL {
    private ArrayList<KhoaHoc> danhSachKhoaHoc = new ArrayList<>();
    private KhoaHocDAL khoaHocDAL = new KhoaHocDAL();
    private static String lastInsertId = "";
    public KhoaHocBLL() {
        readList();
    }
    public void readList() {
        danhSachKhoaHoc = khoaHocDAL.getList();
    }
    public ArrayList<KhoaHoc> getList() {
        return  danhSachKhoaHoc;
    }
    public ArrayList<KhoaHoc>  getListNotOpening() {
        ArrayList<KhoaHoc> khoaHocs = new ArrayList<>();
        Date current = new Date();
        for (KhoaHoc index : danhSachKhoaHoc) {
            if (current.before(index.getThoiGianBatDau())){
                khoaHocs.add(index);
            }
        }
        return khoaHocs;
    }
    public ArrayList<KhoaHoc>  getListNotOpeningAndNotInvite(String idHocVien) {
        ArrayList<KhoaHoc> khoaHocs = new ArrayList<>();
        Date current = new Date();
        for (KhoaHoc index : danhSachKhoaHoc) {
            if (current.before(index.getThoiGianBatDau()) && !idHocVien.equals(index.getIdKhoaHoc())){
                khoaHocs.add(index);
            }
        }
        return khoaHocs;
    }
    public Message add(ArrayList<String> data)
    {
        Object[] rs = checkData(data);
        if (rs[0] == Message.OK) {
            KhoaHoc khoaHoc = (KhoaHoc) rs[1];
            if (checkUnique(khoaHoc, 1) == true) {

                if (khoaHocDAL.add(khoaHoc))
                {
                    danhSachKhoaHoc.add(khoaHoc);
                    return Message.OK;
                }
                return Message.ERROR_ADD_DATA;
            }
            return Message.ERROR_EXIST_VALUE;
        }
        return (Message) rs[0];
    }
    public Message remove(String idKhoaHoc)
    {
        if (!idKhoaHoc.trim().equals("")) {
            if (checkUnique(idKhoaHoc)==false) {
                if ( khoaHocDAL.remove(idKhoaHoc) )
                {
                    for (int index = 0; index < danhSachKhoaHoc.size(); index++) {
                        KhoaHoc temp = danhSachKhoaHoc.get(index);
                        if (temp.getIdKhoaHoc().equals(idKhoaHoc)) {
                            danhSachKhoaHoc.remove(index);
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
            KhoaHoc khoaHoc = (KhoaHoc) rs[1];
            if (checkUnique(khoaHoc, 2) == false) {
                if (khoaHocDAL.update(khoaHoc))
                {
                    for (int index = 0; index < danhSachKhoaHoc.size(); index++)
                    {
                        KhoaHoc temp = danhSachKhoaHoc.get(index);
                        if (temp.getIdKhoaHoc().equals(khoaHoc.getIdKhoaHoc())) {
                            danhSachKhoaHoc.set(index, khoaHoc);

                            return Message.OK;
                        }
                    }
                }
                return Message.ERROR_UPDATE_DATA;
            }
            return  Message.ERROR_UNEXIST_VALUE;
        }
        return (Message) rs[0];
    }
    private Object[] checkData(ArrayList<String> data) {
        for (String index : data) {
            if (index.trim().equals("")) {
                return new Object[] {Message.ERROR_EMPTY_INPUT, null};
            }
        }
        KhoaHoc khoaHoc = new KhoaHoc();
        try {
            khoaHoc.setIdKhoaHoc(data.get(0));
            khoaHoc.setTenKhoaHoc(data.get(1));

            if (Helpers.isDate(data.get(2)) && Helpers.isDate(data.get(3))){
                khoaHoc.setThoiGianBatDau(Helpers.stringToDate(data.get(2)));
                khoaHoc.setThoiGianKetThuc(Helpers.stringToDate(data.get(3)));
            } else {
                return new Object[] {Message.ERROR_DATATYPE_INPUT, null};
            }
            if (Helpers.isNum(data.get(4))) {
                khoaHoc.setGia(Helpers.stringToInt(data.get(4)));
            }else {
                return new Object[] {Message.ERROR_DATATYPE_INPUT, null};
            }
            return new Object[] {Message.OK, khoaHoc};
        } catch (Exception exception) {
            return new Object[] {Message.ERROR_DATATYPE_INPUT, null};
        }
    }
    public static String generatorKey(){
        return Helpers.keyGenerator(Prefix.COURSE.toString());
    }

    public static void setLastInsertId(String lastInsertId) {
        KhoaHocBLL.lastInsertId = lastInsertId;
    }

    public static String getLastInsertId() {
        return lastInsertId;
    }
    private boolean checkUnique(KhoaHoc khoaHoc, int type) {
        for (int index = 0; index < danhSachKhoaHoc.size(); index++) {
            KhoaHoc temp = danhSachKhoaHoc.get(index);
            switch (type) {
                case 1: {
                    if (temp.getIdKhoaHoc().equals(khoaHoc.getIdKhoaHoc()) || temp.getTenKhoaHoc().equals(khoaHoc.getTenKhoaHoc())) {
                        return false;
                    }
                }
                case 2: {
                    if (temp.getIdKhoaHoc().equals(khoaHoc.getIdKhoaHoc())) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    private boolean checkUnique(String idKhoaHoc) {
        for (int index = 0; index < danhSachKhoaHoc.size(); index++)  {
            KhoaHoc temp = danhSachKhoaHoc.get(index);
            if (temp.getIdKhoaHoc().equals(idKhoaHoc)) {
                return false;
            }
        }
        return true;
    }
    public ArrayList<KhoaHoc> search(String tuKhoa) {
        tuKhoa = tuKhoa.toLowerCase();
        ArrayList<KhoaHoc> dsindex = new ArrayList<>();
        for (KhoaHoc index : danhSachKhoaHoc) {
            String id = index.getIdKhoaHoc().toLowerCase();
            String ten = index.getTenKhoaHoc().toLowerCase();
            String gia = String.valueOf(index.getGia());

            if (ten.contains(tuKhoa) || id.contains(tuKhoa) || gia.equals(tuKhoa)) {
                dsindex.add(index);
            }
        }
        return dsindex;
    }
}
