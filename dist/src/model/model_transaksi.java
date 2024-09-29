/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author M E L I A
 */
public class model_transaksi {
    private String id_transaksi;
    private model_pengguna kode_pengguna;
    private model_metodepembayaran kode_metode;
    private Date Tanggal;
    private Integer Jumlah;
    private Long Total_Harga;

    public String getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(String id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public model_pengguna getKode_pengguna() {
        return kode_pengguna;
    }

    public void setKode_pengguna(model_pengguna kode_pengguna) {
        this.kode_pengguna = kode_pengguna;
    }

    public model_metodepembayaran getKode_metode() {
        return kode_metode;
    }

    public void setKode_metode(model_metodepembayaran kode_metode) {
        this.kode_metode = kode_metode;
    }

    public Date getTanggal() {
        return Tanggal;
    }

    public void setTanggal(Date Tanggal) {
        this.Tanggal = Tanggal;
    }

    public Integer getJumlah() {
        return Jumlah;
    }

    public void setJumlah(Integer Jumlah) {
        this.Jumlah = Jumlah;
    }

    public Long getTotal_Harga() {
        return Total_Harga;
    }

    public void setTotal_Harga(Long Total_Harga) {
        this.Total_Harga = Total_Harga;
    }

    
}
