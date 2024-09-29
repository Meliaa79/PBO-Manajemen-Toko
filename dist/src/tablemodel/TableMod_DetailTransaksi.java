/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.model_detail_transaksi;

/**
 *
 * @author M E L I A
 */
public class TableMod_DetailTransaksi extends AbstractTableModel {

    private List<model_detail_transaksi> list = new ArrayList<>();
    
    public void tambahData (model_detail_transaksi modettrans) {
        list.add(modettrans);
        fireTableRowsInserted(list.size() - 1, list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
    }
    //ikutin parameter yang di dalam kurung
    public void  perbaharuiData (int row, model_detail_transaksi modettrans) {
        list.add(row, modettrans);
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
    
    public void setData (List<model_detail_transaksi> list) {
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData (int index, model_detail_transaksi modettrans) {
        list.set(index, modettrans);
        fireTableRowsUpdated(index, index);
    }
    
    public model_detail_transaksi getData(int index) {
        return list.get(index);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0: return list.get(rowIndex).getId_detail_transaksi();
            case 1: return list.get(rowIndex).getKode_transaksi().getId_transaksi();
            case 2: return list.get(rowIndex).getKode_transaksi().getTanggal();
            case 3: return list.get(rowIndex).getKode_produk().getId_produk();
            case 4: return list.get(rowIndex).getKode_produk().getNama_Produk();
            case 5: return list.get(rowIndex).getJumlah_Produk();
            case 6: return list.get(rowIndex).getTotal_Harga();
            
            
            default:return null;
        }
       
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Id_detail_transaksi";
            case 1: return "Id_transaksi";
            case 2: return "Tanggal";
            case 3: return "Id_produk";
            case 4: return "Nama_Produk";
            case 5: return "Jumlah_Produk";
            case 6: return "Total_Harga";
            
            
            default:return null;
        }
    }
    
}
