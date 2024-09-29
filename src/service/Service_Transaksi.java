/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.model_transaksi;

/**
 *
 * @author M E L I A
 */
public interface Service_Transaksi {
    void hapusData(model_transaksi motrans);
    void tambahData (model_transaksi motrans);
    void perbaharuiData (model_transaksi motrans);
    void sumData (model_transaksi motrans);
    
    model_transaksi getByid(String id);
    
    List<model_transaksi> ambilData();
    
    List<model_transaksi> pencarian(String id);
    
    String nomor();
}
