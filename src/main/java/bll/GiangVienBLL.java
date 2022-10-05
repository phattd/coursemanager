/*
 * Copyright (c) 2022. Developed by Tran Dai Phat
 */

package bll;

import dal.GiangVienDAL;
import dto.GiangVien;
import resoure.type.Message;

import java.util.ArrayList;

public class GiangVienBLL {
    private ArrayList<GiangVien> danhSachGiangVien = new ArrayList<>();
    private GiangVienDAL giangVienDAL = new GiangVienDAL();
    public GiangVienBLL() {
        readList();
    }
    public void readList() {
        danhSachGiangVien = giangVienDAL.getList();
    }
    public ArrayList<GiangVien> getList() {
        return  danhSachGiangVien;
    }
    public Message add(GiangVien giangVien)
    {
        if (giangVienDAL.add(giangVien))
        {
            danhSachGiangVien.add(giangVien);
            return Message.OK;
        }
        return Message.ERROR_ADD_DATA;
    }
    public Message remove(String idGiangVien)
    {
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
        return Message.ERROR_ADD_DATA;
    }

    public Message update(GiangVien giangVien)
    {
        if (giangVienDAL.update(giangVien))
        {
            for (int index = 0; index < danhSachGiangVien.size(); index++)
            {
                GiangVien temp = danhSachGiangVien.get(index);
                if (temp.getIdGiangVien().equals(giangVien.getIdGiangVien())) {
                    danhSachGiangVien.set(index, giangVien);
                    return Message.OK;
                }
            }

        }
        return Message.ERROR_UPDATE_DATA;
    }
}
