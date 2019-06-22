/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strate;

import fly_behavior.IFly_behavior;
import quack_behavior.IQuack_behavior;

/**
 *
 * @author Admin
 */
public class Dusk {
    IFly_behavior fly_behavior;
    IQuack_behavior quack_behavior;
    String name;
    
    public Dusk(IFly_behavior fly_behavior , IQuack_behavior quack_behavior,String name){
        this.fly_behavior = fly_behavior;
        this.quack_behavior = quack_behavior;
        this.name = name;
    }
    public void performquack(){
        System.out.println(quack_behavior.Quack());
    }
    
    public void performfly(){
        System.out.println(fly_behavior.fly());
    }
    public void display(){
        System.out.println("xin chao "+name);
        System.out.println("toi keu ");
        performquack();
        performfly();
    }
}

