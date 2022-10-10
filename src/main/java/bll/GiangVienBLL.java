/*
 * Copyright (c) 2022. Developed by Tran Dai Phat
 */

package bll;

import dal.GiangVienDAL;
import dto.GiangVien;
import dto.GiangVien;
import dto.GiangVien;
import dto.KhoaHoc;
import resoure.type.Message;
import resoure.type.Prefix;

import java.util.ArrayList;
import java.util.Locale;

public class GiangVienBLL {
    private ArrayList<GiangVien> danhSachGiangVien = new ArrayList<>();
    private GiangVienDAL giangVienDAL = new GiangVienDAL();
    private static  String lastInsertId ="";
    public GiangVienBLL() {
        readList();
    }
    public void readList() {
        danhSachGiangVien = giangVienDAL.getList();
    }
    public ArrayList<GiangVien> getList() {
        return  danhSachGiangVien;
    }
    public Message add(ArrayList<String> data)
    {
        Object[] rs = checkData(data);
        if (rs[0] == Message.OK){
            GiangVien giangVien = (GiangVien) rs[1];
            if (checkUnique(giangVien)) {
                if (giangVienDAL.add(giangVien))
                {
                    danhSachGiangVien.add(giangVien);
                    return Message.OK;
                }
                return Message.ERROR_ADD_DATA;
            }
            return Message.ERROR_EXIST_VALUE;
        }
        return (Message) rs[0];
    }
    public Message remove(String idGiangVien)
    {
        if (!idGiangVien.trim().equals("")){
            if (checkUnique(idGiangVien) ==false) {
                if ( giangVienDAL.remove(idGiangVien) )
                {
                    for (int index = 0; index < danhSachGiangVien.size(); index++) {
                        GiangVien temp = danhSachGiangVien.get(index);
                        if (temp.getIdGiangVien().equals(idGiangVien)) {
                            danhSachGiangVien.remove(index);
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

    public Message update(ArrayList<String> data) {
       Object[] rs =checkData(data);
       if (rs[0] == Message.OK) {
           GiangVien giangVien = (GiangVien) rs[1];
           if (checkUnique(giangVien) == false) {
               if (giangVienDAL.update(giangVien))
               {
                   for (int index = 0; index < danhSachGiangVien.size(); index++)
                   {
                       GiangVien temp = danhSachGiangVien.get(index);
                       if (temp.getIdGiangVien().equals(giangVien.getIdGiangVien())) {
                           setLastInsertId(giangVien.getIdGiangVien());
                           danhSachGiangVien.set(index, giangVien);
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
        GiangVien giangVien = new GiangVien();
        try {
            giangVien.setIdGiangVien(data.get(0));
            giangVien.setHoGV(data.get(1));
            giangVien.setTenGV(data.get(2));
            giangVien.setDiaChi(data.get(3));
            if (Helpers.isNum(data.get(4)) && Helpers.isNum(data.get(6))) {
                giangVien.setSDT(data.get(4));
                giangVien.setLuong(Helpers.stringToInt(data.get(6)));
            } else
            {
                return new Object[] {Message.ERROR_DATATYPE_INPUT, null};
            }
            giangVien.setGioiTinh(Integer.parseInt(data.get(5)));

            if (Helpers.isDate(data.get(7))){
                giangVien.setNgaySinh(Helpers.stringToDate(data.get(7)));
            }else {
                return new Object[] {Message.ERROR_DATATYPE_INPUT, null};
            }
            return new Object[] {Message.OK, giangVien};
        } catch (Exception exception) {
            return new Object[] {Message.ERROR_DATATYPE_INPUT, null};
        }
    }
    public static String generatorKey(){
        return Helpers.keyGenerator(Prefix.TEACHER.toString());
    }

    public static void setLastInsertId(String lastInsertId) {
        GiangVienBLL.lastInsertId = lastInsertId;
    }

    public static String getLastInsertId() {
        return lastInsertId;
    }
    private boolean checkUnique(GiangVien giangVien) {
        for (int index = 0; index < danhSachGiangVien.size(); index++) {
            GiangVien temp = danhSachGiangVien.get(index);
                if (temp.getIdGiangVien().equals(giangVien.getIdGiangVien())) {
                    return false;
                }

        }
        return true;
    }
    private boolean checkUnique(String idGiangVien) {
        for (int index = 0; index < danhSachGiangVien.size(); index++) {
            GiangVien temp = danhSachGiangVien.get(index);
            if (temp.getIdGiangVien().equals(idGiangVien)) {
                return false;
            }
        }
        return true;
    }
    public ArrayList<GiangVien> search(String tuKhoa) {
        tuKhoa = tuKhoa.toLowerCase();
        ArrayList<GiangVien> dsindex = new ArrayList<>();
        for (GiangVien index : danhSachGiangVien) {
            String id = index.getIdGiangVien().toLowerCase();
            String ho = index.getHoGV().toLowerCase();
            String ten = index.getTenGV().toLowerCase();
            String diaChi = index.getDiaChi().toLowerCase();
            String sdt =index.getSDT();
            String luong = String.valueOf(index.getLuong());

            if (ho.contains(tuKhoa) || ten.contains(tuKhoa) || id.contains(tuKhoa) || diaChi.contains(tuKhoa) ||
            sdt.contains(tuKhoa) || luong.equals(tuKhoa)) {
                dsindex.add(index);
            }
        }
        return dsindex;
    }
}
