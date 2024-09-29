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
public class model_pembelian {
    private String id_pembelian;
    private model_supplier kode_supplier;
    private model_produk kode_produk;
    private Date Tanggal;
    private Integer Jumlah;
    private Long Total_Harga;

    public String getId_pembelian() {
        return id_pembelian;
    }

    public void setId_pembelian(String id_pembelian) {
        this.id_pembelian = id_pembelian;
    }

    public model_supplier getKode_supplier() {
        return kode_supplier;
    }

    public void setKode_supplier(model_supplier kode_supplier) {
        this.kode_supplier = kode_supplier;
    }

    public model_produk getKode_produk() {
        return kode_produk;
    }

    public void setKode_produk(model_produk kode_produk) {
        this.kode_produk = kode_produk;
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
