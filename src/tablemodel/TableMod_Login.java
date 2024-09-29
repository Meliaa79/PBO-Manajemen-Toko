/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.model_login;

/**
 *
 * @author M E L I A
 */
public class TableMod_Login  extends AbstractTableModel {

    private List<model_login> list = new ArrayList<>();
    
    public void tambahData (model_login modlogin) {
        list.add(modlogin);
        fireTableRowsInserted(list.size() - 1, list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
    }
    //ikutin parameter yang di dalam kurung
    public void  perbaharuiData (int row, model_login modlogin) {
        list.add(row, modlogin);
        fireTableDataChanged();
        JOptionPane.showMessageDialog(null, "Data Berhasil diperbaharui");
    }
     
    public void hapusData (int index) {
        list.remove(index);
        fireTableRowsDeleted(index, index);
        JOptionPane.showMessageDialog(null, "Data Berhasil dihapus");
    }
    
    public void clear() {
        list.clear();
        fireTableDataChanged();
    }
    
    public void setData (List<model_login> list) {
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData (int index, model_login modlogin) {
        list.set(index, modlogin);
        fireTableRowsUpdated(index, index);
    }
    
    public model_login getData(int index) {
        return list.get(index);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0: return list.get(rowIndex).getId_pengguna();
            case 1: return list.get(rowIndex).getUsername();
            case 2: return list.get(rowIndex).getPass_User();
            
            default:return null;
        }
       
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Id_pengguna";
            case 1: return "Username";
            case 2: return "Password";
 
            default:return null;
        }
    }
    
}
