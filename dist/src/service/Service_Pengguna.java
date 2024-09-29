/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.model_pengguna;

/**
 *
 * @author M E L I A
 */
public interface Service_Pengguna {
    void tambahData (model_pengguna mopengguna);
    void perbaharuiData (model_pengguna mopengguna);
    
    model_pengguna getByid(String id);
    
    List<model_pengguna> ambilData();
    
    List<model_pengguna> pencarian(String id);
    
    String nomor();
}
