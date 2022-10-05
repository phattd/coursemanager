/*
 * Copyright (c) 2022. Developed by Tran Dai Phat
 */

package bll;

import dal.KhoaHocDAL;
import dto.KhoaHoc;
import resoure.type.Message;

import java.util.ArrayList;

public class KhoaHocBLL {
    private ArrayList<KhoaHoc> danhSachKhoaHoc = new ArrayList<>();
    private KhoaHocDAL khoaHocDAL = new KhoaHocDAL();
    public KhoaHocBLL() {
        readList();
    }
    public void readList() {
        danhSachKhoaHoc = khoaHocDAL.getList();
    }
    public ArrayList<KhoaHoc> getList() {
        return  danhSachKhoaHoc;
    }
    public Message add(KhoaHoc khoaHoc)
    {
        if (khoaHocDAL.add(khoaHoc))
        {
            danhSachKhoaHoc.add(khoaHoc);
            return Message.OK;
        }
        return Message.ERROR_ADD_DATA;
    }
    public Message remove(String idKhoaHoc)
    {
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

    public Message update(KhoaHoc khoaHoc)
    {
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
}
