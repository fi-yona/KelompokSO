/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daftarbarang;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author fiona
 */
public class frm_utama extends javax.swing.JFrame {

    /**
     * Creates new form frm_utama
     */
    
    
    public frm_utama() {
        initComponents();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_kodebarang_utama = new javax.swing.JLabel();
        lbl_namamerk_utama = new javax.swing.JLabel();
        lbl_namabarang_utama = new javax.swing.JLabel();
        lbl_ukuran_utama = new javax.swing.JLabel();
        lbl_satuan_utama = new javax.swing.JLabel();
        txt_kodebarang_utama = new javax.swing.JTextField();
        txt_namabarang_utama = new javax.swing.JTextField();
        txt_ukuran_utama = new javax.swing.JTextField();
        combo_namamerk_utama = new javax.swing.JComboBox<>();
        txt_satuan_utama = new javax.swing.JTextField();
        lbl_hargamodal_utama = new javax.swing.JLabel();
        lbl_hargajual_utama = new javax.swing.JLabel();
        txt_hargamodal_utama = new javax.swing.JTextField();
        txt_hargajual_utama = new javax.swing.JTextField();
        lbl_namapemasok_utama = new javax.swing.JLabel();
        combo_namapemasok_utama = new javax.swing.JComboBox<>();
        btn_tambahmerk_utama = new javax.swing.JButton();
        btn_tambahpemasok_utama = new javax.swing.JButton();
        lbl_namapemasok_utama1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_keterangan_utama = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_utama = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lbl_action_utama = new javax.swing.JLabel();
        btn_tambah_utama = new javax.swing.JButton();
        btn_ubah_utama = new javax.swing.JButton();
        btn_hapus_utama = new javax.swing.JButton();
        btn_keluar_utama = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DAFTAR BARANG DISTRIBUTOR SINAR JAYA");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicyProvider(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(null), "Tambah Data"));

        lbl_kodebarang_utama.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        lbl_kodebarang_utama.setText("Kode Barang");

        lbl_namamerk_utama.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        lbl_namamerk_utama.setText("Merk");

        lbl_namabarang_utama.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        lbl_namabarang_utama.setText("Nama Barang");

        lbl_ukuran_utama.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        lbl_ukuran_utama.setText("Ukuran");

        lbl_satuan_utama.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        lbl_satuan_utama.setText("Satuan");

        txt_kodebarang_utama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kodebarang_utamaActionPerformed(evt);
            }
        });

        txt_ukuran_utama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ukuran_utamaActionPerformed(evt);
            }
        });

        combo_namamerk_utama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txt_satuan_utama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_satuan_utamaActionPerformed(evt);
            }
        });

        lbl_hargamodal_utama.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        lbl_hargamodal_utama.setText("Harga Modal");

        lbl_hargajual_utama.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        lbl_hargajual_utama.setText("Harga Jual");

        txt_hargamodal_utama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hargamodal_utamaActionPerformed(evt);
            }
        });

        txt_hargajual_utama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hargajual_utamaActionPerformed(evt);
            }
        });

        lbl_namapemasok_utama.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        lbl_namapemasok_utama.setText("Nama Pemasok");

        combo_namapemasok_utama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_namapemasok_utama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_namapemasok_utamaActionPerformed(evt);
            }
        });

        btn_tambahmerk_utama.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        btn_tambahmerk_utama.setText("+");
        btn_tambahmerk_utama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_tambahmerk_utamaMouseClicked(evt);
            }
        });

        btn_tambahpemasok_utama.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        btn_tambahpemasok_utama.setText("+");
        btn_tambahpemasok_utama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_tambahpemasok_utamaMouseClicked(evt);
            }
        });
        btn_tambahpemasok_utama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahpemasok_utamaActionPerformed(evt);
            }
        });

        lbl_namapemasok_utama1.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        lbl_namapemasok_utama1.setText("Keterangan");

        txt_keterangan_utama.setColumns(20);
        txt_keterangan_utama.setRows(5);
        jScrollPane2.setViewportView(txt_keterangan_utama);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_kodebarang_utama)
                            .addComponent(lbl_namamerk_utama))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txt_kodebarang_utama, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(combo_namamerk_utama, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_tambahmerk_utama)
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_hargamodal_utama)
                                    .addComponent(lbl_hargajual_utama))))
                        .addGap(16, 16, 16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_namabarang_utama)
                            .addComponent(lbl_ukuran_utama)
                            .addComponent(lbl_satuan_utama))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_namabarang_utama, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ukuran_utama, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_satuan_utama, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_namapemasok_utama1)
                            .addComponent(lbl_namapemasok_utama))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_hargamodal_utama, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_hargajual_utama, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(combo_namapemasok_utama, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_tambahpemasok_utama))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_kodebarang_utama)
                            .addComponent(txt_kodebarang_utama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_namamerk_utama)
                            .addComponent(combo_namamerk_utama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_tambahmerk_utama))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_namabarang_utama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_namabarang_utama)
                            .addComponent(lbl_namapemasok_utama)
                            .addComponent(combo_namapemasok_utama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_tambahpemasok_utama)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_hargamodal_utama)
                            .addComponent(txt_hargamodal_utama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_hargajual_utama)
                            .addComponent(txt_hargajual_utama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_ukuran_utama)
                            .addComponent(txt_ukuran_utama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_namapemasok_utama1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_satuan_utama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_satuan_utama)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl_utama.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Merk", "Nama Barang", "Ukuran", "Satuan", "Harga Modal", "Harga Jual", "Nama Pemasok", "Keterangan"
            }
        ));
        jScrollPane1.setViewportView(tbl_utama);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        lbl_action_utama.setFont(new java.awt.Font("Ubuntu", 2, 14)); // NOI18N
        lbl_action_utama.setText("ACTION");

        btn_tambah_utama.setText("SIMPAN");
        btn_tambah_utama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambah_utamaActionPerformed(evt);
            }
        });

        btn_ubah_utama.setText("UBAH");
        btn_ubah_utama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ubah_utamaActionPerformed(evt);
            }
        });

        btn_hapus_utama.setText("HAPUS");
        btn_hapus_utama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapus_utamaActionPerformed(evt);
            }
        });

        btn_keluar_utama.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        btn_keluar_utama.setText("KELUAR");
        btn_keluar_utama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluar_utamaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_action_utama)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_hapus_utama)
                    .addComponent(btn_tambah_utama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_ubah_utama)
                    .addComponent(btn_keluar_utama))
                .addGap(65, 65, 65))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_action_utama)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tambah_utama)
                    .addComponent(btn_ubah_utama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_hapus_utama)
                    .addComponent(btn_keluar_utama))
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1167, 722));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_kodebarang_utamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kodebarang_utamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kodebarang_utamaActionPerformed

    private void txt_ukuran_utamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ukuran_utamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ukuran_utamaActionPerformed

    private void txt_satuan_utamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_satuan_utamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_satuan_utamaActionPerformed

    private void txt_hargamodal_utamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hargamodal_utamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hargamodal_utamaActionPerformed

    private void txt_hargajual_utamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hargajual_utamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hargajual_utamaActionPerformed

    private void combo_namapemasok_utamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_namapemasok_utamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_namapemasok_utamaActionPerformed

    private void btn_ubah_utamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ubah_utamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ubah_utamaActionPerformed

    private void btn_hapus_utamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapus_utamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_hapus_utamaActionPerformed

    private void btn_tambah_utamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambah_utamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_tambah_utamaActionPerformed

    private void btn_keluar_utamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluar_utamaActionPerformed
        System.exit(0);
        
        frm_pemasok pemasok = new frm_pemasok();
        pemasok.setVisible(false);
        
        frm_merk merk = new frm_merk();
        merk.setVisible(false);
    }//GEN-LAST:event_btn_keluar_utamaActionPerformed

    private void btn_tambahpemasok_utamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahpemasok_utamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_tambahpemasok_utamaActionPerformed

    private void btn_tambahmerk_utamaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahmerk_utamaMouseClicked
        frm_merk merk = new frm_merk();
        merk.setVisible(true);
    }//GEN-LAST:event_btn_tambahmerk_utamaMouseClicked

    private void btn_tambahpemasok_utamaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahpemasok_utamaMouseClicked
        frm_pemasok pemasok = new frm_pemasok();
        pemasok.setVisible(true);
    }//GEN-LAST:event_btn_tambahpemasok_utamaMouseClicked

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
            java.util.logging.Logger.getLogger(frm_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_hapus_utama;
    private javax.swing.JButton btn_keluar_utama;
    private javax.swing.JButton btn_tambah_utama;
    private javax.swing.JButton btn_tambahmerk_utama;
    private javax.swing.JButton btn_tambahpemasok_utama;
    private javax.swing.JButton btn_ubah_utama;
    private javax.swing.JComboBox<String> combo_namamerk_utama;
    private javax.swing.JComboBox<String> combo_namapemasok_utama;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_action_utama;
    private javax.swing.JLabel lbl_hargajual_utama;
    private javax.swing.JLabel lbl_hargamodal_utama;
    private javax.swing.JLabel lbl_kodebarang_utama;
    private javax.swing.JLabel lbl_namabarang_utama;
    private javax.swing.JLabel lbl_namamerk_utama;
    private javax.swing.JLabel lbl_namapemasok_utama;
    private javax.swing.JLabel lbl_namapemasok_utama1;
    private javax.swing.JLabel lbl_satuan_utama;
    private javax.swing.JLabel lbl_ukuran_utama;
    private javax.swing.JTable tbl_utama;
    private javax.swing.JTextField txt_hargajual_utama;
    private javax.swing.JTextField txt_hargamodal_utama;
    private javax.swing.JTextArea txt_keterangan_utama;
    private javax.swing.JTextField txt_kodebarang_utama;
    private javax.swing.JTextField txt_namabarang_utama;
    private javax.swing.JTextField txt_satuan_utama;
    private javax.swing.JTextField txt_ukuran_utama;
    // End of variables declaration//GEN-END:variables
}
