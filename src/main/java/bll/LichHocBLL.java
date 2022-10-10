/*
 * Copyright (c) 2022. Developed by Tran Dai Phat
 */

package bll;

import dal.LichHocDAL;
import dto.KhoaHoc;
import dto.LichHoc;
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
            if (checkTimeLineUnique(lichHoc)) {
                if (lichHocDAL.add(lichHoc))
                {
                    danhSachLichHoc.add(lichHoc);
                    return Message.OK;
                }
                return Message.ERROR_ADD_DATA;
            }
            return  Message.ERROR_TIMELINE_UNIQUE;
       }
       return (Message) rs[0];
    }
    public Message remove(String idGiangVien, String idKhoaHoc, String idPhong)
    {
        if (!idKhoaHoc.trim().equals("") && !idPhong.trim().equals("") && !idGiangVien.trim().equals("")) {
            if (checkUnique(idGiangVien ,idKhoaHoc, idPhong ) == false) {
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
            return Message.ERROR_UNEXIST_VALUE;
        }
        return Message.ERROR_EMPTY_INPUT;
    }

    public Message update(ArrayList<String> data) {
        Object[] rs =checkData(data);
        if (rs[0] == Message.OK)
        {
            LichHoc lichHoc = (LichHoc) rs[1];
            if (checkUnique(lichHoc) == false) {
               if (checkTimeLineUnique(lichHoc)) {
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
               return Message.ERROR_TIMELINE_UNIQUE;
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
        LichHoc lichHoc = new LichHoc();
        try {
            lichHoc.setIdGiangVien(data.get(0));
            lichHoc.setIdKhoaHoc(data.get(1));
            lichHoc.setIdPhong(data.get(2));
            lichHoc.setThu(data.get(3));
            if ( Helpers.isNum(data.get(4))) {
                lichHoc.setCaHoc(Integer.parseInt(data.get(4)));
            } else {
                return new Object[] {Message.ERROR_DATATYPE_INPUT, null};
            }
            return new Object[] {Message.OK, lichHoc};

        } catch (Exception exception) {
            return new Object[] {Message.ERROR_DATATYPE_INPUT, null};
        }
    }
    private boolean checkUnique(LichHoc lichHoc) {
        //System.out.println(lichHoc.toString());
        for (int index = 0; index < danhSachLichHoc.size(); index++) {
            LichHoc temp = danhSachLichHoc.get(index);
            //  System.out.println(temp.toString());
            if (temp.getIdKhoaHoc().equals(lichHoc.getIdKhoaHoc())  && temp.getIdGiangVien().equals(lichHoc.getIdGiangVien()) && temp.getIdPhong().equals(lichHoc.getIdPhong())) {
                return false;
            }
        }
        return true;
    }
    private boolean checkUnique( String idGiangVien, String idKhoaHoc, String idPhong) {
        for (int index = 0; index < danhSachLichHoc.size(); index++)  {
            LichHoc temp = danhSachLichHoc.get(index);
            if (temp.getIdKhoaHoc().equals(idKhoaHoc) && temp.getIdGiangVien().equals(idGiangVien) && temp.getIdPhong().equals(idPhong)) {
                return false;
            }
        }
        return true;
    }
    public ArrayList<LichHoc> search(String tuKhoa) {
        tuKhoa = tuKhoa.toLowerCase();
        ArrayList<LichHoc> dsindex = new ArrayList<>();
        for (LichHoc index : danhSachLichHoc) {
            String idkh = index.getIdKhoaHoc().toLowerCase();
            String idgv = index.getIdGiangVien().toLowerCase();
            String idph = index.getIdPhong().toLowerCase();
            String thu = index.getThu().toLowerCase();
            if (idkh.contains(tuKhoa) || idgv.contains(tuKhoa) || idph.contains(tuKhoa) || thu.equals(tuKhoa) ) {
                dsindex.add(index);
            }

        }
        return dsindex;
    }
    public boolean checkTimeLineUnique(LichHoc lichHoc) {
        for (LichHoc index: danhSachLichHoc) {
            /* check phòng - thứ - ca*/
            if (index.getCaHoc() == lichHoc.getCaHoc() && index.getIdPhong().equals(lichHoc.getIdPhong()) &&
            index.getThu().equals(lichHoc.getThu())) {
                return false;
            } else {
                /* check gv - thứ - ca*/
                if (index.getCaHoc() == lichHoc.getCaHoc() && index.getIdGiangVien().equals(lichHoc.getIdGiangVien()) &&
                        index.getThu().equals(lichHoc.getThu())) {
                    return false;
                }
            }
        }
        return true;
    }
    
}
