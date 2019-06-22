/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kt_ttngocson_58133435;

/**
 *
 * @author transon
 */
public class Sach {
    //thuộc tính của Sach
    String tenSach, NXB;
    int ID, giaBia, SL;
    //constructor
    public Sach() {
    }

    public Sach(int ID, String tenSach, String NXB, int giaBia, int SL) {
        this.tenSach = tenSach;
        this.NXB = NXB;
        this.ID = ID;
        this.giaBia = giaBia;
        this.SL = SL;
    }
    //getter setter các thuộc tính
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

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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
    //hàm này khi gọi Sach.toString sẽ trả về string "  ID   tenSach    NXB giaBia  SL"
    @Override
    public String toString() {
        return "\t" + ID + "\t" + tenSach + "\t" + NXB + "\t" + giaBia + "\t" + SL;
    }
}
