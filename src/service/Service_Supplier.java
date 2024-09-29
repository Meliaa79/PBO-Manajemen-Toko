/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.model_supplier;

/**
 *
 * @author M E L I A
 */
public interface Service_Supplier {
    void hapusData(model_supplier mosu);
    void tambahData (model_supplier mosu);
    void perbaharuiData (model_supplier mosu);
    
    
    model_supplier getByid(String id);
    
    List<model_supplier> ambilData();
    
    List<model_supplier> pencarian(String id);
    
    String nomor();
}
