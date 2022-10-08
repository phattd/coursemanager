/*
 * Copyright (c) 2022. Developed by Tran Dai Phat
 */

import bll.*;
import dto.KhoaHoc;
import resoure.type.Message;

import java.util.ArrayList;
import java.util.logging.Handler;

public class test {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        l.add("1d4930953a2c6e6de3a92f1b8dbba8019e435");
        l.add("c29cd1240bf7d7c874cacd17669d97c35b94ff5b");
        l.add("5");
        l.add("5");
        l.add("5");



        //GiangVienBLL giangVienBLL =new GiangVienBLL();
        //HocVienBLL hocVienBLL =new HocVienBLL();
        DiemSoBLL diemSoBLL = new DiemSoBLL();
        Message s = diemSoBLL.update(l);
        System.out.println(s.toString());
    }
}
