/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author M E L I A
 */
public class TransaksiNew extends javax.swing.JPanel {
    //Connection connection = config.koneksi.getConnection();
    public Statement st;
    public ResultSet rs;
    Connection connection = config.koneksi.getConnection();

    /**
     * Creates new form TransaksiNew
     */
    public TransaksiNew() {
        initComponents();
        TampilData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        t_transaksi = new javax.swing.JTextField();
        t_metode = new javax.swing.JTextField();
        combo_produk = new javax.swing.JComboBox<>();
        t_harga = new javax.swing.JTextField();
        t_jumlah = new javax.swing.JTextField();
        btn_batal = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_hitungjumalah = new javax.swing.JButton();
        btn_kembalian = new javax.swing.JButton();
        Jumlah_Harga = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        t_jumlahharga = new javax.swing.JTextField();
        t_jumlahbayar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        t_kembalian = new javax.swing.JTextField();
        btn_simpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_data = new javax.swing.JTable();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        t_date = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("TRANSAKSI");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jLabel2.setText("Id_Transaksi");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel3.setText("Nama_Produk");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel4.setText("Metode Pembayaran");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel5.setText("Harga");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel6.setText("Jumlah");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));
        add(t_transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 160, -1));
        add(t_metode, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 160, -1));

        combo_produk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Barang", "Mizone", "Teh Botol", "Teh Pucuk", "Aqua", "Pocari", "Beras 25 kg", "Gula", "Minyak", "Kopi", "Susu", "Sunlight", "Sapu", " ", " " }));
        combo_produk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_produkActionPerformed(evt);
            }
        });
        add(combo_produk, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 160, -1));
        add(t_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 160, -1));
        add(t_jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 160, -1));

        btn_batal.setText("BATAL");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });
        add(btn_batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        btn_hapus.setText("HAPUS");
        btn_hapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_hapusMouseClicked(evt);
            }
        });
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        btn_hitungjumalah.setText("HITUNG JUMLAH HARGA");
        btn_hitungjumalah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hitungjumalahActionPerformed(evt);
            }
        });
        add(btn_hitungjumalah, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        btn_kembalian.setText("HITUNG JUMLAH KEMBALIAN");
        btn_kembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kembalianActionPerformed(evt);
            }
        });
        add(btn_kembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        Jumlah_Harga.setText("Harga Total");
        add(Jumlah_Harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel8.setText("Jumlah Bayar");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));
        add(t_jumlahharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 160, -1));
        add(t_jumlahbayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 160, -1));

        jLabel7.setText("Kembalian");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));
        add(t_kembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 160, -1));

        btn_simpan.setText("SIMPAN");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });
        add(btn_simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        tabel_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id_Transaksi", "Nama_Produk", "Metode_Pembayaran", "Harga", "Jumlah", "Harga Total", "Jumlah Bayar", "Kembalian", "Tanggal"
            }
        ));
        tabel_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_dataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_data);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 510, 110));
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 160, -1));

        t_date.setText("GET");
        t_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_dateActionPerformed(evt);
            }
        });
        add(t_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, -1, -1));

        jLabel10.setText("Tanggal");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void combo_produkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_produkActionPerformed
        switch(combo_produk.getSelectedIndex()) {
            case 1:
            {
                t_harga.setText(String.valueOf("5000"));
            }
            break;
            case 2:
            {
                t_harga.setText(String.valueOf("3000"));
            }
            break;
            case 3:
            {
                t_harga.setText(String.valueOf("4000"));
            } break;
            case 4:
            {
                t_harga.setText(String.valueOf("3000"));
            } break;
            case 5:
            {
                t_harga.setText(String.valueOf("6000"));
            } break;
            case 6: 
            {
                t_harga.setText(String.valueOf("25000"));
            } break;
            case 7: 
            {
                t_harga.setText(String.valueOf("12000"));
            } break;
            case 8: 
            {
                t_harga.setText(String.valueOf("16000"));
            }
            break;
            case 9:
            {
                t_harga.setText(String.valueOf("3000"));
            }
            break;
            case 10:
            {
                t_harga.setText(String.valueOf("7000"));
            }
            break;
            case 11:
            {
                t_harga.setText(String.valueOf("5000"));
            }
            break;
            case 12:
            {
                t_harga.setText(String.valueOf("13000"));
            }
        }
    }//GEN-LAST:event_combo_produkActionPerformed

    private void btn_hitungjumalahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hitungjumalahActionPerformed
          Double harga, jumlahbeli, hargatotal;
                harga=Double.parseDouble(t_harga.getText());
                jumlahbeli=Double.parseDouble(t_jumlah.getText());
                hargatotal=harga*jumlahbeli;
                t_jumlahharga.setText(String.valueOf(hargatotal));
    }//GEN-LAST:event_btn_hitungjumalahActionPerformed

    private void btn_kembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kembalianActionPerformed
        Double jumlahharga, jumlahbayar, kembalian;
            jumlahharga=Double.parseDouble(t_jumlahharga.getText());
            jumlahbayar=Double.parseDouble(t_jumlahbayar.getText());
            kembalian=jumlahbayar-jumlahharga;
            t_kembalian.setText(String.valueOf(kembalian));
    }//GEN-LAST:event_btn_kembalianActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        t_transaksi.setText("");
        t_metode.setText("");
        t_harga.setText("");
        t_jumlah.setText("");
        t_jumlahharga.setText("");
        t_jumlahbayar.setText("");
        t_kembalian.setText("");
        t_date.setText("");    
    }//GEN-LAST:event_btn_batalActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        if (t_transaksi.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Silahkan pilih data yang akan dihapus"); 
        } else {
            int jawab = JOptionPane.showConfirmDialog(null, "Apakah yakin menghapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (jawab == 0) {
                try {
                    st = connection.createStatement();
                    String sql = "DELETE FROM tb_transaksi WHERE Id_transaksi = '" + t_transaksi.getText() + "'";
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                    TampilData();
                    //Bersih();
                    
                } catch (Exception e) {
                     JOptionPane.showMessageDialog(null, e);
                }
                
            }
        }
    }//GEN-LAST:event_btn_hapusActionPerformed
    
    private void TampilData() {
    try {
        st = connection.createStatement();
        rs = st.executeQuery("SELECT * FROM tb_transaksi");

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("Id_transaksi");
        model.addColumn("Nama_Produk");
        model.addColumn("Metode_Pembayaran");
        model.addColumn("Harga");
        model.addColumn("Jumlah");
        model.addColumn("Harga_Total");
        model.addColumn("Jumlah_Bayar");
        model.addColumn("Kembalian");
        model.addColumn("Tanggal");

        int no = 1;

        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        model.setRowCount(0);

        while (rs.next()) {
            Object[] data = {
                no++,
                rs.getString("Id_transaksi"),
                rs.getString("Nama_Produk"),
                rs.getString("Metode_Pembayaran"),
                rs.getString("Harga"),
                rs.getString("Jumlah"),
                rs.getString("Harga_Total"),
                rs.getString("Jumlah_Bayar"),
                rs.getString("Kembalian"),
                rs.getString("Tanggal")
            };
            model.addRow(data);
        }
        
        tabel_data.setModel(model);

        if (rs != null) rs.close();
        if (st != null) st.close();
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
}


    
    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
    try {
        st = connection.createStatement();
        //rs = st.executeQuery("SELECT * FROM tb_supplier");
        System.out.println("Memulai proses penyimpanan data...");

        if (connection == null || connection.isClosed()) {
            JOptionPane.showMessageDialog(null, "Koneksi ke database tidak tersedia", "Koneksi Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        System.out.println("Koneksi ke database berhasil...");

        if (t_transaksi.getText().equals("") || 
                combo_produk.getSelectedItem() == null ||
                t_metode.getText().equals("") || 
                t_harga.getText().equals("") || 
                t_jumlah.getText().equals("") ||
                t_jumlahharga.getText().equals("") ||
                t_jumlahbayar.getText().equals("") ||
                t_kembalian.getText().equals("") ||
                t_date.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Data tidak boleh kosong", "Validasi Data", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        System.out.println("Validasi data berhasil...");

        st = connection.createStatement();

        if (btn_simpan.getText().equals("SIMPAN")) {
            System.out.println("Mode Simpan...");
            String cek = "SELECT * FROM tb_transaksi WHERE Id_transaksi = '" + t_transaksi.getText() + "'";
            rs = st.executeQuery(cek);

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Maaf..Id_transaksi ini sudah ada");
            } else {
                String sql = "INSERT INTO tb_transaksi (Id_transaksi, Nama_Produk, Metode_Pembayaran, Harga, Jumlah, Harga_Total, Jumlah_Bayar, Kembalian, Tanggal) VALUES ('" + 
                        t_transaksi.getText() + "','" + 
                        combo_produk.getSelectedItem() + "','" + 
                        t_metode.getText() + "','" + 
                        t_harga.getText() + "','" + 
                        t_jumlah.getText() + "','" + 
                        t_jumlahharga.getText() + "','" + 
                        t_jumlahbayar.getText() + "','" + 
                        t_kembalian.getText() + "','" +
                        t_date.getText() + "')";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
                //Bersih();
                TampilData();
            }
            
        
        } else {
                //aksi ubah data
                    String update = "UPDATE tb_transaksi SET Metode_Pembayaran = '" + t_metode.getText() +
                            "', Harga = '" + t_harga.getText() +
                            "', Jumlah = '" + t_jumlah.getText() +
                            "', Harga_Total = '" + t_jumlahharga.getText() +
                            "', Jumlah_Bayar = '" + t_jumlahbayar.getText() +
                            "', Kembalian = '" + t_kembalian.getText() +
                            "', Tanggal = '" + t_date.getText() +
                            "' WHERE Id_transaksi = '" + t_transaksi.getText() + "'";
                    st.executeLargeUpdate(update);
                    JOptionPane.showMessageDialog(null, "Data berhasil diubah");
                    //Bersih();
                    TampilData();
                    }

        if (rs != null) rs.close();
        if (st != null) st.close();

        System.out.println("Proses penyimpanan selesai...");

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "SQL Error: " + e.getMessage());
    }
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_hapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapusMouseClicked
        //dispose();
    }//GEN-LAST:event_btn_hapusMouseClicked

    private void tabel_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_dataMouseClicked
        t_transaksi.setText(tabel_data.getValueAt(tabel_data.getSelectedRow(), 1).toString());
        t_metode.setText(tabel_data.getValueAt(tabel_data.getSelectedRow(), 3).toString());
        t_harga.setText(tabel_data.getValueAt(tabel_data.getSelectedRow(), 4).toString());
        t_jumlah.setText(tabel_data.getValueAt(tabel_data.getSelectedRow(), 5).toString());
        t_jumlahharga.setText(tabel_data.getValueAt(tabel_data.getSelectedRow(), 6).toString());
        t_jumlahbayar.setText(tabel_data.getValueAt(tabel_data.getSelectedRow(), 7).toString());
        t_kembalian.setText(tabel_data.getValueAt(tabel_data.getSelectedRow(), 8).toString());
       t_date.setText(tabel_data.getValueAt(tabel_data.getSelectedRow(), 9).toString());
        
        t_transaksi.setEditable(false);
        btn_simpan.setText("UBAH");
    }//GEN-LAST:event_tabel_dataMouseClicked

    private void t_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_dateActionPerformed
        Date selectDate = jDateChooser1.getDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy//MM//dd");
        String formatDate = dateFormat.format(selectDate);
        t_date.setText(formatDate);
    }//GEN-LAST:event_t_dateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jumlah_Harga;
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_hitungjumalah;
    private javax.swing.JButton btn_kembalian;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JComboBox<String> combo_produk;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton t_date;
    private javax.swing.JTextField t_harga;
    private javax.swing.JTextField t_jumlah;
    private javax.swing.JTextField t_jumlahbayar;
    private javax.swing.JTextField t_jumlahharga;
    private javax.swing.JTextField t_kembalian;
    private javax.swing.JTextField t_metode;
    private javax.swing.JTextField t_transaksi;
    private javax.swing.JTable tabel_data;
    // End of variables declaration//GEN-END:variables

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void MenuDashboard() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}