/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kt_ttngocson_58133435;

import java.util.ArrayList;

/**
 *
 * @author transon
 */
public class QLSach extends EntityManager<Sach>{

    //2 class dưới là hàm có sẵn
    public QLSach(ArrayList<Sach> list) {
        super(list);
    }
    //trả về ID của Sach t
    @Override
    protected int getKey(Sach t) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return t.ID;
    }
    
    //in ra màn hình các đối tượng của list
    void printList(ArrayList<Sach> list){
        for(Sach _sach : list){
            System.out.println(_sach.toString());
        }
    }
    
    //hàm này làm chơi
    public void KiemTra(int SL){
        boolean kt = false;
        System.out.println("Sach co so luong = 50: ");
        for(Sach _sach : list){
            if(_sach.getSL() == SL){
                System.out.println("\t" + _sach.getTenSach());
                kt = true;
            }
        }
        if(kt == false)
            System.out.println("\tKhong tim thay!");
        kt = false;
        System.out.println("Sach co so luong > 50: ");
        for(Sach _sach : list){
            if(_sach.getSL() > SL){
                System.out.println("\t" + _sach.getTenSach());
            }
            kt = true;
        }
        if(kt == false)
            System.out.println("\tKhong tim thay!");
    }
}
