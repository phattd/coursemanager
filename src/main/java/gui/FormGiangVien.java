/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bll.Helpers;
import bll.GiangVienBLL;
import dto.GiangVien;
import resoure.type.Message;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;

/**
 *
 * @author Pero
 */
public class FormGiangVien extends javax.swing.JPanel {

    /**
     * Creates new form FormGiangVien
     */
    private GiangVienBLL giangVienBLL=new GiangVienBLL();
    private DefaultTableModel renderStudentTable=new DefaultTableModel();
    private ArrayList<GiangVien> danhSachGiangVien=new ArrayList<>();
    public FormGiangVien() {
        initComponents();
        txtMa.setEnabled(false);
        loadDanhSachGiangVien();
        refreshField();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        String gt[] = { "Nam", "Nữ" };
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtHo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbLoai = new javax.swing.JComboBox<>(gt);
        jLabel6 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtTimKiem = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        pnTim = new javax.swing.JPanel();
        btnTim = new javax.swing.JLabel();
        pnTim1 = new javax.swing.JPanel();
        btnTim1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_giangvien = new javax.swing.JTable();
        pnThem = new javax.swing.JPanel();
        btnThem = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pnSua = new javax.swing.JPanel();
        btnSua = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        pnXoa = new javax.swing.JPanel();
        btnXoa = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnXuatFileExcel = new javax.swing.JPanel();
        btnXuatFileExcel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtLuong = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Thông tin giảng viên");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Mã GV:");

        txtMa.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Họ GV:");

        txtHo.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Giới tính:");

        cmbLoai.setEditable(true);
        cmbLoai.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Địa chỉ:");

        txtDiaChi.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Ngày Sinh:");

        txtPhone.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Tên GV:");

        txtTen.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        txtTimKiem.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Tìm kiếm:");

