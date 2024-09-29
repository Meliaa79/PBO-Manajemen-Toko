/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.model_metodepembayaran;

/**
 *
 * @author M E L I A
 */
public interface Service_MetodePembayaran {
    void tambahData (model_metodepembayaran mobayar);
    void perbaharuiData (model_metodepembayaran mobayar);
    
    model_metodepembayaran getByid(String id);
    
    List<model_metodepembayaran> ambilData();
    
    List<model_metodepembayaran> pencarian(String id);
    
    String nomor();
}
