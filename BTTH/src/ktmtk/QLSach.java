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
public class QLSach extends EntityManager<Sach>{

    ArrayList<Sach> list;

    public QLSach(ArrayList<Sach> list) {
        this.list = list;
    }
    @Override
    public String getKey(Sach t) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return t.getID();
    }
    
    void PrintList(ArrayList<Sach> list){
        for(Sach _sach : list){
            System.out.println(_sach.toString());
        }
    }
}
