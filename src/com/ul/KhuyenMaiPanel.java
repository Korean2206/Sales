/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.ul;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import com.DAO.KhuyenMaiDAO;
import com.DAO.LoaiDAO;
import com.entity.KhuyenMai;
import com.entity.Loai;
import com.utils.Auth;
import com.utils.XMessage;

/**
 *
 * @author korea
 */
public class KhuyenMaiPanel extends javax.swing.JPanel {

    /**
     * Creates new form KhuyenMaiPanel
     */
    public KhuyenMaiPanel() {
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

        jPanel11 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtMaKM = new javax.swing.JTextField();
        txtTenKM = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        txtGTKM = new javax.swing.JTextField();
        dcFrom = new com.toedter.calendar.JDateChooser();
        dcTo = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        cboMaLoai = new javax.swing.JComboBox<>();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblKhuyenMai = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        cboKM = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        btnTimKiem = new javax.swing.JButton();

        jPanel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setText("Mã khuyến mãi :");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel30.setText("Tên khuyến mãi :");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel31.setText("Ngày bắt đầu :");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel32.setText("Ngày kết thúc :");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel33.setText("Giá trị khuyến mãi :");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setText("Mã Loại KM :");

        cboMaLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32)
                            .addComponent(jLabel33)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(txtMaKM, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTenKM, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                    .addComponent(txtGTKM)
                                    .addComponent(dcTo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboMaLoai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dcFrom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(btnCapNhat)
                                .addGap(39, 39, 39)
                                .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 34, Short.MAX_VALUE))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(txtMaKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(txtTenKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cboMaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addComponent(jLabel31))
                    .addComponent(dcFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel32)
                    .addComponent(dcTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txtGTKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 40, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnCapNhat)
                    .addComponent(btnMoi))
                .addGap(101, 101, 101))
        );

        jPanel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblKhuyenMai.setModel(new javax.swing.table.DefaultTableModel(
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
        tblKhuyenMai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhuyenMaiMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblKhuyenMai);

        jLabel7.setText("Tìm kiếm :");

        cboKM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboKM.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboKMItemStateChanged(evt);
            }
        });
        cboKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboKMActionPerformed(evt);
            }
        });

        jLabel28.setText("Lọc khuyến mãi :");

        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/image/icons8_search_20px.png"))); // NOI18N
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cboKM, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cboKMItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboKMItemStateChanged
        // TODO add your handling code here:
        String query = cboKM.getSelectedItem().toString();
        filterCbo(query);
    }//GEN-LAST:event_cboKMItemStateChanged

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        insert();
    }// GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        delete();
    }// GEN-LAST:event_btnXoaActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
        update();
    }// GEN-LAST:event_btnCapNhatActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnMoiActionPerformed
        // TODO add your handling code here:
        clearForm();
    }// GEN-LAST:event_btnMoiActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        String query = txtTimKiem.getText();
        find(query);
    }// GEN-LAST:event_btnTimKiemActionPerformed

    private void cboKMActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cboKMActionPerformed
        // TODO add your handling code here:
//        fillTableKM();
    }// GEN-LAST:event_cboKMActionPerformed

    private void tblKhuyenMaiMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tblKhuyenMaiMouseClicked
        // TODO add your handling code here:
        row = tblKhuyenMai.getSelectedRow();
        edit();
    }// GEN-LAST:event_tblKhuyenMaiMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboKM;
    private javax.swing.JComboBox<String> cboMaLoai;
    private com.toedter.calendar.JDateChooser dcFrom;
    private com.toedter.calendar.JDateChooser dcTo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblKhuyenMai;
    private javax.swing.JTextField txtGTKM;
    private javax.swing.JTextField txtMaKM;
    private javax.swing.JTextField txtTenKM;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
    KhuyenMaiDAO daoKM = new KhuyenMaiDAO();
    private int row = -1;

    void init() {
        fillTable();
        row = -1;
        this.updateStatus();
        fillCBOMaLoai();
        fillCBOKM();
    }

    DefaultTableModel model;

    private void fillCBOKM() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        cboKM.setModel(model);
