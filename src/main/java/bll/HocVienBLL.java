/*
 * Copyright (c) 2022. Developed by Tran Dai Phat
 */

package bll;

import dal.HocVienDAL;
import dto.HocVien;
import resoure.type.Message;

import java.util.ArrayList;

public class HocVienBLL {
    private ArrayList<HocVien> danhSachHocVien = new ArrayList<>();
    private HocVienDAL hocVienDAL = new HocVienDAL();
    public HocVienBLL() {
        readList();
    }
    public void readList() {
        danhSachHocVien = hocVienDAL.getList();
    }
    public ArrayList<HocVien> getList() {
        return  danhSachHocVien;
    }
    public Message add(HocVien hocVien)
    {
        if (hocVienDAL.add(hocVien))
        {
            danhSachHocVien.add(hocVien);
            return Message.OK;
        }
        return Message.ERROR_ADD_DATA;
    }
    public Message remove(String idHocVien)
    {
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

    public Message update(HocVien hocVien)
    {
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
}
