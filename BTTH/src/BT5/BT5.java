/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT5;

import java.util.ArrayList;

/**
 *
 * @author transon
 */
public class BT5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<MonHoc> DSMH = new ArrayList<>();
        DSMH.add(new MonHoc(1, "MTK", 3));
        DSMH.add(new MonHoc(2, "TBDD", 3));
        DSMH.add(new MonHoc(3, "XML", 3));
        MonHoc mh = new MonHoc(3, "UDW", 3);
        MonHocDB MHDB = new MonHocDB(DSMH);
        System.out.println(MHDB.add(mh));
        MHDB.xuat();
    }
    
}
