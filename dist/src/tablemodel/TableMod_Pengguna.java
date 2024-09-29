/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.model_pengguna;

/**
 *
 * @author M E L I A
 */
public class TableMod_Pengguna extends AbstractTableModel {

    private List<model_pengguna> list = new ArrayList<>();
    
    public void tambahData (model_pengguna mopengguna) {
        list.add(mopengguna);
        fireTableRowsInserted(list.size() - 1, list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
    }
    //ikutin parameter yang di dalam kurung
    public void  perbaharuiData (int row, model_pengguna mopengguna) {
        list.add(row, mopengguna);
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
    
    public void setData (List<model_pengguna> list) {
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData (int index, model_pengguna mopengguna) {
        list.set(index, mopengguna);
        fireTableRowsUpdated(index, index);
    }
    
    public model_pengguna getData(int index) {
        return list.get(index);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0: return list.get(rowIndex).getId_pengguna();
            case 1: return list.get(rowIndex).getUsername();
            case 2: return list.get(rowIndex).getJens_Pengguna();
            case 3: return list.get(rowIndex).getPassword();
            
            default:return null;
        }
       
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Id_pengguna";
            case 1: return "Username";
            case 2: return "Jens_Pengguna";
            case 3: return "Password";
            
            default:return null;
        }
    }
}
