/*
 * Copyright (c) 2022. Developed by Tran Dai Phat
 */

package bll;

import dal.ThamGiaDAL;
import dto.ThamGia;
import resoure.type.Message;

import java.util.ArrayList;

public class ThamGiaBLL {
    private ArrayList<ThamGia> danhSachThamGia = new ArrayList<>();
    private ThamGiaDAL thamGiaDAL = new ThamGiaDAL();
    public ThamGiaBLL() {
        readList();
    }
    public void readList() {
        danhSachThamGia = thamGiaDAL.getList();
    }
    public ArrayList<ThamGia> getList() {
        return  danhSachThamGia;
    }
    public Message add(ThamGia thamGia)
    {
        if (thamGiaDAL.add(thamGia))
        {
            danhSachThamGia.add(thamGia);
            return Message.OK;
        }
        return Message.ERROR_ADD_DATA;
    }
    public Message remove(ThamGia thamGia)
    {
        if ( thamGiaDAL.remove(thamGia) )
        {
            for (int index = 0; index < danhSachThamGia.size(); index++) {
                ThamGia temp = danhSachThamGia.get(index);
                if (temp.getIdKhoaHoc().equals(thamGia.getIdKhoaHoc()) && temp.getIdHocVien().equals(thamGia.getIdHocVien())) {
                    danhSachThamGia.remove(index);
                    return Message.OK;
                }
            }
        }
        return Message.ERROR_REMOVE_DATA;
    }


}
