/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.model_pembelian;

/**
 *
 * @author M E L I A
 */
public class TableMod_Pembelian extends AbstractTableModel {

    private List<model_pembelian> list = new ArrayList<>();
    
    public void tambahData (model_pembelian mobeli) {
        list.add(mobeli);
        fireTableRowsInserted(list.size() - 1, list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
    }
    //ikutin parameter yang di dalam kurung
    public void  perbaharuiData (int row, model_pembelian mobeli) {
        list.add(row, mobeli);
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
    
    public void setData (List<model_pembelian> list) {
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData (int index, model_pembelian mobeli) {
        list.set(index, mobeli);
        fireTableRowsUpdated(index, index);
    }
    
    public model_pembelian getData(int index) {
        return list.get(index);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0: return list.get(rowIndex).getId_pembelian();
            case 1: return list.get(rowIndex).getKode_supplier().getId_supplier();
            case 2: return list.get(rowIndex).getKode_supplier().getNama_Supplier();
            case 3: return list.get(rowIndex).getKode_produk().getId_produk();
            case 4: return list.get(rowIndex).getKode_produk().getNama_Produk();
            case 5: return list.get(rowIndex).getTanggal();
            case 6: return list.get(rowIndex).getJumlah();
            case 7: return list.get(rowIndex).getTotal_Harga();
            
            default:return null;
        }
       
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Id_pembelian";
            case 1: return "Id_supplier";
            case 2: return "Nama_Supplier";
            case 3: return "Id_produk";
            case 4: return "Nama_Produk";
            case 5: return "NTanggal";
            case 6: return "Jumlah";
            case 7: return "Total_Harga";
            
            default:return null;
        }
    }
    
}
