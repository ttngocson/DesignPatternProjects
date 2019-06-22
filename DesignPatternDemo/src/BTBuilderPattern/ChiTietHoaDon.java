/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTBuilderPattern;

/**
 *
 * @author transon
 */
public class ChiTietHoaDon {
    String matHang, soLuong, DVT, gia;
    
    public void them(String matHang, String soLuong, String DVT, String gia) {
        this.matHang = matHang;
        this.soLuong = soLuong;
        this.DVT = DVT;
        this.gia = gia;
    }
    
    @Override
    public String toString() {
        return matHang + "\t" + soLuong + "\t" + DVT + "\t" + gia;
    }
}
