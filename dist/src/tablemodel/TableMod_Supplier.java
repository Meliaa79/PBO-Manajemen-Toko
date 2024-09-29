/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.model_supplier;

/**
 *
 * @author M E L I A
 */
public class TableMod_Supplier extends AbstractTableModel {

    private List<model_supplier> list = new ArrayList<>();
    
    public void tambahData (model_supplier mosu) {
        list.add(mosu);
        fireTableRowsInserted(list.size() - 1, list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
    }
    //ikutin parameter yang di dalam kurung
    public void  perbaharuiData (int row, model_supplier mosu) {
        list.add(row, mosu);
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
    
    public void setData (List<model_supplier> list) {
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData (int index, model_supplier mosu) {
        list.set(index, mosu);
        fireTableRowsUpdated(index, index);
    }
    
    public model_supplier getData(int index) {
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
            case 0: return list.get(rowIndex).getId_supplier();
            case 1: return list.get(rowIndex).getNama_Supplier();
            case 2: return list.get(rowIndex).getAlamat();
            case 3: return list.get(rowIndex).getNo_Tlp();
            
            default:return null;
        }
       
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Id_supplier";
            case 1: return "Nama_Supplier";
            case 2: return "Alamat";
            case 3: return "No_Tlp";
            
            default:return null;
        }
    }
    
}
