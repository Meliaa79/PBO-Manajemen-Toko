/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

/**
 *
 * @author M E L I A
 */

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Supplier extends javax.swing.JPanel {

    /**
     * Creates new form Iventaris
     */
    
    public Statement st;
    public ResultSet rs;
    Connection connection = config.koneksi.getConnection();
    
    public Supplier() {
        initComponents();
        TampilData();
    }
    
    private void Bersih() {
        t_idsupplier.setText("");
        t_namasupplier.setText("");
        t_alamat.setText("");
        t_tlp.setText("");
        
        btn_simpan.setText("Simpan");
        t_idsupplier.setEditable(true);
    }
    
    private void CariData() {
        try {
            st = connection.createStatement();
            rs = st.executeQuery("SELECT * FROM tb_supplier WHERE " +
                combo_cari.getSelectedItem().toString() + 
                " LIKE '%" + t_caridata.getText() + "%'");
            
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("No.");
            model.addColumn("Id_supplier");
            model.addColumn("Nama_Supplier");
            model.addColumn("Alamat");
            model.addColumn("No_Tlp");
   
            int no = 1;
            
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            model.setRowCount(0);
            
            while (rs.next()) {
               Object[] data = {
                   no ++,
                   rs.getString("Id_supplier"),
                   rs.getString("Nama_Supplier"),
                   rs.getString("Alamat"),
                   rs.getString("No_Tlp")
               };
               model.addRow(data);
               tabel_data.setModel(model);
            }
            
            
        } catch (Exception e) {
        }
    }
    
    private void TampilData() {
        try {
            st = connection.createStatement();
            rs = st.executeQuery("SELECT * FROM tb_supplier");
            
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("No.");
            model.addColumn("Id_supplier");
            model.addColumn("Nama_Supplier");
            model.addColumn("Alamat");
            model.addColumn("No_Tlp");
            
            int no = 1;
            
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            model.setRowCount(0);
            
            while (rs.next()) {
               Object[] data = {
                   no ++,
                   rs.getString("Id_supplier"),
                   rs.getString("Nama_Supplier"),
                   rs.getString("Alamat"),
                   rs.getString("No_Tlp")
               };
               model.addRow(data);
               tabel_data.setModel(model);
            }
            
            
        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        l_barang = new javax.swing.JLabel();
        l_idsupplier = new javax.swing.JLabel();
        l_namasupplier = new javax.swing.JLabel();
        l_alamat = new javax.swing.JLabel();
        l_tlp = new javax.swing.JLabel();
        t_idsupplier = new javax.swing.JTextField();
        t_namasupplier = new javax.swing.JTextField();
        t_alamat = new javax.swing.JTextField();
        t_tlp = new javax.swing.JTextField();
        btn_simpan = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_data = new javax.swing.JTable();
        btn_caridata = new javax.swing.JButton();
        combo_cari = new javax.swing.JComboBox<>();
        t_caridata = new javax.swing.JTextField();
        btn_hapus = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        l_barang.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        l_barang.setText("DATA SUPPLIER ");

        l_idsupplier.setText("Id_Supplier");

        l_namasupplier.setText("Nama_Supplier");

        l_alamat.setText("Alamat");

        l_tlp.setText("No_Tlp");

        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_batal.setText("Batal");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        tabel_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id_supplier", "Nama_Supplier", "Alamat", "No_Tlp"
            }
        ));
        tabel_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_dataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel_data);

        btn_caridata.setText("Cari Data");

        combo_cari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id_supplier", "Nama_Supplier", " ", " " }));

        t_caridata.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_caridataKeyPressed(evt);
            }
        });

        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(l_barang))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btn_caridata)
                        .addGap(29, 29, 29)
                        .addComponent(combo_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(t_caridata, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btn_simpan)
                        .addGap(35, 35, 35)
                        .addComponent(btn_hapus)
                        .addGap(40, 40, 40)
                        .addComponent(btn_batal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(l_namasupplier, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_alamat, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(l_tlp)
                                .addGap(100, 100, 100)
                                .addComponent(t_tlp, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(l_idsupplier)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(t_idsupplier, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                                    .addComponent(t_namasupplier)
                                    .addComponent(t_alamat))))))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_barang)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_idsupplier)
                    .addComponent(t_idsupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_namasupplier)
                    .addComponent(t_namasupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_alamat)
                    .addComponent(t_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_tlp)
                    .addComponent(t_tlp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_simpan)
                    .addComponent(btn_batal)
                    .addComponent(btn_hapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_caridata)
                    .addComponent(combo_cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_caridata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(320, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        try {
            st = connection.createStatement();
            if (t_idsupplier.getText().equals("") || 
                    t_namasupplier.getText().equals("") || 
                    t_alamat.getText().equals("") || 
                    t_tlp.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Data tidak boleh kosong", "Validasi Data", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            //aksi simpan data
            if (btn_simpan.getText() == "Simpan") {
                String cek ="SELECT * FROM tb_supplier WHERE Id_supplier = '" + t_idsupplier.getText() + "'";
                rs = st.executeQuery(cek);
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Maaf..Id_supplier ini sudah ada");
                } else {
                    String sql = "INSERT INTO tb_supplier VALUES ('" + t_idsupplier.getText() +       
                            "','" + t_namasupplier.getText() +
                            "','" + t_alamat.getText() +
                            "','" + t_tlp.getText() + "')";
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
                    Bersih();
                    TampilData();
                }
            }else {
                //aksi ubah data
                    String update = "UPDATE tb_supplier SET Nama_Supplier = '" + t_namasupplier.getText() +
                            "', Alamat = '" + t_alamat.getText() +
                            "', No_Tlp = '" + t_tlp.getText() +       
                            "' WHERE Id_supplier = '" + t_idsupplier.getText() + "'";
                    st.executeLargeUpdate(update);
                    JOptionPane.showMessageDialog(null, "Data berhasil diubah");
                    Bersih();
                    TampilData();
                    }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void tabel_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_dataMouseClicked
        t_idsupplier.setText(tabel_data.getValueAt(tabel_data.getSelectedRow(), 1).toString());
        t_namasupplier.setText(tabel_data.getValueAt(tabel_data.getSelectedRow(), 2).toString());
        t_alamat.setText(tabel_data.getValueAt(tabel_data.getSelectedRow(), 3).toString());
        t_tlp.setText(tabel_data.getValueAt(tabel_data.getSelectedRow(), 4).toString());
        
        t_idsupplier.setEditable(false);
        btn_simpan.setText("Ubah");
                
    }//GEN-LAST:event_tabel_dataMouseClicked

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        Bersih();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void t_caridataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_caridataKeyPressed
       CariData();
    }//GEN-LAST:event_t_caridataKeyPressed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        if (t_idsupplier.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Silahkan pilih data yang akan dihapus"); 
        } else {
            int jawab = JOptionPane.showConfirmDialog(null, "Apakah yakin menghapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (jawab == 0) {
                try {
                    st = connection.createStatement();
                    String sql = "DELETE FROM tb_supplier WHERE Id_supplier = '" + t_idsupplier.getText() + "'";
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                    TampilData();
                    Bersih();
                    
                } catch (Exception e) {
                     JOptionPane.showMessageDialog(null, e);
                }
                
            }
        }
    }//GEN-LAST:event_btn_hapusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_caridata;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JComboBox<String> combo_cari;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel l_alamat;
    private javax.swing.JLabel l_barang;
    private javax.swing.JLabel l_idsupplier;
    private javax.swing.JLabel l_namasupplier;
    private javax.swing.JLabel l_tlp;
    private javax.swing.JTextField t_alamat;
    private javax.swing.JTextField t_caridata;
    private javax.swing.JTextField t_idsupplier;
    private javax.swing.JTextField t_namasupplier;
    private javax.swing.JTextField t_tlp;
    private javax.swing.JTable tabel_data;
    // End of variables declaration//GEN-END:variables
}