//        model.removeAllElements();
        List<Loai> list = daoLoai.selectAll();
        model.addElement("None");
        for (Loai l : list) {
            model.addElement(l.getMaLoai());
        }
    }
    
    void fillTable() {
        try {
            String header[] = {"Mã KM", "Tên KM", "Mã Loại KM", "Ngày bắt đầu", "Ngày kết thúc",
                "Giá trị khuyến mãi"};
            model = new DefaultTableModel(header, 0);
            tblKhuyenMai.setModel(model);
            List<KhuyenMai> list = daoKM.selectAll();
            for (KhuyenMai km : list) {
                Object[] row = {
                    km.getMaKM(),
                    km.getTenKM(),
                    km.getMaLoaiKM(),
                    km.getNgayBatDau(),
                    km.getNgayKetThuc(),
                    km.getPhanTram()};
                model.addRow(row);
            }
        } catch (Exception e) {
            XMessage.alert(this, "Lỗi truy vấn");
        }
    }

    private void filterCbo(String query) {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tblKhuyenMai.setRowSorter(tr);

        if (query != "None") {
            tr.setRowFilter(RowFilter.regexFilter(query));
        } else {
            tblKhuyenMai.setRowSorter(tr);
        }
    }

    private void fillTableKM() {
        try {
            String header[] = {"Mã KM", "Tên KM", "Mã Loại KM", "Ngày bắt đầu", "Ngày kết thúc",
                "Giá trị khuyến mãi"};
            DefaultTableModel model = new DefaultTableModel(header, 0);
            tblKhuyenMai.setModel(model);
            Loai loai = (Loai) cboKM.getSelectedItem();
            List<KhuyenMai> list;
            if (loai == null) {
                list = daoKM.selectAll();
            } else {
                list = daoKM.selectByMaLoai(loai.getMaLoai());
            }
            for (KhuyenMai km : list) {
                Object[] row = {
                    km.getMaKM(),
                    km.getTenKM(),
                    km.getMaLoaiKM(),
                    km.getNgayBatDau(),
                    km.getNgayKetThuc(),
                    km.getPhanTram()};
                model.addRow(row);
            }
        } catch (Exception e) {
            XMessage.alert(this, "Lỗi truy vấn");
        }
    }

    

    private LoaiDAO daoLoai = new LoaiDAO();

    private void fillCBOMaLoai() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboMaLoai.getModel();
        model.removeAllElements();
        List<Loai> list = daoLoai.selectAll();
        for (Loai l : list) {
            model.addElement(l);
            cboKM.setToolTipText(l.getTenLoai() + "");
        }
    }

    private void insert() {
        KhuyenMai model = getForm();
        try {
            daoKM.insert(model);
            this.fillTable();
            this.clearForm();
            XMessage.alert(this, "Thêm dữ liệu thành công");
        } catch (Exception e) {
            XMessage.alert(this, "Lỗi dữ liệu");
            e.printStackTrace();
        }
    }

    private void delete() {
        KhuyenMai model = getForm();
        try {
            daoKM.delete(model.getMaKM());
            this.fillTable();
            this.clearForm();
            XMessage.alert(this, "Xoá thành công");
        } catch (Exception e) {
            // TODO: handle exception
            XMessage.alert(this, "Xóa thất bại");
            e.printStackTrace();
        }
    }

    private void update() {
        KhuyenMai model = getForm();
        try {
            daoKM.update(model);
            this.fillTable();
            this.clearForm();
            XMessage.alert(this, "Cập nhật thành công");
        } catch (Exception e) {
            XMessage.alert(this, "Cập nhật thất bại");
            e.printStackTrace();
        }
    }

    private void clearForm() {
        KhuyenMai km = new KhuyenMai();
        setForm(km);
        row = -1;
        this.updateStatus();
    }

    private void edit() {
        String maKM = (String) tblKhuyenMai.getValueAt(row, 0);
        KhuyenMai km = daoKM.selectByID(maKM);
        this.setForm(km);
        this.updateStatus();
    }

    private KhuyenMai getForm() {
        KhuyenMai km = new KhuyenMai();
        Loai loai = (Loai) cboMaLoai.getSelectedItem();
        km.setMaKM(txtMaKM.getText());
        km.setTenKM(txtTenKM.getText());
        km.setMaLoaiKM(loai.getMaLoai());
        km.setNgayBatDau(dcFrom.getDate());
        km.setNgayKetThuc(dcTo.getDate());
        km.setPhanTram(Double.parseDouble(txtGTKM.getText()));
        km.setMaNV(Auth.user.getMaNV());
        return km;
    }

    private void find(String query) {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tblKhuyenMai.setRowSorter(tr);

        tr.setRowFilter(RowFilter.regexFilter(query));
    }

    private void setForm(KhuyenMai km) {
        txtMaKM.setText(km.getMaKM());
        txtTenKM.setText(km.getTenKM());
        txtGTKM.setText(String.valueOf(km.getPhanTram()));
        if (km.getMaLoaiKM() != null) {
            cboMaLoai.getModel().setSelectedItem(daoLoai.selectByID(km.getMaLoaiKM()));
            cboMaLoai.setToolTipText(km.getMaLoaiKM() + "");
        } else {
            cboMaLoai.setSelectedIndex(0);
        }
        dcFrom.setDate(km.getNgayBatDau());
        dcTo.setDate(km.getNgayKetThuc());

    }

    private void updateStatus() {
        boolean edit = (this.row >= 0);
        txtMaKM.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnXoa.setEnabled(!edit);
        btnCapNhat.setEnabled(edit);
        btnXoa.setEnabled(edit);
    }
}
