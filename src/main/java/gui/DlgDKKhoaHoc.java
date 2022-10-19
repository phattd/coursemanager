package gui;


import bll.DiemSoBLL;
import bll.KhoaHocBLL;
import bll.LichHocBLL;
import dto.DiemSo;
import dto.KhoaHoc;
import resoure.type.Message;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class DlgDKKhoaHoc extends javax.swing.JDialog {
    private KhoaHocBLL khoaHocBLL=new KhoaHocBLL();
    private DiemSoBLL diemSoBLL = new DiemSoBLL();
    private DefaultTableModel renderCourseTable=new DefaultTableModel();
    private ArrayList<KhoaHoc> danhSachKhoaHoc=new ArrayList<>();
    private Message message = Message.CLOSE_EVENT;
    private String idHocVien;

    public DlgDKKhoaHoc(String idHocVien) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setModal(true);
        this.setResizable(false);
        this.idHocVien = idHocVien;
        loadDanhSachKhoaHoc();
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pnThem = new javax.swing.JPanel();
        btnThem = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_khoahoc = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Chọn khóa học");
        jPanel1.add(jLabel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        pnThem.setBackground(new java.awt.Color(4, 110, 57));
        pnThem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnThem.setBackground(new java.awt.Color(8, 130, 44));
        btnThem.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnThem.setText("Chọn");
        btnThem.setToolTipText("");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signup();
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon("src/main/java/gui/image/checkmark.png")); // NOI18N

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

        jPanel2.add(pnThem);

        tbl_khoahoc.setBackground(new java.awt.Color(255, 255, 255));
        tbl_khoahoc.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        tbl_khoahoc.setForeground(new java.awt.Color(2, 2, 2));
        tbl_khoahoc.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã KH", "Tên khóa học", "Ngày bắt đầu", "Ngày kết thúc", "Số tiết"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_khoahoc.setRowHeight(36);
        tbl_khoahoc.setSelectionBackground(new java.awt.Color(153, 153, 255));
        tbl_khoahoc.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tbl_khoahoc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        this.dispose();

    }//GEN-LAST:event_btnThemMouseClicked
    private void loadDanhSachKhoaHoc()
    {

        danhSachKhoaHoc=khoaHocBLL.getListNotOpeningAndNotInvite(this.idHocVien);
        renderCourseTable= (DefaultTableModel) tbl_khoahoc.getModel();
        renderCourseTable.setNumRows(0);
        for (KhoaHoc index: danhSachKhoaHoc)
        {
            renderCourseTable.addRow(index.parseArray());
        }
        tbl_khoahoc.setModel(renderCourseTable);
    }
    private void signup()
    {
        int row= tbl_khoahoc.getSelectedRow();
        if(row==-1)
        {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn khóa học.");
        }
        else
        {
            Vector temp=new Vector();
            for(int i=0;i<renderCourseTable.getColumnCount();i++)
            {
                temp.add(tbl_khoahoc.getValueAt(row,i));
            }
            ArrayList<String> list =new ArrayList<>();
            String idKhoaHoc = (String) temp.get(0);
            list.add(idHocVien);
            list.add(idKhoaHoc);
            list.add("0");
            list.add("0");
            list.add("0");
            this.message = diemSoBLL.add(list);
            this.dispose();
        }
    }
    public Message getMessage() {
        return message;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnThem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_khoahoc;
    private javax.swing.JPanel pnThem;
    // End of variables declaration//GEN-END:variables
}
