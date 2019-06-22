/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author transon
 */
public class DecoratorMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IBegerage cafe = new Coffe();
        cafe = new Milk(cafe);
        cafe = new Milk(cafe);
        cafe = new XiMuoi(cafe);
        IBegerage bun = new Bun();
        bun = new Gio(bun);
        bun = new XiMuoi(bun);
        
        System.out.println(cafe.description());
        System.out.println(cafe.coast());
        System.out.println(bun.description());
        System.out.println(bun.coast());
    }
    
}
