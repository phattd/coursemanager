/*
 * Copyright (c) 2022. Developed by Tran Dai Phat
 */

package bll;

import dal.LichHocDAL;
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
    public Message add(LichHoc lichHoc)
    {
        if (lichHocDAL.add(lichHoc))
        {
            danhSachLichHoc.add(lichHoc);
            return Message.OK;
        }
        return Message.ERROR_ADD_DATA;
    }
    public Message remove(String idKhoaHoc, String idPhong, String idGiangVien)
    {
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

    public Message update(LichHoc lichHoc)
    {
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
    
}
