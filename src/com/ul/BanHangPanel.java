/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package com.ul;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import com.DAO.KhachHangDAO;
import com.DAO.KhuyenMaiDAO;
import com.DAO.SanPhamDAO;
import com.entity.KhachHang;
import com.entity.SanPham;
import com.utils.XMessage;

/**
 *
 * @author korea
 */
public class BanHangPanel extends javax.swing.JPanel {

    /** Creates new form BanHangPanel */
    public BanHangPanel() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSanPham = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        pnlTrangThaiHoaDon5 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblKhachHang = new javax.swing.JTable();
        txtTimKH = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        pnlTaoHD = new javax.swing.JPanel();
        pnlHoaDon = new com.ul.HoaDonPanel();

        pnlSanPham.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSanPham);

        javax.swing.GroupLayout pnlSanPhamLayout = new javax.swing.GroupLayout(pnlSanPham);
        pnlSanPham.setLayout(pnlSanPhamLayout);
        pnlSanPhamLayout.setHorizontalGroup(
            pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSanPhamLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        pnlSanPhamLayout.setVerticalGroup(
            pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSanPhamLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pnlTrangThaiHoaDon5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhachHangMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(tblKhachHang);

        txtTimKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKHActionPerformed(evt);
            }
        });
        txtTimKH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimKHKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKHKeyReleased(evt);
            }
        });

        jLabel1.setText("Tìm khách hàng :");

        javax.swing.GroupLayout pnlTrangThaiHoaDon5Layout = new javax.swing.GroupLayout(pnlTrangThaiHoaDon5);
        pnlTrangThaiHoaDon5.setLayout(pnlTrangThaiHoaDon5Layout);
        pnlTrangThaiHoaDon5Layout.setHorizontalGroup(
            pnlTrangThaiHoaDon5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTrangThaiHoaDon5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTrangThaiHoaDon5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTimKH, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTrangThaiHoaDon5Layout.setVerticalGroup(
            pnlTrangThaiHoaDon5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTrangThaiHoaDon5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtTimKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTrangThaiHoaDon5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pnlTaoHD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlTaoHD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlTaoHD.add(pnlHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 500, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlTrangThaiHoaDon5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlTaoHD, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlTaoHD, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlTrangThaiHoaDon5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKHActionPerformed
        // TODO add your handling code here:
        fillTableKH();

    }//GEN-LAST:event_txtTimKHActionPerformed

    private void tblKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachHangMouseClicked
        // TODO add your handling code here:
        rowKH = tblKhachHang.getSelectedRow();
    }//GEN-LAST:event_tblKhachHangMouseClicked

    private void txtTimKHKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKHKeyPressed
        // TODO add your handling code here:
        fillTableKH();
    }//GEN-LAST:event_txtTimKHKeyPressed

    private void txtTimKHKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKHKeyReleased
        // TODO add your handling code here:
        fillTableKH();
    }//GEN-LAST:event_txtTimKHKeyReleased

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tblSanPhamMouseClicked
        // TODO add your handling code here:
    }// GEN-LAST:event_tblSanPhamMouseClicked

    private void init() {
        taoHoaDon();
        fillTableSP();
        fillTableKH();
        chonSP();
        xoaSP();
        chonKH();
        rowKH = -1;
        txtTimKH.setText("");

    }
    public static int getMaKH() {
        if(rowKH != -1){
            int maKH = (int) tblKhachHang.getValueAt(rowKH, 0);
            return maKH;
        }
        return -1;
    }

    static int rowKH = -1;
    private static SanPhamDAO daoSP = new SanPhamDAO();
    private static KhachHangDAO daoKH = new KhachHangDAO();
    private KhuyenMaiDAO daoKM = new KhuyenMaiDAO();


    public static void fillTableKH() {
        try {
            String header[] = { "Mã KH", "Tên KH", "SĐT", "Điểm tích lũy"};
            DefaultTableModel model = new DefaultTableModel(header, 0);
            tblKhachHang.setModel(model);
            List<Object[]> list = daoKH.selectByTimKiem(txtTimKH.getText());
            for (Object[] kh : list) {
                model.addRow(kh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void fillTableSP() {
        String header[] = { "Mã SP", "Tên SP", "Mã Loại", "Size", "Trạng thái", "Số Lượng", "Hình ảnh" };
        DefaultTableModel model = new DefaultTableModel(header, 0);
        tblSanPham.setModel(model);
        try {
            List<SanPham> list = daoSP.selectAll();
            for (SanPham sp : list) {
                    Object[] row = {
                            sp.getMaSP(), sp.getTenSP(), sp.getMaLoai(), sp.getSize(), sp.getTrangThai(),
                            sp.getSoLuong(), sp.getHinhAnh()};
                    model.addRow(row);
            }   
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    static int row = -1;
    public static ArrayList<SanPham> listSP = new ArrayList<>();

    private void chonSP() {
        final JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem addItem = new JMenuItem("Thêm sản phẩm");
        addItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                row = tblSanPham.getSelectedRow();
                String maSP = (String) tblSanPham.getValueAt(row, 0);
                SanPham sp = daoSP.selectByID(maSP);
                if(sp.getTrangThai().equalsIgnoreCase("Hết hàng")){
                    XMessage.alert(BanHangPanel.this, "Sản phẩm đã hết hàng");
                }else{
                    listSP.add(sp);
                    fillTableSL(listSP);
                }
                HoaDonPanel.txtTongTien.setText("" + HoaDonPanel.getTongTien());

            }
        });
        popupMenu.add(addItem);
        tblSanPham.setComponentPopupMenu(popupMenu);
    }
    
    private void chonKH() {
        final JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem addItem = new JMenuItem("Chọn khách hàng");
        addItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                row = tblKhachHang.getSelectedRow();
                int maKH = (int) tblKhachHang.getValueAt(row, 0);
                KhachHang kh = daoKH.selectByID(maKH);
                HoaDonPanel.setFormKhachHang(kh);
                
            }
        });
        popupMenu.add(addItem);
        tblKhachHang.setComponentPopupMenu(popupMenu);
    }

    public void xoaSP() {
        final JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem deleteItem = new JMenuItem("Xóa sản phẩm");
        deleteItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                row = HoaDonPanel.tblSoLuongSP.getSelectedRow();
                String maSP = (String) HoaDonPanel.tblSoLuongSP.getValueAt(row, 0);
                SanPham s = null;
                for (SanPham sp : listSP) {
                    if (sp.getMaSP().equals(maSP)) {
                        s = sp;
                        break;
                    }
                }
                listSP.remove(s);
                fillTableSL(listSP);
                HoaDonPanel.txtTongTien.setText("" + HoaDonPanel.getTongTien());

            }
        });
        popupMenu.add(deleteItem);
        HoaDonPanel.tblSoLuongSP.setComponentPopupMenu(popupMenu);
    }

    private void fillTableSL(List<SanPham> list) {
        Date now = new Date();
        String[] header = { "Mã SP", "Tên SP", "Size", "Đơn Giá","Giảm Giá", "Số Lượng", "Tổng tiền" };
        DefaultTableModel model = new DefaultTableModel(header, 0);
        HoaDonPanel.tblSoLuongSP.setModel(model);
        for (SanPham sp : list) {
            int soLuong = 1;
            Double ptkm = daoKM.getPhanTramKhuyenMai(sp.getMaSP(), now);
            if(ptkm == null) ptkm = 0.;
            Double giaSP = sp.getGiaSP() - (sp.getGiaSP() * (ptkm/100));
            Double tt = giaSP * soLuong;
            Object[] row = { sp.getMaSP(), sp.getTenSP(), sp.getSize(), giaSP,ptkm + "%", soLuong, tt };
            model.addRow(row);
        }
    }

    private void taoHoaDon() {
        JPopupMenu pmnHD = new JPopupMenu();
        JMenuItem mniTaoHD = new JMenuItem("Tạo hóa đơn");
        pmnHD.add(mniTaoHD);
        pnlHoaDon.setVisible(false);
        pnlTaoHD.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                if (SwingUtilities.isRightMouseButton(e)) {
                    pmnHD.show(pnlTaoHD, e.getX(), e.getY());
                }
            }
        });

        mniTaoHD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                pnlHoaDon.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private com.ul.HoaDonPanel pnlHoaDon;
    private javax.swing.JPanel pnlSanPham;
    private javax.swing.JPanel pnlTaoHD;
    private javax.swing.JPanel pnlTrangThaiHoaDon5;
    private static javax.swing.JTable tblKhachHang;
    private static javax.swing.JTable tblSanPham;
    private static javax.swing.JTextField txtTimKH;
    // End of variables declaration//GEN-END:variables

}
