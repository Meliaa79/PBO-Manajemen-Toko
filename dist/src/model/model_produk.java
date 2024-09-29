/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author M E L I A
 */
public class model_produk {
    private String id_produk;
    private model_jenisproduk kode_jenis;
    private model_supplier kode_supplier;
    private String Nama_Produk;
    private Long Harga;
    private Integer Stok;

    public String getId_produk() {
        return id_produk;
    }

    public void setId_produk(String id_produk) {
        this.id_produk = id_produk;
    }

    public model_jenisproduk getKode_jenis() {
        return kode_jenis;
    }

    public void setKode_jenis(model_jenisproduk kode_jenis) {
        this.kode_jenis = kode_jenis;
    }

    public model_supplier getKode_supplier() {
        return kode_supplier;
    }

    public void setKode_supplier(model_supplier kode_supplier) {
        this.kode_supplier = kode_supplier;
    }

    public String getNama_Produk() {
        return Nama_Produk;
    }

    public void setNama_Produk(String Nama_Produk) {
        this.Nama_Produk = Nama_Produk;
    }

    public Long getHarga() {
        return Harga;
    }

    public void setHarga(Long Harga) {
        this.Harga = Harga;
    }

    public Integer getStok() {
        return Stok;
    }

    public void setStok(Integer Stok) {
        this.Stok = Stok;
    }

    
}
