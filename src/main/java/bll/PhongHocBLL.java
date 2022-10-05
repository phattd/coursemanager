/*
 * Copyright (c) 2022. Developed by Tran Dai Phat
 */

package bll;

import dal.PhongHocDAL;
import dto.PhongHoc;
import resoure.type.Message;

import java.util.ArrayList;

public class PhongHocBLL {
    private ArrayList<PhongHoc> danhSachPhongHoc = new ArrayList<>();
    private PhongHocDAL phongHocDAL = new PhongHocDAL();
    public PhongHocBLL() {
        readList();
    }
    public void readList() {
        danhSachPhongHoc = phongHocDAL.getList();
    }
    public ArrayList<PhongHoc> getList() {
        return  danhSachPhongHoc;
    }
    public Message add(PhongHoc phongHoc)
    {
        if (phongHocDAL.add(phongHoc))
        {
            danhSachPhongHoc.add(phongHoc);
            return Message.OK;
        }
        return Message.ERROR_ADD_DATA;
    }
    public Message remove(String idPhongHoc)
    {
        if ( phongHocDAL.remove(idPhongHoc) )
        {
            for (int index = 0; index < danhSachPhongHoc.size(); index++) {
                PhongHoc temp = danhSachPhongHoc.get(index);
                if (temp.getIdPhongHoc().equals(idPhongHoc)) {
                    danhSachPhongHoc.remove(index);
                    return Message.OK;
                }
            }
        }
        return Message.ERROR_REMOVE_DATA;
    }

    public Message update(PhongHoc phongHoc)
    {
        if (phongHocDAL.update(phongHoc))
        {
            for (int index = 0; index < danhSachPhongHoc.size(); index++)
            {
                PhongHoc temp = danhSachPhongHoc.get(index);
                if (temp.getIdPhongHoc().equals(phongHoc.getIdPhongHoc())) {
                    danhSachPhongHoc.set(index, phongHoc);
                    return Message.OK;
                }
            }

        }
        return Message.ERROR_UPDATE_DATA;
    }
}
