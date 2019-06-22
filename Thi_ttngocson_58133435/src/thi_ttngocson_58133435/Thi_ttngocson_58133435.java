/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thi_ttngocson_58133435;

import java.util.ArrayList;

/**
 *
 * @author transon
 */
public class Thi_ttngocson_58133435 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MonHoc tbdd = new MonHoc("Lập trình thiết bị di dộng", 3, Float.valueOf("8.5"), Float.valueOf("8.8"));
        MonHoc MTK = new MonHoc("Mẫu thiết kế", 3, Float.valueOf("8.5"), Float.valueOf("8.8"));
        MonHoc LTW = new MonHoc("Lập trình web", 3, Float.valueOf("8.5"), Float.valueOf("8.8"));
        ArrayList<MonHoc> list = new ArrayList<>();
        list.add(tbdd);
        list.add(MTK);
        list.add(LTW);
        Item item = new MonHocClient(tbdd);
        item.display();
        item = new TinhTB(item);
        item.display();
    }
       
}
