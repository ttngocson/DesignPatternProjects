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
public abstract class EntityManager<T> {
    ArrayList<T> list;
    
    public abstract String getKey(T t);
    
    public void add(T t){
        list.add(t);
    }
    public void SubList (T t){
        
    }
    
}
