/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktmtk;

import java.util.ArrayList;

/**
 *
 * @author transon
 */
public class AppKtmtk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Sach> list = new ArrayList<>();
        list.add(new Sach("1", "Sach1","NXB1", 15000, 15));
        list.add(new Sach("2", "Sach2","NXB2", 20000, 20));
        list.add(new Sach("3", "Sach3","NXB3", 25000, 25));
        list.add(new Sach("4", "Sach4","NXB4", 30000, 30));
        list.add(new Sach("5", "Sach5","NXB5", 35000, 35));
        
        QLSach qls = new QLSach(list);
        qls.PrintList(list);
    }
    
}
