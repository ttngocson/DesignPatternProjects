/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PDF_BT2;

import java.util.ArrayList;

/**
 *
 * @author transon
 */
public class DataStore {
    private static DataStore instance;
    
    private ArrayList<Sach> dsSach;
    
    protected DataStore(){
    dsSach = new ArrayList<>();
    dsSach.add(new Sach("SOT356", "Lập trình thiết bị di động", "DHNT", 30000));
    dsSach.add(new Sach("SOT355", "Phát triển ứng dụng Web", "DHNT", 25000));
    dsSach.add(new Sach("SOT353", "Mẫu thiết kế", "DHNT", 35000));
    dsSach.add(new Sach("SOT349", "Công nghệ phần mềm", "DHNT", 20));
    dsSach.add(new Sach("POL340", "Đường lối CM của Đảng CS Việt Nam", "DHNT", 29000));
    }
    
    public ArrayList<Sach> getDsSach(){
        return dsSach;
    }
    
    public Sach getSach(int index){
        return dsSach.get(index);
    }
    
    public void themSach(Sach sach){
        dsSach.add(sach);
    }
    
    public void suaSach(int index,Sach sach){
        dsSach.set(index, sach);
    }
    
    public void xoaSach(int index){
        dsSach.remove(index);
    }
    
    public static DataStore getInstance(){
        if (instance == null)
            instance = new DataStore();
        return instance;
    }
}
