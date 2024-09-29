/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.model_login;

/**
 *
 * @author M E L I A
 */
public interface Service_Login {
    void hapusData(model_login modlogin);
    void tambahData (model_login modlogin);
    
    
    model_login getByid(String id);
    
    List<model_login> ambilData();
    
    List<model_login> pencarian(String id);
    
    String nomor();
}
