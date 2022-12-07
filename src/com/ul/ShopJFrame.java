/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ul;

import java.awt.*;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import com.utils.Auth;
import com.utils.Hover;
import com.utils.TabbedPane;

/**
 *
 * @author korea
 */
public class ShopJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ShopJFrame
     */
    public ShopJFrame() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgSex = new javax.swing.ButtonGroup();
        btgVaiTro = new javax.swing.ButtonGroup();
        pnlBackground = new javax.swing.JPanel();
        pnlHeader = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblClock = new javax.swing.JLabel();
        pnlMenu = new javax.swing.JPanel();
        btnSanPham = new javax.swing.JPanel();
        label2 = new javax.swing.JLabel();
        btnKhuyenMai = new javax.swing.JPanel();
        label3 = new javax.swing.JLabel();
        btnBanHang = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        btnThemNhanVien = new javax.swing.JPanel();
        label5 = new javax.swing.JLabel();
        btnThongKe = new javax.swing.JPanel();
        label4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnDangXuat = new javax.swing.JLabel();
        lblVaiTro = new javax.swing.JLabel();
        lblTenNV = new javax.swing.JLabel();
        pnlCards = new javax.swing.JPanel();
        pnlBanHang = new com.ul.BanHangPanel();
        pnlKhuyenMai = new com.ul.KhuyenMaiPanel();
        pnlSanPham = new com.ul.SanPhamPanel();
        pnlNhanVien = new com.ul.ThemNhanVienPanel();
        pnlThongKe = new com.ul.ThongKePanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlBackground.setLayout(new java.awt.BorderLayout());

        pnlHeader.setBackground(new java.awt.Color(204, 255, 0));

        jLabel3.setBackground(new java.awt.Color(255, 204, 204));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/image/icons8_adidas_trefoil_95px.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setText("SECONDHAND SHOP");

        lblClock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/image/icons8_alarm_clock_20px.png"))); // NOI18N
        lblClock.setText("Clock");

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblClock, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pnlHeaderLayout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeaderLayout.createSequentialGroup()
                        .addComponent(lblClock, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pnlBackground.add(pnlHeader, java.awt.BorderLayout.NORTH);

        pnlMenu.setBackground(new java.awt.Color(255, 204, 204));
        pnlMenu.setPreferredSize(new java.awt.Dimension(160, 560));

        btnSanPham.setBackground(new java.awt.Color(255, 204, 204));
        btnSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSanPhamMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSanPhamMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSanPhamMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSanPhamMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSanPhamMouseReleased(evt);
            }
        });

        label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label2.setText("SẢN PHẨM");

        javax.swing.GroupLayout btnSanPhamLayout = new javax.swing.GroupLayout(btnSanPham);
        btnSanPham.setLayout(btnSanPhamLayout);
        btnSanPhamLayout.setHorizontalGroup(
            btnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnSanPhamLayout.setVerticalGroup(
            btnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnKhuyenMai.setBackground(new java.awt.Color(255, 204, 204));
        btnKhuyenMai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKhuyenMaiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnKhuyenMaiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnKhuyenMaiMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnKhuyenMaiMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnKhuyenMaiMouseReleased(evt);
            }
        });

        label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label3.setText("KHUYẾN MÃI");

        javax.swing.GroupLayout btnKhuyenMaiLayout = new javax.swing.GroupLayout(btnKhuyenMai);
        btnKhuyenMai.setLayout(btnKhuyenMaiLayout);
        btnKhuyenMaiLayout.setHorizontalGroup(
            btnKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnKhuyenMaiLayout.setVerticalGroup(
            btnKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnKhuyenMaiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
        );

        btnBanHang.setBackground(new java.awt.Color(255, 204, 204));
        btnBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBanHangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBanHangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBanHangMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBanHangMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnBanHangMouseReleased(evt);
            }
        });

        label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label1.setText("BÁN HÀNG");

        javax.swing.GroupLayout btnBanHangLayout = new javax.swing.GroupLayout(btnBanHang);
        btnBanHang.setLayout(btnBanHangLayout);
        btnBanHangLayout.setHorizontalGroup(
            btnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnBanHangLayout.setVerticalGroup(
            btnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBanHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
        );

        btnThemNhanVien.setBackground(new java.awt.Color(255, 204, 204));
        btnThemNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemNhanVienMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThemNhanVienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThemNhanVienMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnThemNhanVienMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnThemNhanVienMouseReleased(evt);
            }
        });

        label5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label5.setText("THÊM NHÂN VIÊN");

        javax.swing.GroupLayout btnThemNhanVienLayout = new javax.swing.GroupLayout(btnThemNhanVien);
        btnThemNhanVien.setLayout(btnThemNhanVienLayout);
        btnThemNhanVienLayout.setHorizontalGroup(
            btnThemNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnThemNhanVienLayout.setVerticalGroup(
            btnThemNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnThemNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnThongKe.setBackground(new java.awt.Color(255, 204, 204));
        btnThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThongKeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThongKeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThongKeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnThongKeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnThongKeMouseReleased(evt);
            }
        });

        label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label4.setText("THỐNG KÊ");

        javax.swing.GroupLayout btnThongKeLayout = new javax.swing.GroupLayout(btnThongKe);
        btnThongKe.setLayout(btnThongKeLayout);
        btnThongKeLayout.setHorizontalGroup(
            btnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnThongKeLayout.setVerticalGroup(
            btnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnThongKeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        btnDangXuat.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnDangXuat.setForeground(new java.awt.Color(255, 51, 51));
        btnDangXuat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDangXuat.setText("Đăng Xuất");
        btnDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDangXuatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDangXuatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDangXuatMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        lblVaiTro.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblVaiTro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVaiTro.setText("Vai trò");

        lblTenNV.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblTenNV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTenNV.setText("Tên Nhân Viên");
        lblTenNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTenNVMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTenNVMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTenNVMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblTenNVMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblTenNVMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnKhuyenMai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnBanHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnThemNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblTenNV, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
            .addComponent(lblVaiTro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThemNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addComponent(lblVaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlBackground.add(pnlMenu, java.awt.BorderLayout.WEST);

        pnlCards.setLayout(new java.awt.CardLayout());
        pnlCards.add(pnlBanHang, "card2");
        pnlCards.add(pnlKhuyenMai, "card3");
        pnlCards.add(pnlSanPham, "card4");
        pnlCards.add(pnlNhanVien, "card5");
        pnlCards.add(pnlThongKe, "card6");

        pnlBackground.add(pnlCards, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblTenNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTenNVMouseClicked
        // TODO add your handling code here:
        new ThongTinCaNhan(this,true).setVisible(true);
    }//GEN-LAST:event_lblTenNVMouseClicked

    private void lblTenNVMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTenNVMousePressed
        // TODO add your handling code here:
        h.changeCursor(true, lblTenNV);
    }//GEN-LAST:event_lblTenNVMousePressed

    private void lblTenNVMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTenNVMouseReleased
        // TODO add your handling code here:
        h.changeCursor(false, lblTenNV);

    }//GEN-LAST:event_lblTenNVMouseReleased

    private void btnDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangXuatMouseClicked
        // TODO add your handling code here:
        new LoginJDialog(this,true).setVisible(true);
        setTenNV();
        manager();
        SanPhamPanel.showBtnThemLoai();
    }//GEN-LAST:event_btnDangXuatMouseClicked

    private void btnDangXuatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangXuatMouseEntered
        // TODO add your handling code here:
        h.changeCursorRED(true, btnDangXuat);

    }//GEN-LAST:event_btnDangXuatMouseEntered

    private void btnDangXuatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangXuatMouseExited
        // TODO add your handling code here:
        h.changeCursorRED(false, btnDangXuat);

    }//GEN-LAST:event_btnDangXuatMouseExited

    private void lblTenNVMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTenNVMouseEntered
        // TODO add your handling code here:
        h.changeCursor(true, lblTenNV);
    }//GEN-LAST:event_lblTenNVMouseEntered

    private void lblTenNVMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTenNVMouseExited
        // TODO add your handling code here:
        h.changeCursor(false, lblTenNV);

    }//GEN-LAST:event_lblTenNVMouseExited

    private void btnSanPhamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSanPhamMouseEntered
        // TODO add your handling code here:
        h.changeCursor(true, label2);
    }//GEN-LAST:event_btnSanPhamMouseEntered

    private void btnSanPhamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSanPhamMouseExited
        // TODO add your handling code here:
        h.changeCursor(false, label2);

    }//GEN-LAST:event_btnSanPhamMouseExited

    private void btnKhuyenMaiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKhuyenMaiMouseEntered
        // TODO add your handling code here:
        h.changeCursor(true, label3);

    }//GEN-LAST:event_btnKhuyenMaiMouseEntered

    private void btnKhuyenMaiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKhuyenMaiMouseExited
        // TODO add your handling code here:
        h.changeCursor(false, label3);

    }//GEN-LAST:event_btnKhuyenMaiMouseExited

    private void btnBanHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBanHangMouseEntered
        // TODO add your handling code here:
        h.changeCursor(true, label1);

    }//GEN-LAST:event_btnBanHangMouseEntered

    private void btnBanHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBanHangMouseExited
        // TODO add your handling code here:
        h.changeCursor(false, label1);

    }//GEN-LAST:event_btnBanHangMouseExited

    private void btnThemNhanVienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemNhanVienMouseEntered
        // TODO add your handling code here:
        h.changeCursor(true, label5);

    }//GEN-LAST:event_btnThemNhanVienMouseEntered

    private void btnThemNhanVienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemNhanVienMouseExited
        // TODO add your handling code here:
        h.changeCursor(false, label5);

    }//GEN-LAST:event_btnThemNhanVienMouseExited

    private void btnThongKeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongKeMouseEntered
        // TODO add your handling code here:
        h.changeCursor(true, label4);

    }//GEN-LAST:event_btnThongKeMouseEntered

    private void btnThongKeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongKeMouseExited
        // TODO add your handling code here:
        h.changeCursor(false, label4);

    }//GEN-LAST:event_btnThongKeMouseExited

    private void btnKhuyenMaiMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnKhuyenMaiMouseClicked
        // TODO add your handling code here:
        t.changePanel(pnlKhuyenMai, pnlCards);

    }// GEN-LAST:event_btnKhuyenMaiMouseClicked

    private void btnThemNhanVienMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnThemNhanVienMouseClicked
        // TODO add your handling code here:
        t.changePanel(pnlNhanVien, pnlCards);

    }// GEN-LAST:event_btnThemNhanVienMouseClicked

    private void btnSanPhamMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnSanPhamMouseClicked
        // TODO add your handling code here:
        t.changePanel(pnlSanPham, pnlCards);

    }// GEN-LAST:event_btnSanPhamMouseClicked

    private void btnBanHangMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnBanHangMouseClicked
        // TODO add your handling code here:
        t.changePanel(pnlBanHang, pnlCards);

    }// GEN-LAST:event_btnBanHangMouseClicked

    private void btnThongKeMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnThongKeMouseClicked
        // TODO add your handling code here:
        t.changePanel(pnlThongKe, pnlCards);

    }// GEN-LAST:event_btnThongKeMouseClicked

    private void btnSanPhamMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnSanPhamMousePressed
        // TODO add your handling code here:
        h.changeCursorClick(true, btnSanPham);

    }// GEN-LAST:event_btnSanPhamMousePressed

    private void btnKhuyenMaiMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnKhuyenMaiMousePressed
        // TODO add your handling code here:
        h.changeCursorClick(true, btnKhuyenMai);

    }// GEN-LAST:event_btnKhuyenMaiMousePressed

    private void btnBanHangMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnBanHangMousePressed
        // TODO add your handling code here:
        h.changeCursorClick(true, btnBanHang);

    }// GEN-LAST:event_btnBanHangMousePressed

    private void btnThemNhanVienMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnThemNhanVienMousePressed
        // TODO add your handling code here:
        h.changeCursorClick(true, btnThemNhanVien);

    }// GEN-LAST:event_btnThemNhanVienMousePressed

    private void btnThongKeMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnThongKeMousePressed
        // TODO add your handling code here:
        h.changeCursorClick(true, btnThongKe);

    }// GEN-LAST:event_btnThongKeMousePressed

    private void btnSanPhamMouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnSanPhamMouseReleased
        // TODO add your handling code here:
        h.changeCursorClick(false, btnSanPham);

    }// GEN-LAST:event_btnSanPhamMouseReleased

    private void btnKhuyenMaiMouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnKhuyenMaiMouseReleased
        // TODO add your handling code here:
        h.changeCursorClick(false, btnKhuyenMai);

    }// GEN-LAST:event_btnKhuyenMaiMouseReleased

    private void btnBanHangMouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnBanHangMouseReleased
        // TODO add your handling code here:
        h.changeCursorClick(false, btnBanHang);

    }// GEN-LAST:event_btnBanHangMouseReleased

    private void btnThemNhanVienMouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnThemNhanVienMouseReleased
        // TODO add your handling code here:
        h.changeCursorClick(false, btnThemNhanVien);


    }// GEN-LAST:event_btnThemNhanVienMouseReleased

    private void btnThongKeMouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnThongKeMouseReleased
        // TODO add your handling code here:
        h.changeCursorClick(false, btnThongKe);

    }// GEN-LAST:event_btnThongKeMouseReleased
    TabbedPane t = new TabbedPane();
    Hover h = new Hover();

    private void init() {
        new LoadingJDialog(this,true).setVisible(true);
        new LoginJDialog(this,true).setVisible(true);
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setTitle("Secondhand Shop");
        SanPhamPanel.showBtnThemLoai();
        setIconApp();
        showClock();
        setTenNV();
        manager();
        Rectangle r = this.getBounds();
        int h = r.height;
        int w = r.width;
        Dimension d = new Dimension(pnlMenu.getWidth(),h);
        pnlMenu.setPreferredSize(d);
        
    }
    private void manager() {
        btnThemNhanVien.setVisible(false);
        if(Auth.user.getVaiTro()){
            btnThemNhanVien.setVisible(true);
        }
    }
    

    private void setTenNV() {
        lblTenNV.setText(Auth.user.getTen());
        if(Auth.user.getVaiTro()){
            lblVaiTro.setText("Quản lý");
        }
        else {
            lblVaiTro.setText("Nhân Viên");

        }
    }
 
    

    private void setIconApp() {
        URL iconUrl = getClass().getResource("/com/image/icons8_adidas_trefoil_95px.png");
        ImageIcon icon = new ImageIcon(iconUrl);
        this.setIconImage(icon.getImage());
    }

    private void showClock() {
        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                try {

                    while (true) {
                        Date date = new Date();
                        SimpleDateFormat s = new SimpleDateFormat("HH:mm:ss");
                        String time = s.format(date);
                        lblClock.setText(time);
                        Thread.sleep(1000);
                        // TODO Auto-generated catch block
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });
        t.start();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ShopJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShopJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShopJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShopJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShopJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgSex;
    private javax.swing.ButtonGroup btgVaiTro;
    private javax.swing.JPanel btnBanHang;
    private javax.swing.JLabel btnDangXuat;
    private javax.swing.JPanel btnKhuyenMai;
    private javax.swing.JPanel btnSanPham;
    private javax.swing.JPanel btnThemNhanVien;
    private javax.swing.JPanel btnThongKe;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel lblClock;
    private javax.swing.JLabel lblTenNV;
    private javax.swing.JLabel lblVaiTro;
    private javax.swing.JPanel pnlBackground;
    private com.ul.BanHangPanel pnlBanHang;
    private javax.swing.JPanel pnlCards;
    private javax.swing.JPanel pnlHeader;
    private com.ul.KhuyenMaiPanel pnlKhuyenMai;
    private javax.swing.JPanel pnlMenu;
    private com.ul.ThemNhanVienPanel pnlNhanVien;
    private com.ul.SanPhamPanel pnlSanPham;
    private com.ul.ThongKePanel pnlThongKe;
    // End of variables declaration//GEN-END:variables
}
