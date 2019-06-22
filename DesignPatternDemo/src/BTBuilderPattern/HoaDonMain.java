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
public class HoaDonMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HoaDon hoaDon = new HoaDon.Builder().addID("0001")
                            .addKhachHang("ASV")
                            .addNgayBan("14/05/2019")
                            .addChiTietHD("matHang1", "1", "1", "1")
                            .addChiTietHD("matHang2", "2", "2", "2")
                            .addChiTietHD("matHang3", "3", "3", "3")
                            .addChiTietHD("matHang4", "4", "4", "4")
                            .build();
        System.out.println(hoaDon.toString());
    }
    
}
