/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package straterypattendemo;
import flyBehavior.IFlyBehavior;
import quackBehavior.IQuackBehavior;

/**
 *
 * @author transon
 */
public class Duck {
    IFlyBehavior fly_behavior;
    IQuackBehavior quack_behavior;
    String name;

    public Duck(IFlyBehavior fly_behavior, IQuackBehavior quack_ehavior, String name) {
        this.fly_behavior = fly_behavior;
        this.quack_behavior = quack_ehavior;
        this.name = name;
    }
    public void performFly(){
        System.out.println(quack_behavior.quack());
    }
    public void performQuack(){
        System.out.println(fly_behavior.fly());
    }
    public void display(){
        System.out.println("My Name is " + name);
        performQuack();
        performFly();
    }
}
