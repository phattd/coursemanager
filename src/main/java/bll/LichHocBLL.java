/*
 * Copyright (c) 2022. Developed by Tran Dai Phat
 */

package bll;

import dal.LichHocDAL;
import dto.LichHoc;
import dto.LichHoc;
import resoure.type.Message;

import java.util.ArrayList;

public class LichHocBLL {
    private ArrayList<LichHoc> danhSachLichHoc = new ArrayList<>();
    private LichHocDAL lichHocDAL = new LichHocDAL();
    public LichHocBLL() {
        readList();
    }
    public void readList() {
        danhSachLichHoc = lichHocDAL.getList();
    }
    public ArrayList<LichHoc> getList() {
        return  danhSachLichHoc;
    }
    public Message add(ArrayList<String> data)
    {
       Object[] rs = checkData(data);
       if (rs[0] == Message.OK) {
            LichHoc lichHoc = (LichHoc) rs[1];
           if (lichHocDAL.add(lichHoc))
           {
               danhSachLichHoc.add(lichHoc);
               return Message.OK;
           }
           return Message.ERROR_ADD_DATA;
       }
       return (Message) rs[0];
    }
    public Message remove(String idKhoaHoc, String idPhong, String idGiangVien)
    {
        if (!idKhoaHoc.trim().equals("") && !idPhong.trim().equals("") && !idGiangVien.trim().equals("")) {
            if ( lichHocDAL.remove(idKhoaHoc, idPhong, idGiangVien) )
            {
                for (int index = 0; index < danhSachLichHoc.size(); index++) {
                    LichHoc temp = danhSachLichHoc.get(index);
                    if (temp.getIdKhoaHoc().equals(idKhoaHoc) && temp.getIdPhong().equals(idPhong) &&
                            temp.getIdGiangVien().equals(idGiangVien)) {
                        danhSachLichHoc.remove(index);
                        return Message.OK;
                    }
                }
            }
            return Message.ERROR_REMOVE_DATA;
        }
        return Message.ERROR_EMPTY_INPUT;
    }

    public Message update(ArrayList<String> data) {
        Object[] rs =checkData(data);
        if (rs[0] == Message.OK)
        {
            LichHoc lichHoc = (LichHoc) rs[1];
            if (lichHocDAL.update(lichHoc))
            {
                for (int index = 0; index < danhSachLichHoc.size(); index++)
                {
                    LichHoc temp = danhSachLichHoc.get(index);
                    if (temp.getIdKhoaHoc().equals(lichHoc.getIdKhoaHoc()) && temp.getIdPhong().equals(lichHoc.getIdPhong()) &&
                            temp.getIdGiangVien().equals(lichHoc.getIdGiangVien())) {
                        danhSachLichHoc.set(index, lichHoc);
                        return Message.OK;
                    }
                }

            }
            return Message.ERROR_UPDATE_DATA;
        }
        return (Message) rs[0];
    }
    private Object[] checkData(ArrayList<String> data) {
        for (String index : data) {
            if (index.trim().equals("")) {
                return new Object[] {Message.ERROR_EMPTY_INPUT, null};
            }
        }
        LichHoc lichHoc = new LichHoc();
        try {
            lichHoc.setIdGiangVien(data.get(0));
            lichHoc.setIdKhoaHoc(data.get(1));
            lichHoc.setIdPhong(data.get(2));
            if (Helpers.isDate(data.get(3)) && Helpers.isNum(data.get(4)) && Helpers.isNum(data.get(5)) && Helpers.isNum(data.get(6))) {
                lichHoc.setNgay(Helpers.stringToDate(data.get(3)));
                lichHoc.setTietBatDau(Helpers.stringToInt(data.get(4)));
                lichHoc.setTietKetThuc(Helpers.stringToInt(data.get(5)));
                lichHoc.setThuThu(Helpers.stringToInt(data.get(6)));


            } else {
                return new Object[] {Message.ERROR_DATATYPE_INPUT, null};
            }
            return new Object[] {Message.OK, lichHoc};

        } catch (Exception exception) {
            return new Object[] {Message.ERROR_DATATYPE_INPUT, null};
        }
    }
    
}
