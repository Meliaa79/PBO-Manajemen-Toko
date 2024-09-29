/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.model_detail_transaksi;

/**
 *
 * @author M E L I A
 */
public interface Service_Detail_Transaksi {
    void hapusData(model_detail_transaksi modettrans);
    void tambahData (model_detail_transaksi modettrans);
    void perbaharuiData (model_detail_transaksi modettrans);
    void sumData (model_detail_transaksi modettrans);
    
    model_detail_transaksi getByid(String id);
    
    List<model_detail_transaksi> ambilData();
    
    List<model_detail_transaksi> pencarian(String id);
    
    String nomor();
}
