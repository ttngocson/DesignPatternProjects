/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thi_ttngocson_58133435;

/**
 *
 * @author transon
 */
public class MonHoc {
    private String tenMH;
    private int soTC;
    private float diemKT, diemThi, diemTB;

    public MonHoc() {
    }
    
    public MonHoc(String tenMH, int soTC, float diemKT, float diemThi) {
        this.tenMH = tenMH;
        this.soTC = soTC;
        this.diemKT = diemKT;
        this.diemThi = diemThi;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public int getSoTC() {
        return soTC;
    }

    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }

    public float getdiemKT() {
        return diemKT;
    }

    public void setDtKT(float diemKT) {
        this.diemKT = diemKT;
    }

    public float getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(float diemThi) {
        this.diemThi = diemThi;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "\t" + tenMH + "\t" + soTC + "\t" + diemKT + "\t" + diemThi;
    }
    
    
}
