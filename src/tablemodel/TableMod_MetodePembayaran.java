/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.model_metodepembayaran;

/**
 *
 * @author M E L I A
 */
public class TableMod_MetodePembayaran extends AbstractTableModel {

    private List<model_metodepembayaran> list = new ArrayList<>();
    
    public void tambahData (model_metodepembayaran mobayar) {
        list.add(mobayar);
        fireTableRowsInserted(list.size() - 1, list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
    }
    //ikutin parameter yang di dalam kurung
    public void  perbaharuiData (int row, model_metodepembayaran mobayar) {
        list.add(row, mobayar);
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
    
    public void setData (List<model_metodepembayaran> list) {
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData (int index, model_metodepembayaran mobayar) {
        list.set(index, mobayar);
        fireTableRowsUpdated(index, index);
    }
    
    public model_metodepembayaran getData(int index) {
        return list.get(index);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0: return list.get(rowIndex).getId_metodepembayaran();
            case 1: return list.get(rowIndex).getNama_metodepembayaran();

            default:return null;
        }
       
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Id_metodepembayaran";
            case 1: return "Nama_metodepembayaran";
            
            
            default:return null;
        }
    }
    
}