        pnTim.setBackground(new java.awt.Color(51, 51, 51));
        pnTim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnTim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTim.setIcon(new javax.swing.ImageIcon(("src/main/java/gui/image/search.png"))); // NOI18N
        btnTim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search();
            }
        });

        javax.swing.GroupLayout pnTimLayout = new javax.swing.GroupLayout(pnTim);
        pnTim.setLayout(pnTimLayout);
        pnTimLayout.setHorizontalGroup(
            pnTimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTimLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTim, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnTimLayout.setVerticalGroup(
            pnTimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTimLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnTim1.setBackground(new java.awt.Color(51, 51, 51));
        pnTim1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnTim1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnTim1.setForeground(new java.awt.Color(255, 255, 255));
        btnTim1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTim1.setText("Làm mới");
        btnTim1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshField();
                loadDanhSachGiangVien();
            }
        });

        javax.swing.GroupLayout pnTim1Layout = new javax.swing.GroupLayout(pnTim1);
        pnTim1.setLayout(pnTim1Layout);
        pnTim1Layout.setHorizontalGroup(
            pnTim1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTim1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTim1, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnTim1Layout.setVerticalGroup(
            pnTim1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTim1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTim1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        tbl_giangvien.setBackground(new java.awt.Color(255, 255, 255));
        tbl_giangvien.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        tbl_giangvien.setForeground(new java.awt.Color(2, 2, 2));
        tbl_giangvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã GV", "Họ GV", "Tên GV", "Giới tính", "Ngày sinh", "SĐT", "Địa chỉ", "Lương"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_giangvien.setRowHeight(36);
        tbl_giangvien.setSelectionBackground(new java.awt.Color(153, 153, 255));
        tbl_giangvien.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tbl_giangvien);
        if (tbl_giangvien.getColumnModel().getColumnCount() > 0) {
            tbl_giangvien.getColumnModel().getColumn(0).setResizable(false);
            tbl_giangvien.getColumnModel().getColumn(0).setPreferredWidth(30);
            tbl_giangvien.getColumnModel().getColumn(1).setResizable(false);
            tbl_giangvien.getColumnModel().getColumn(1).setPreferredWidth(50);
            tbl_giangvien.getColumnModel().getColumn(2).setResizable(false);
            tbl_giangvien.getColumnModel().getColumn(2).setPreferredWidth(100);
            tbl_giangvien.getColumnModel().getColumn(3).setResizable(false);
            tbl_giangvien.getColumnModel().getColumn(3).setPreferredWidth(30);
            tbl_giangvien.getColumnModel().getColumn(4).setResizable(false);
            tbl_giangvien.getColumnModel().getColumn(5).setResizable(false);
            tbl_giangvien.getColumnModel().getColumn(6).setResizable(false);
            tbl_giangvien.getColumnModel().getColumn(6).setPreferredWidth(100);
            tbl_giangvien.getColumnModel().getColumn(7).setResizable(false);
        }
        tbl_giangvien.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                chooseRow(tbl_giangvien.getSelectedRow());
            }
        });


        pnThem.setBackground(new java.awt.Color(4, 110, 57));
        pnThem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnThem.setBackground(new java.awt.Color(8, 130, 44));
        btnThem.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnThem.setText("Thêm");
        btnThem.setToolTipText("");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add();
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(("src/main/java/gui/image/add.png"))); // NOI18N

        javax.swing.GroupLayout pnThemLayout = new javax.swing.GroupLayout(pnThem);
        pnThem.setLayout(pnThemLayout);
        pnThemLayout.setHorizontalGroup(
            pnThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnThemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnThemLayout.setVerticalGroup(
            pnThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnSua.setBackground(new java.awt.Color(220, 128, 37));
        pnSua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnSua.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSua.setText("Sửa");
        btnSua.setToolTipText("");
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update();
            }
        });

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(("src/main/java/gui/image/edit.png"))); // NOI18N

        javax.swing.GroupLayout pnSuaLayout = new javax.swing.GroupLayout(pnSua);
        pnSua.setLayout(pnSuaLayout);
        pnSuaLayout.setHorizontalGroup(
            pnSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnSuaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnSuaLayout.setVerticalGroup(
            pnSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSuaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnXoa.setBackground(new java.awt.Color(173, 36, 36));
        pnXoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnXoa.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnXoa.setText("Xóa ");
        btnXoa.setToolTipText("");
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete();
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(("src/main/java/gui/image/delete.png"))); // NOI18N

        javax.swing.GroupLayout pnXoaLayout = new javax.swing.GroupLayout(pnXoa);
        pnXoa.setLayout(pnXoaLayout);
        pnXoaLayout.setHorizontalGroup(
            pnXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnXoaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnXoaLayout.setVerticalGroup(
            pnXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnXoaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnXuatFileExcel.setBackground(new java.awt.Color(38, 64, 38));
        pnXuatFileExcel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnXuatFileExcel.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        btnXuatFileExcel.setForeground(new java.awt.Color(255, 255, 255));
        btnXuatFileExcel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnXuatFileExcel.setText("Xuất file Excel");
        btnXuatFileExcel.setToolTipText("");
        btnXuatFileExcel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXuatFileExcelMouseClicked(evt);
            }
        });

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(("src/main/java/gui/image/excel.png"))); // NOI18N

        javax.swing.GroupLayout pnXuatFileExcelLayout = new javax.swing.GroupLayout(pnXuatFileExcel);
        pnXuatFileExcel.setLayout(pnXuatFileExcelLayout);
        pnXuatFileExcelLayout.setHorizontalGroup(
            pnXuatFileExcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnXuatFileExcelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXuatFileExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );
        pnXuatFileExcelLayout.setVerticalGroup(
            pnXuatFileExcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnXuatFileExcelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnXuatFileExcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXuatFileExcel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Lương:");

        txtLuong.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("SDT:");

        txtNgaySinh.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMa, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                    .addComponent(txtHo)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                    .addComponent(txtDiaChi)
                                    .addComponent(txtPhone)
                                    .addComponent(txtNgaySinh))))
                        .addGap(27, 27, 27)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pnTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pnTim1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(pnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pnXuatFileExcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 34, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbLoai)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(pnTim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnTim1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTimKiem))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnXuatFileExcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator1))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimMouseClicked

    }//GEN-LAST:event_btnTimMouseClicked

    private void btnTim1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTim1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTim1MouseClicked

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked

    }//GEN-LAST:event_btnThemMouseClicked

    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseClicked

    }//GEN-LAST:event_btnSuaMouseClicked

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked

    }//GEN-LAST:event_btnXoaMouseClicked

    private void btnXuatFileExcelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXuatFileExcelMouseClicked

    }//GEN-LAST:event_btnXuatFileExcelMouseClicked

    public void refreshField() {
        txtTimKiem.setText("");
        txtMa.setText(GiangVienBLL.generatorKey());
        txtHo.setText("");
        txtTen.setText("");
        cmbLoai.setSelectedIndex(0);
        txtPhone.setText("");
        txtNgaySinh.setText("");
        txtDiaChi.setText("");
        txtLuong.setText("");
    }
    public ArrayList<String> getField() {

        ArrayList<String> tmp = new ArrayList();
        tmp.add(txtMa.getText());
        tmp.add(txtHo.getText());
        tmp.add(txtTen.getText());
        tmp.add(txtDiaChi.getText());
        tmp.add(txtNgaySinh.getText());
        String s = cmbLoai.getSelectedItem().equals("Nam")? "0" : "1";
        tmp.add(s);
        tmp.add(txtLuong.getText());
        tmp.add(txtPhone.getText());


        return tmp;
    }
    public void add () {
        ArrayList<String> data = getField();
        Message m = giangVienBLL.add(data);
        if (m == Message.OK) {
            JOptionPane.showMessageDialog(null,Message.OK.toString());
            loadDanhSachGiangVien();

        } else {
            JOptionPane.showMessageDialog(null, m.toString());
            refreshField();
        }
    }
    public void update () {

        ArrayList<String> data = getField();

        Message m = giangVienBLL.update(data);
        if (m == Message.OK) {
            JOptionPane.showMessageDialog(null,Message.OK.toString());
            loadDanhSachGiangVien();
        } else {
            JOptionPane.showMessageDialog(null, m.toString());
            refreshField();
        }
    }
    private void loadDanhSachGiangVien()
    {
        refreshField();
        danhSachGiangVien=giangVienBLL.getList();
        renderStudentTable= (DefaultTableModel) tbl_giangvien.getModel();
        renderStudentTable.setNumRows(0);
        for (GiangVien index: danhSachGiangVien)
        {
            renderStudentTable.addRow(index.parseArray());
        }
        tbl_giangvien.setModel(renderStudentTable);
    }
    private void chooseRow(int row)
    {
        System.out.println(row);
        Vector temp=new Vector();
        for(int index=0;index<tbl_giangvien.getColumnCount();index++)
        {
            temp.add(tbl_giangvien.getValueAt(row,index));
        }
        txtMa.setText(""+temp.get(0));
        txtHo.setText((String) temp.get(1));
        txtTen.setText((String) temp.get(2));
        cmbLoai.setSelectedItem(temp.get(3));
        txtPhone.setText(Helpers.formatDate((Date) temp.get(4)));
        txtNgaySinh.setText(""+ temp.get(5));
        txtDiaChi.setText(""+ temp.get(6));
        txtLuong.setText(""+temp.get(7));

    }
    private void  delete() {
        if (JOptionPane.showConfirmDialog(null, "Bạn có thật sự muốn xóa! Nhấn Yes để xóa"  ,
                "Warning", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
            String id = getField().get(0);
            Message m = giangVienBLL.remove(id);
            JOptionPane.showMessageDialog(null, m.toString());
            loadDanhSachGiangVien();
        }
    }
    private void search() {
        String qry = txtTimKiem.getText();
        ArrayList<GiangVien> searchList = giangVienBLL.search(qry);
        danhSachGiangVien=searchList;
        renderStudentTable= (DefaultTableModel) tbl_giangvien.getModel();
        renderStudentTable.setNumRows(0);
        for (GiangVien index: danhSachGiangVien)
        {
            renderStudentTable.addRow(index.parseArray());
        }
        tbl_giangvien.setModel(renderStudentTable);

    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnSua;
    private javax.swing.JLabel btnThem;
    private javax.swing.JLabel btnTim;
    private javax.swing.JLabel btnTim1;
    private javax.swing.JLabel btnXoa;
    private javax.swing.JLabel btnXuatFileExcel;
    private javax.swing.JComboBox<String> cmbLoai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbl_giangvien;
    private javax.swing.JPanel pnSua;
    private javax.swing.JPanel pnThem;
    private javax.swing.JPanel pnTim;
    private javax.swing.JPanel pnTim1;
    private javax.swing.JPanel pnXoa;
    private javax.swing.JPanel pnXuatFileExcel;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtHo;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtLuong;
    // End of variables declaration//GEN-END:variables
}
