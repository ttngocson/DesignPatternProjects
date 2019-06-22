/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package straterypattendemo;

import flyBehavior.FlyNoWay;
import flyBehavior.FlyWithWings;
import quackBehavior.MuteQuack;
import quackBehavior.Squack;


/**
 *
 * @author transon
 */
public class StrateryPattenDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Duck duck = new Duck(new FlyNoWay(), new Squack(), "ASV");
        Duck ds = new Duck(new FlyWithWings(), new MuteQuack(), "name");
        duck.display();
        ds.display();
        
    }
    
}
