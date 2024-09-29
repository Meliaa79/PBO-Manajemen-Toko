/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.model_produk;

/**
 *
 * @author M E L I A
 */
public class TableMod_Produk extends AbstractTableModel {
    
    private List<model_produk> list = new ArrayList<>();
    
    public void tambahData (model_produk modproduk) {
        list.add(modproduk);
        fireTableRowsInserted(list.size() - 1, list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
    }
    //ikutin parameter yang di dalam kurung
    public void  perbaharuiData (int row, model_produk modproduk) {
        list.add(row, modproduk);
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
    
    public void setData (List<model_produk> list) {
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData (int index, model_produk modproduk) {
        list.set(index, modproduk);
        fireTableRowsUpdated(index, index);
    }
    
    public model_produk getData(int index) {
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
            case 0: return list.get(rowIndex).getId_produk();
            case 1: return list.get(rowIndex).getKode_jenis().getId_jenis();
            case 2: return list.get(rowIndex).getKode_jenis().getNama_Jenis();
            case 3: return list.get(rowIndex).getKode_supplier().getId_supplier();
            case 4: return list.get(rowIndex).getKode_supplier().getNama_Supplier();
            case 5: return list.get(rowIndex).getNama_Produk();
            case 6: return list.get(rowIndex).getHarga();
            case 7: return list.get(rowIndex).getStok();
            
            default:return null;
        }
       
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Id_produk";
            case 1: return "Id_jenis";
            case 2: return "Nama_Jenis";
            case 3: return "Id_supplier";
            case 4: return "Nama_Supplier";
            case 5: return "Nama_Produk";
            case 6: return "Harga";
            case 7: return "Stok";
            
            default:return null;
        }
    }
    
}
