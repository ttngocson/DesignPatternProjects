/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleTon;

/**
 *
 * @author transon
 */
public class singleton {
    private static singleton intance;
    private int x=0;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    protected singleton(){}
    public static singleton Intance(){
        if (intance == null)
            intance = new singleton();
        return intance;
    }
    
    
   
        
}
