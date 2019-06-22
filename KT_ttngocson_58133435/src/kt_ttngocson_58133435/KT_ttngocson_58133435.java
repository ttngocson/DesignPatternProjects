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
public class KT_ttngocson_58133435 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Sach> list = new ArrayList<>();
        list.add(new Sach(1, "Sach1","NXB1", 15000, 30));
        list.add(new Sach(2, "Sach2","NXB2", 20000, 40));
        list.add(new Sach(3, "Sach3","NXB3", 25000, 50));
        list.add(new Sach(4, "Sach4","NXB4", 30000, 60));
        list.add(new Sach(5, "Sach5","NXB5", 35000, 70));
        
        QLSach qls = new QLSach(list);
        
        qls.setCompare(new CompareByPrice());
        
        //cau 2
        Sach sach = new Sach();
        sach.setGiaBia(25000);
        qls.printList(qls.getSubList(sach));
        //
        //Sach sach6 = new Sach(6, "Sach6","NXB6", 40000, 80);
        //System.out.println(qls.add(sach6));
        //qls.printList(list);
        //cau 3
        qls.KiemTra(50);
    }
    
}
