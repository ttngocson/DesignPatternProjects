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
public class singletonDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        singleton s1 = singleton.Intance();
        singleton s2 = singleton.Intance();
        s2.setX(10);
        var a = s1.getX();
        
        System.out.print("Gia tri a: " + a + "\n");
        System.out.print("Gia tri s1: " + s1.getX() + "\n");
        System.out.print("Gia tri s2: " + s2.getX() + "\n");
    }
    
}
