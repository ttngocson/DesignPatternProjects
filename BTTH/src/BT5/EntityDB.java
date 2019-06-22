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
public abstract class EntityDB<T> {
    ArrayList<T> list; 

    public EntityDB(ArrayList<T> list) {
        this.list = list;
    }
    
    public boolean add(T t){
        if(findById(getKey(t)) == null){
            list.add(list.size(), t);
            return true;
        }
        return false;
    }
    
    public int update(T t){
        int count = 0;
        for (T _t: list){
            if(getKey(t) == getKey(_t)){
                list.set(count, t);
                return 1;
            }
            count++;
        }
        return 0;
    }
    
    public int delete(T t){
        int count = 0;
        for (T _t: list){
            if(getKey(t) == getKey(_t)){
                list.remove(count);
                return 1;
            }
            count++;
        }
        return 0;
    }
    
    public int deleteByKey(int id){
        T index = findById(id);
        if(index != null){
            list.remove(index);
            return 1;
        }
        return 0;
    }
    
    protected T findById(int id)
    {
        for(T t: list)
            if(getKey(t)==id)
                return t;
        return null;
    }

    public void xuat(){
        for(T t: list)
            System.out.println(t.toString());
    }
    
    public abstract int getKey(T t);
}
