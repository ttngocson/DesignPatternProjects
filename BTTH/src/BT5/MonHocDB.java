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
public class MonHocDB extends EntityDB<MonHoc>{
    
    public MonHocDB(ArrayList<MonHoc> list) {
        super(list);
    }

    /*@Override
    protected MonHoc findById(int id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for (int i = 0; i< list.size(); i++)
            if(list.get(i).maMH == id)
                return list.get(i);
        return null;
    }*/

    @Override
    public int getKey(MonHoc t){
        return t.maMH;
    }
   
    
}
