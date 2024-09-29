/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.model_pembelian;

/**
 *
 * @author M E L I A
 */
public interface Service_Pembelian {
    void hapusData(model_pembelian mobeli);
    void tambahData (model_pembelian mobeli);
    void perbaharuiData (model_pembelian mobeli);
    void sumData (model_pembelian mobeli);
    
    model_pembelian getByid(String id);
    
    List<model_pembelian> ambilData();
    
    List<model_pembelian> pencarian(String id);
    
    String nomor();
}
