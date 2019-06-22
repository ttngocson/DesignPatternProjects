/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PDF_BT2;

/**
 *
 * @author transon
 */
public class Sach {
    String maSach, tenSach, nhaXuatBan;
    int giaBia;

    public Sach() {}
    public Sach(String maSach, String tenSach, String nhaXuatBan, int giaBia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.nhaXuatBan = nhaXuatBan;
        this.giaBia = giaBia;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getGiaBia() {
        return giaBia;
    }

    public void setGiaBia(int giaBia) {
        this.giaBia = giaBia;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    @Override
    public String toString() {
        return maSach + "\t" + tenSach + "\t" + nhaXuatBan + "\t" + giaBia;
    }
    
    
    
}
