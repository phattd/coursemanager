/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package bll;

import dal.DiemSoDAL;
import dto.DiemSo;
import resoure.type.Message;

import java.util.ArrayList;

public class DiemSoBLL {
    private ArrayList<DiemSo> danhSachDiemSo = new ArrayList<>();
    private DiemSoDAL diemSoDAL = new DiemSoDAL();
    public DiemSoBLL() {
        readList();
    }
    public void readList() {
        danhSachDiemSo = diemSoDAL.getList();
    }
    public ArrayList<DiemSo> getList() {
        return  danhSachDiemSo;
    }
    public Message add(DiemSo diemSo)
    {
        if (diemSoDAL.add(diemSo))
        {
            danhSachDiemSo.add(diemSo);
            return Message.OK;
        }
        return Message.ERROR_ADD_DATA;
    }
    public Message remove(String idKhoaHoc, String idHocVien)
    {
        if ( diemSoDAL.remove( idKhoaHoc, idHocVien) )
        {
            for (int index = 0; index < danhSachDiemSo.size(); index++) {
                DiemSo temp = danhSachDiemSo.get(index);
                if (temp.getIdKhoaHoc().equals(idKhoaHoc) && temp.getIdHocVien().equals(idHocVien)) {
                    danhSachDiemSo.remove(index);
                    return Message.OK;
                }
            }
        }
        return Message.ERROR_ADD_DATA;
    }

    public Message update(DiemSo diemSo)
    {
        if (diemSoDAL.update(diemSo))
        {
            for (int index = 0; index < danhSachDiemSo.size(); index++)
            {
                DiemSo temp = danhSachDiemSo.get(index);
                if (temp.getIdKhoaHoc().equals(diemSo.getIdKhoaHoc()) && temp.getIdHocVien().equals(diemSo.getIdHocVien())) {
                    danhSachDiemSo.set(index, diemSo);
                    return Message.OK;
                }
            }

        }
        return Message.ERROR_UPDATE_DATA;
    }


}
