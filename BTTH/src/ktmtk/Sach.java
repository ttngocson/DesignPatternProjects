/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktmtk;

/**
 *
 * @author transon
 */
public class Sach {
    String ID, tenSach, NXB;
    int giaBia, SL;

    public Sach() {
    }

    public Sach(String ID, String tenSach, String NXB, int giaBia, int SL) {
        this.ID = ID;
        this.tenSach = tenSach;
        this.NXB = NXB;
        this.giaBia = giaBia;
        this.SL = SL;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    public int getGiaBia() {
        return giaBia;
    }

    public void setGiaBia(int giaBia) {
        this.giaBia = giaBia;
    }

    public int getSL() {
        return SL;
    }

    public void setSL(int SL) {
        this.SL = SL;
    }

    @Override
    public String toString() {
        return "\t" + ID + "\t" + tenSach + "\t" + NXB + "\t" + giaBia + "\t" + SL;
    }
}
