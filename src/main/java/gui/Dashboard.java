/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Pero
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navbar = new javax.swing.JPanel();
        close_icon = new javax.swing.JLabel();
        menu_sinhvien = new javax.swing.JPanel();
        lb_sinhvien = new javax.swing.JLabel();
        menu_giangvien = new javax.swing.JPanel();
        lb_giangvien = new javax.swing.JLabel();
        menu_khoahoc = new javax.swing.JPanel();
        lb_khoahoc = new javax.swing.JLabel();
        menu_lichhoc = new javax.swing.JPanel();
        lb_lichhoc = new javax.swing.JLabel();
        menu_diemso = new javax.swing.JPanel();
        lb_diemso = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        workspace = new javax.swing.JPanel();
        form_sinhvien = new gui.FormSinhVien();
        form_giangvien = new gui.FormGiangVien();
        form_khoahoc = new gui.FormKhoaHoc();
        form_lichhoc = new gui.FormLichHoc();
        form_phonghoc = new gui.FormPhongHoc();
        form_diemso = new gui.FormDiemSo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1400, 800));

        navbar.setBackground(new java.awt.Color(58, 58, 159));
        navbar.setPreferredSize(new java.awt.Dimension(1400, 60));

        close_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close_icon.setIcon(new javax.swing.ImageIcon(("src/main/java/gui/image/close.png"))); // NOI18N
        close_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_iconMouseClicked(evt);
            }
        });

        menu_sinhvien.setBackground(new java.awt.Color(102, 102, 255));
        menu_sinhvien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_sinhvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_sinhvienMouseClicked(evt);
            }
        });

        lb_sinhvien.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        lb_sinhvien.setForeground(new java.awt.Color(255, 255, 255));
        lb_sinhvien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_sinhvien.setIcon(new javax.swing.ImageIcon(("src/main/java/gui/image/sinhvien.png"))); // NOI18N

        javax.swing.GroupLayout menu_sinhvienLayout = new javax.swing.GroupLayout(menu_sinhvien);
        menu_sinhvien.setLayout(menu_sinhvienLayout);
        menu_sinhvienLayout.setHorizontalGroup(
            menu_sinhvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_sinhvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menu_sinhvienLayout.setVerticalGroup(
            menu_sinhvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_sinhvien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menu_giangvien.setBackground(new java.awt.Color(102, 102, 255));
        menu_giangvien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_giangvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_giangvienMouseClicked(evt);
            }
        });

        lb_giangvien.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        lb_giangvien.setForeground(new java.awt.Color(255, 255, 255));
        lb_giangvien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_giangvien.setIcon(new javax.swing.ImageIcon(("src/main/java/gui/image/giangvien.png"))); // NOI18N

        javax.swing.GroupLayout menu_giangvienLayout = new javax.swing.GroupLayout(menu_giangvien);
        menu_giangvien.setLayout(menu_giangvienLayout);
        menu_giangvienLayout.setHorizontalGroup(
            menu_giangvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_giangvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menu_giangvienLayout.setVerticalGroup(
            menu_giangvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_giangvien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menu_khoahoc.setBackground(new java.awt.Color(102, 102, 255));
        menu_khoahoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_khoahoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_khoahocMouseClicked(evt);
            }
        });

        lb_khoahoc.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        lb_khoahoc.setForeground(new java.awt.Color(255, 255, 255));
        lb_khoahoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_khoahoc.setIcon(new javax.swing.ImageIcon(("src/main/java/gui/image/khoahoc.png"))); // NOI18N

        javax.swing.GroupLayout menu_khoahocLayout = new javax.swing.GroupLayout(menu_khoahoc);
        menu_khoahoc.setLayout(menu_khoahocLayout);
        menu_khoahocLayout.setHorizontalGroup(
            menu_khoahocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_khoahoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menu_khoahocLayout.setVerticalGroup(
            menu_khoahocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_khoahoc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menu_lichhoc.setBackground(new java.awt.Color(102, 102, 255));
        menu_lichhoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_lichhoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_lichhocMouseClicked(evt);
            }
        });

        lb_lichhoc.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        lb_lichhoc.setForeground(new java.awt.Color(255, 255, 255));
        lb_lichhoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_lichhoc.setIcon(new javax.swing.ImageIcon(("src/main/java/gui/image/lichhoc.png"))); // NOI18N

        javax.swing.GroupLayout menu_lichhocLayout = new javax.swing.GroupLayout(menu_lichhoc);
        menu_lichhoc.setLayout(menu_lichhocLayout);
        menu_lichhocLayout.setHorizontalGroup(
            menu_lichhocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_lichhoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menu_lichhocLayout.setVerticalGroup(
            menu_lichhocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_lichhoc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menu_diemso.setBackground(new java.awt.Color(102, 102, 255));
        menu_diemso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_diemso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_diemsoMouseClicked(evt);
            }
        });

        lb_diemso.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        lb_diemso.setForeground(new java.awt.Color(255, 255, 255));
        lb_diemso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_diemso.setIcon(new javax.swing.ImageIcon(("src/main/java/gui/image/diemso.png"))); // NOI18N

        javax.swing.GroupLayout menu_diemsoLayout = new javax.swing.GroupLayout(menu_diemso);
        menu_diemso.setLayout(menu_diemsoLayout);
        menu_diemsoLayout.setHorizontalGroup(
            menu_diemsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_diemso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menu_diemsoLayout.setVerticalGroup(
            menu_diemsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_diemso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(("src/main/java/gui/image/logo_icon.png"))); // NOI18N

        javax.swing.GroupLayout navbarLayout = new javax.swing.GroupLayout(navbar);
        navbar.setLayout(navbarLayout);
        navbarLayout.setHorizontalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu_sinhvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu_giangvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu_khoahoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(menu_lichhoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu_diemso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 505, Short.MAX_VALUE)
                .addComponent(close_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        navbarLayout.setVerticalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu_sinhvien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menu_giangvien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menu_khoahoc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menu_lichhoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menu_diemso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(navbarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(close_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        workspace.setBackground(new java.awt.Color(255, 255, 255));
        workspace.setPreferredSize(new java.awt.Dimension(1400, 740));
        workspace.setLayout(new java.awt.CardLayout());
        workspace.add(form_sinhvien, "card3");
        workspace.add(form_giangvien, "card4");
        workspace.add(form_khoahoc, "card5");
        workspace.add(form_lichhoc, "card6");
        workspace.add(form_phonghoc, "card7");
        workspace.add(form_diemso, "card8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(workspace, javax.swing.GroupLayout.PREFERRED_SIZE, 1400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(workspace, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void close_iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_iconMouseClicked
        System.exit(0);
    }//GEN-LAST:event_close_iconMouseClicked

    private void menu_sinhvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_sinhvienMouseClicked
        
        lb_sinhvien.setIcon(new javax.swing.ImageIcon("src/main/java/gui/image/selected_sinhvien.png"));
        lb_giangvien.setIcon(new javax.swing.ImageIcon("src/main/java/gui/image/giangvien.png"));
        lb_khoahoc.setIcon(new javax.swing.ImageIcon("src/main/java/gui/image/khoahoc.png"));
        lb_lichhoc.setIcon(new javax.swing.ImageIcon("src/main/java/gui/image/lichhoc.png"));
        lb_diemso.setIcon(new javax.swing.ImageIcon("src/main/java/gui/image/diemso.png"));
        
        form_sinhvien.setVisible(true);
        form_giangvien.setVisible(false);
        form_khoahoc.setVisible(false);
        form_lichhoc.setVisible(false);
        form_phonghoc.setVisible(false);
        form_diemso.setVisible(false);

    }//GEN-LAST:event_menu_sinhvienMouseClicked

    private void menu_giangvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_giangvienMouseClicked
        
        lb_sinhvien.setIcon(new javax.swing.ImageIcon("src/main/java/gui/image/sinhvien.png"));
        lb_giangvien.setIcon(new javax.swing.ImageIcon("src/main/java/gui/image/selected_giangvien.png"));
        lb_khoahoc.setIcon(new javax.swing.ImageIcon("src/main/java/gui/image/khoahoc.png"));
        lb_lichhoc.setIcon(new javax.swing.ImageIcon("src/main/java/gui/image/lichhoc.png"));
        lb_diemso.setIcon(new javax.swing.ImageIcon("src/main/java/gui/image/diemso.png"));
        
        form_sinhvien.setVisible(false);
        form_giangvien.setVisible(true);
        form_khoahoc.setVisible(false);
        form_lichhoc.setVisible(false);
        form_phonghoc.setVisible(false);
        form_diemso.setVisible(false);

    }//GEN-LAST:event_menu_giangvienMouseClicked

    private void menu_khoahocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_khoahocMouseClicked
        
        lb_sinhvien.setIcon(new javax.swing.ImageIcon("src/main/java/gui/image/sinhvien.png"));
        lb_giangvien.setIcon(new javax.swing.ImageIcon("src/main/java/gui/image/giangvien.png"));
        lb_khoahoc.setIcon(new javax.swing.ImageIcon("src/main/java/gui/image/selected_khoahoc.png"));
        lb_lichhoc.setIcon(new javax.swing.ImageIcon("src/main/java/gui/image/lichhoc.png"));
        lb_diemso.setIcon(new javax.swing.ImageIcon("src/main/java/gui/image/diemso.png"));
        
        form_sinhvien.setVisible(false);
        form_giangvien.setVisible(false);
        form_khoahoc.setVisible(true);
        form_lichhoc.setVisible(false);
        form_phonghoc.setVisible(false);
        form_diemso.setVisible(false);
    }//GEN-LAST:event_menu_khoahocMouseClicked

    private void menu_lichhocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_lichhocMouseClicked
        
        lb_sinhvien.setIcon(new javax.swing.ImageIcon("src/main/java/gui/image/sinhvien.png"));
        lb_giangvien.setIcon(new javax.swing.ImageIcon("src/main/java/gui/image/giangvien.png"));
        lb_khoahoc.setIcon(new javax.swing.ImageIcon("src/main/java/gui/image/khoahoc.png"));
        lb_lichhoc.setIcon(new javax.swing.ImageIcon("src/main/java/gui/image/selected_lichhoc.png"));
        lb_diemso.setIcon(new javax.swing.ImageIcon("src/main/java/gui/image/diemso.png"));
        
        form_sinhvien.setVisible(false);
        form_giangvien.setVisible(false);
        form_khoahoc.setVisible(false);
        form_lichhoc.setVisible(true);
        form_phonghoc.setVisible(false);
        form_diemso.setVisible(false);
    }//GEN-LAST:event_menu_lichhocMouseClicked

    private void menu_diemsoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_diemsoMouseClicked
        
        lb_sinhvien.setIcon(new javax.swing.ImageIcon("src/main/java/gui/image/sinhvien.png"));
        lb_giangvien.setIcon(new javax.swing.ImageIcon("src/main/java/gui/image/giangvien.png"));
        lb_khoahoc.setIcon(new javax.swing.ImageIcon("src/main/java/gui/image/khoahoc.png"));
        lb_lichhoc.setIcon(new javax.swing.ImageIcon("src/main/java/gui/image/lichhoc.png"));
        lb_diemso.setIcon(new javax.swing.ImageIcon("src/main/java/gui/image/selected_diemso.png"));
        
        form_sinhvien.setVisible(false);
        form_giangvien.setVisible(false);
        form_khoahoc.setVisible(false);
        form_lichhoc.setVisible(false);
        form_phonghoc.setVisible(false);
        form_diemso.setVisible(true);
    }//GEN-LAST:event_menu_diemsoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close_icon;
    private gui.FormDiemSo form_diemso;
    private gui.FormGiangVien form_giangvien;
    private gui.FormKhoaHoc form_khoahoc;
    private gui.FormLichHoc form_lichhoc;
    private gui.FormPhongHoc form_phonghoc;
    private gui.FormSinhVien form_sinhvien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb_diemso;
    private javax.swing.JLabel lb_giangvien;
    private javax.swing.JLabel lb_khoahoc;
    private javax.swing.JLabel lb_lichhoc;
    private javax.swing.JLabel lb_sinhvien;
    private javax.swing.JPanel menu_diemso;
    private javax.swing.JPanel menu_giangvien;
    private javax.swing.JPanel menu_khoahoc;
    private javax.swing.JPanel menu_lichhoc;
    private javax.swing.JPanel menu_sinhvien;
    private javax.swing.JPanel navbar;
    private javax.swing.JPanel workspace;
    // End of variables declaration//GEN-END:variables
}
