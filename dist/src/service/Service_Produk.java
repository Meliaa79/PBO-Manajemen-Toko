/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.model_produk;

/**
 *
 * @author M E L I A
 */
public interface Service_Produk {
    void hapusData(model_produk moproduk);
    void tambahData (model_produk moproduk);
    void perbaharuiData (model_produk moproduk);
   
    
    model_produk getByid(String id);
    
    List<model_produk> ambilData();
    
    List<model_produk> pencarian(String id);
    
    String nomor();
}
