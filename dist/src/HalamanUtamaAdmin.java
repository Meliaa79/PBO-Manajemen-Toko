
//import View.Iventaris;
import View.Iventaris;
import View.MenuDashboard;
import View.Pembelian;

import View.Supplier;


import java.awt.Color;
import javax.swing.JFrame;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author M E L I A
 */
public class HalamanUtamaAdmin extends javax.swing.JFrame {
    int xx, xy;
    /**
     * Creates new form HalamanUtama
     */
    public HalamanUtamaAdmin() {
        initComponents();
        //
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_utama = new javax.swing.JPanel();
        pn_namatoko = new javax.swing.JPanel();
        ikon_toko = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pn_btndashboard = new javax.swing.JPanel();
        p_dashboardkecil = new javax.swing.JPanel();
        p_ikoncom = new javax.swing.JLabel();
        btn_dashboard = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pn_btnsupplier = new javax.swing.JPanel();
        p_supplier = new javax.swing.JPanel();
        p_ikoncom1 = new javax.swing.JLabel();
        btn_supplier = new javax.swing.JLabel();
        pn_btniventaris = new javax.swing.JPanel();
        p_iventaris = new javax.swing.JPanel();
        p_ikoncom3 = new javax.swing.JLabel();
        btn_iventaris = new javax.swing.JLabel();
        pn_btntransaksi = new javax.swing.JPanel();
        p_transaksi = new javax.swing.JPanel();
        p_ikoncom4 = new javax.swing.JLabel();
        btn_transaksi = new javax.swing.JLabel();
        pn_btnpembelian = new javax.swing.JPanel();
        p_pembelian = new javax.swing.JPanel();
        p_ikoncom5 = new javax.swing.JLabel();
        btn_pembelian = new javax.swing.JLabel();
        pn_welcome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pn_menu = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(822, 500));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 500));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_utama.setBackground(new java.awt.Color(255, 255, 255));

        pn_namatoko.setBackground(new java.awt.Color(111, 179, 184));
        pn_namatoko.setPreferredSize(new java.awt.Dimension(230, 460));

        ikon_toko.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Shop.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("M&M STORE");

        pn_btndashboard.setBackground(new java.awt.Color(255, 255, 255));

        p_dashboardkecil.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout p_dashboardkecilLayout = new javax.swing.GroupLayout(p_dashboardkecil);
        p_dashboardkecil.setLayout(p_dashboardkecilLayout);
        p_dashboardkecilLayout.setHorizontalGroup(
            p_dashboardkecilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        p_dashboardkecilLayout.setVerticalGroup(
            p_dashboardkecilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        p_ikoncom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dash 2.png"))); // NOI18N

        btn_dashboard.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btn_dashboard.setText("Dashboard");
        btn_dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_dashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_dashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_dashboardMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_btndashboardLayout = new javax.swing.GroupLayout(pn_btndashboard);
        pn_btndashboard.setLayout(pn_btndashboardLayout);
        pn_btndashboardLayout.setHorizontalGroup(
            pn_btndashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btndashboardLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(p_ikoncom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(pn_btndashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btndashboardLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(p_dashboardkecil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(182, Short.MAX_VALUE)))
        );
        pn_btndashboardLayout.setVerticalGroup(
            pn_btndashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_ikoncom, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
            .addComponent(btn_dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pn_btndashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btndashboardLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(p_dashboardkecil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(7, Short.MAX_VALUE)))
        );

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("MENU");

        pn_btnsupplier.setBackground(new java.awt.Color(255, 255, 255));

        p_supplier.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout p_supplierLayout = new javax.swing.GroupLayout(p_supplier);
        p_supplier.setLayout(p_supplierLayout);
        p_supplierLayout.setHorizontalGroup(
            p_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        p_supplierLayout.setVerticalGroup(
            p_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        p_ikoncom1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Supplier11.png"))); // NOI18N

        btn_supplier.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btn_supplier.setText("Supplier");
        btn_supplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_supplierMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_supplierMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_supplierMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_btnsupplierLayout = new javax.swing.GroupLayout(pn_btnsupplier);
        pn_btnsupplier.setLayout(pn_btnsupplierLayout);
        pn_btnsupplierLayout.setHorizontalGroup(
            pn_btnsupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnsupplierLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(p_ikoncom1)
                .addGap(18, 18, 18)
                .addComponent(btn_supplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pn_btnsupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnsupplierLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(p_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(182, Short.MAX_VALUE)))
        );
        pn_btnsupplierLayout.setVerticalGroup(
            pn_btnsupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_ikoncom1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_btnsupplierLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_supplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pn_btnsupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnsupplierLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(p_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(7, Short.MAX_VALUE)))
        );

        pn_btniventaris.setBackground(new java.awt.Color(255, 255, 255));

        p_iventaris.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout p_iventarisLayout = new javax.swing.GroupLayout(p_iventaris);
        p_iventaris.setLayout(p_iventarisLayout);
        p_iventarisLayout.setHorizontalGroup(
            p_iventarisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        p_iventarisLayout.setVerticalGroup(
            p_iventarisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        p_ikoncom3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iven.png"))); // NOI18N

        btn_iventaris.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btn_iventaris.setText("Iventaris");
        btn_iventaris.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_iventarisMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_iventarisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_iventarisMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_btniventarisLayout = new javax.swing.GroupLayout(pn_btniventaris);
        pn_btniventaris.setLayout(pn_btniventarisLayout);
        pn_btniventarisLayout.setHorizontalGroup(
            pn_btniventarisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btniventarisLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(p_ikoncom3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_iventaris, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17))
            .addGroup(pn_btniventarisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btniventarisLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(p_iventaris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(182, Short.MAX_VALUE)))
        );
        pn_btniventarisLayout.setVerticalGroup(
            pn_btniventarisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_iventaris, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pn_btniventarisLayout.createSequentialGroup()
                .addComponent(p_ikoncom3, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pn_btniventarisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btniventarisLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(p_iventaris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(7, Short.MAX_VALUE)))
        );

        pn_btntransaksi.setBackground(new java.awt.Color(255, 255, 255));

        p_transaksi.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout p_transaksiLayout = new javax.swing.GroupLayout(p_transaksi);
        p_transaksi.setLayout(p_transaksiLayout);
        p_transaksiLayout.setHorizontalGroup(
            p_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        p_transaksiLayout.setVerticalGroup(
            p_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        p_ikoncom4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transaksi.png"))); // NOI18N

        btn_transaksi.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btn_transaksi.setText("Transaksi Penjualan");
        btn_transaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_transaksiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_transaksiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_transaksiMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_btntransaksiLayout = new javax.swing.GroupLayout(pn_btntransaksi);
        pn_btntransaksi.setLayout(pn_btntransaksiLayout);
        pn_btntransaksiLayout.setHorizontalGroup(
            pn_btntransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btntransaksiLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(p_ikoncom4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_transaksi)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(pn_btntransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btntransaksiLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(p_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(182, Short.MAX_VALUE)))
        );
        pn_btntransaksiLayout.setVerticalGroup(
            pn_btntransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_ikoncom4, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
            .addGroup(pn_btntransaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_transaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pn_btntransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btntransaksiLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(p_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(7, Short.MAX_VALUE)))
        );

        pn_btnpembelian.setBackground(new java.awt.Color(255, 255, 255));

        p_pembelian.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout p_pembelianLayout = new javax.swing.GroupLayout(p_pembelian);
        p_pembelian.setLayout(p_pembelianLayout);
        p_pembelianLayout.setHorizontalGroup(
            p_pembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        p_pembelianLayout.setVerticalGroup(
            p_pembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        p_ikoncom5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pembelian.png"))); // NOI18N

        btn_pembelian.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btn_pembelian.setText("Pembelian");
        btn_pembelian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pembelianMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_pembelianMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_pembelianMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_btnpembelianLayout = new javax.swing.GroupLayout(pn_btnpembelian);
        pn_btnpembelian.setLayout(pn_btnpembelianLayout);
        pn_btnpembelianLayout.setHorizontalGroup(
            pn_btnpembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnpembelianLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(p_ikoncom5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_pembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pn_btnpembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnpembelianLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(p_pembelian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(182, Short.MAX_VALUE)))
        );
        pn_btnpembelianLayout.setVerticalGroup(
            pn_btnpembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_ikoncom5, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
            .addComponent(btn_pembelian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pn_btnpembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnpembelianLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(p_pembelian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(7, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout pn_namatokoLayout = new javax.swing.GroupLayout(pn_namatoko);
        pn_namatoko.setLayout(pn_namatokoLayout);
        pn_namatokoLayout.setHorizontalGroup(
            pn_namatokoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_namatokoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pn_namatokoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pn_namatokoLayout.createSequentialGroup()
                        .addComponent(ikon_toko)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_btndashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_btnsupplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_btniventaris, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_btnpembelian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_namatokoLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(pn_btntransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pn_namatokoLayout.setVerticalGroup(
            pn_namatokoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_namatokoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pn_namatokoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ikon_toko)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pn_btndashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pn_btniventaris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pn_btnsupplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addComponent(pn_btnpembelian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pn_btntransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pn_welcome.setBackground(new java.awt.Color(239, 219, 209));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cancel fix.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_welcomeLayout = new javax.swing.GroupLayout(pn_welcome);
        pn_welcome.setLayout(pn_welcomeLayout);
        pn_welcomeLayout.setHorizontalGroup(
            pn_welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_welcomeLayout.createSequentialGroup()
                .addContainerGap(496, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pn_welcomeLayout.setVerticalGroup(
            pn_welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pn_menu.setBackground(new java.awt.Color(239, 219, 209));
        pn_menu.setPreferredSize(new java.awt.Dimension(800, 460));
        pn_menu.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout pn_utamaLayout = new javax.swing.GroupLayout(pn_utama);
        pn_utama.setLayout(pn_utamaLayout);
        pn_utamaLayout.setHorizontalGroup(
            pn_utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_utamaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(pn_namatoko, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pn_utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_utamaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(pn_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_utamaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pn_welcome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_utamaLayout.setVerticalGroup(
            pn_utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_namatoko, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addGroup(pn_utamaLayout.createSequentialGroup()
                .addComponent(pn_welcome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(pn_utama, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 10, 800, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void btn_dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dashboardMouseEntered
        pn_btndashboard.setBackground(new Color(250, 250, 250));
        p_dashboardkecil.setBackground(new Color(0, 102, 153));
        
        
    }//GEN-LAST:event_btn_dashboardMouseEntered

    private void btn_dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dashboardMouseExited
        pn_btndashboard.setBackground(new Color(255, 255, 255));
        p_dashboardkecil.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_dashboardMouseExited

    private void btn_dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dashboardMouseClicked
        pn_btndashboard.setBackground(new Color(240, 240, 240));
        p_dashboardkecil.setBackground(new Color(0, 102, 153));
        
        pn_menu.removeAll();
        pn_menu.add(new MenuDashboard());
        pn_menu.repaint();
        pn_menu.revalidate();
    }//GEN-LAST:event_btn_dashboardMouseClicked

    private void btn_supplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_supplierMouseClicked
        btn_supplier.setBackground(new Color(240, 240, 240));
        p_supplier.setBackground(new Color(0, 102, 153));
        
        pn_menu.removeAll();
        pn_menu.add(new Supplier());
        pn_menu.repaint();
        pn_menu.revalidate();
    }//GEN-LAST:event_btn_supplierMouseClicked

    private void btn_supplierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_supplierMouseEntered
        btn_supplier.setBackground(new Color(250, 250, 250));
        p_supplier.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_btn_supplierMouseEntered

    private void btn_supplierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_supplierMouseExited
        btn_supplier.setBackground(new Color(255, 255, 255));
        p_supplier.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_supplierMouseExited

    private void btn_iventarisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_iventarisMouseClicked
        btn_iventaris.setBackground(new Color(240, 240, 240));
        p_iventaris.setBackground(new Color(0, 102, 153));
        
        pn_menu.removeAll();
        pn_menu.add(new Iventaris());
        pn_menu.repaint();
        pn_menu.revalidate();
    }//GEN-LAST:event_btn_iventarisMouseClicked

    private void btn_iventarisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_iventarisMouseEntered
        btn_iventaris.setBackground(new Color(250, 250, 250));
        p_iventaris.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_btn_iventarisMouseEntered

    private void btn_iventarisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_iventarisMouseExited
        btn_iventaris.setBackground(new Color(255, 255, 255));
        p_iventaris.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_iventarisMouseExited

    private void btn_transaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_transaksiMouseClicked
        btn_transaksi.setBackground(new Color(240, 240, 240));
        p_transaksi.setBackground(new Color(0, 102, 153));
        
        pn_menu.removeAll();
        //pn_menu.add(new LaporanPenjualan());
        pn_menu.repaint();
        pn_menu.revalidate();
    }//GEN-LAST:event_btn_transaksiMouseClicked

    private void btn_transaksiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_transaksiMouseEntered
        btn_transaksi.setBackground(new Color(250, 250, 250));
        p_transaksi.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_btn_transaksiMouseEntered

    private void btn_transaksiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_transaksiMouseExited
        btn_transaksi.setBackground(new Color(255, 255, 255));
        p_transaksi.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_transaksiMouseExited

    private void btn_pembelianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pembelianMouseClicked
        btn_pembelian.setBackground(new Color(240, 240, 240));
        p_pembelian.setBackground(new Color(0, 102, 153));
        
        pn_menu.removeAll();
        pn_menu.add(new Pembelian());
        pn_menu.repaint();
        pn_menu.revalidate();
    }//GEN-LAST:event_btn_pembelianMouseClicked

    private void btn_pembelianMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pembelianMouseEntered
        btn_pembelian.setBackground(new Color(250, 250, 250));
        p_pembelian.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_btn_pembelianMouseEntered

    private void btn_pembelianMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pembelianMouseExited
        btn_pembelian.setBackground(new Color(255, 255, 255));
        p_pembelian.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_pembelianMouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //Koneksi k = new Koneksi();
        //k.connect();
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
            java.util.logging.Logger.getLogger(HalamanUtamaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalamanUtamaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalamanUtamaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalamanUtamaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new HalamanUtamaAdmin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_dashboard;
    private javax.swing.JLabel btn_iventaris;
    private javax.swing.JLabel btn_pembelian;
    private javax.swing.JLabel btn_supplier;
    private javax.swing.JLabel btn_transaksi;
    private javax.swing.JLabel ikon_toko;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel p_dashboardkecil;
    private javax.swing.JLabel p_ikoncom;
    private javax.swing.JLabel p_ikoncom1;
    private javax.swing.JLabel p_ikoncom3;
    private javax.swing.JLabel p_ikoncom4;
    private javax.swing.JLabel p_ikoncom5;
    private javax.swing.JPanel p_iventaris;
    private javax.swing.JPanel p_pembelian;
    private javax.swing.JPanel p_supplier;
    private javax.swing.JPanel p_transaksi;
    private javax.swing.JPanel pn_btndashboard;
    private javax.swing.JPanel pn_btniventaris;
    private javax.swing.JPanel pn_btnpembelian;
    private javax.swing.JPanel pn_btnsupplier;
    private javax.swing.JPanel pn_btntransaksi;
    private javax.swing.JPanel pn_menu;
    private javax.swing.JPanel pn_namatoko;
    private javax.swing.JPanel pn_utama;
    private javax.swing.JPanel pn_welcome;
    // End of variables declaration//GEN-END:variables
}
