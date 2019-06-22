/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTBuilderPattern;

import BuilderPattern.Computer;
import java.util.ArrayList;

/**
 *
 * @author transon
 */
public class HoaDon {
    String ID, khachHang, ngayBan;
    ArrayList<ChiTietHoaDon> chiTietHD = new ArrayList<>();
    
    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < chiTietHD.size(); i++)
            str  = str + chiTietHD.get(i).toString() + "\n";
        return "Hoa Don" + 
                    "\nMa hoa don: " + ID +
                    "\nKhach hang: " + khachHang +
                    "\nNgay ban: " + ngayBan + 
                    "\nChi tiet hoa don:" + 
                    "\nMat hang\tSL\tDVT\tGia\n" + 
                    str;
                          
    }
    
    public static class Builder{
        HoaDon hoaDon;
        
        public Builder(){
            hoaDon = new HoaDon();
        }
        
        public Builder addID(String ID){
            hoaDon.ID = ID;
            return this;
        }
        
        public Builder addKhachHang(String khachHang){
            hoaDon.khachHang = khachHang;
            return this;
        }
        
        public Builder addNgayBan(String ngayBan){
            hoaDon.ngayBan = ngayBan;
            return this;
        }
        
        public Builder addChiTietHD(String matHang, String soLuong, String DVT, String gia){
            ChiTietHoaDon CTHD = new ChiTietHoaDon();
            CTHD.them(matHang, soLuong, DVT, gia);
            hoaDon.chiTietHD.add(CTHD);
            return this;
        }
        
        public HoaDon build(){
            return hoaDon;
        }
    }
}
