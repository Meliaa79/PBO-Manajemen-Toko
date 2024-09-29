/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author M E L I A
 */
public class model_detail_transaksi {
    private String id_detail_transaksi;
    private model_transaksi kode_transaksi;
    private model_produk kode_produk;
    private Integer Jumlah_Produk;
    private Long Total_Harga;

    public String getId_detail_transaksi() {
        return id_detail_transaksi;
    }

    public void setId_detail_transaksi(String id_detail_transaksi) {
        this.id_detail_transaksi = id_detail_transaksi;
    }

    public model_transaksi getKode_transaksi() {
        return kode_transaksi;
    }

    public void setKode_transaksi(model_transaksi kode_transaksi) {
        this.kode_transaksi = kode_transaksi;
    }

    public model_produk getKode_produk() {
        return kode_produk;
    }

    public void setKode_produk(model_produk kode_produk) {
        this.kode_produk = kode_produk;
    }

    public Integer getJumlah_Produk() {
        return Jumlah_Produk;
    }

    public void setJumlah_Produk(Integer Jumlah_Produk) {
        this.Jumlah_Produk = Jumlah_Produk;
    }

    public Long getTotal_Harga() {
        return Total_Harga;
    }

    public void setTotal_Harga(Long Total_Harga) {
        this.Total_Harga = Total_Harga;
    }
}
