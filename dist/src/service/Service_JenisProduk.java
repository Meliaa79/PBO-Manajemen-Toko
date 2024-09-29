/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.model_jenisproduk;

/**
 *
 * @author M E L I A
 */
public interface Service_JenisProduk {
    void hapusData(model_jenisproduk mojenis);
    void tambahData (model_jenisproduk mojenis);
    void perbaharuiData (model_jenisproduk mojenis);
    
    model_jenisproduk getByid (String id);
            
    List<model_jenisproduk> ambilData();
    List<model_jenisproduk> ambilData2();
    
    List<model_jenisproduk> pencarian(String id);
    List<model_jenisproduk> pencarian2(String id);
    
    String nomor();
    String nomor2();
    
}
