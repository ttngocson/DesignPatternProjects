/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strate;

import fly_behavior.Flylikeabird;
import fly_behavior.Flywithwings;
import quack_behavior.Keunhuchim;
import quack_behavior.Quack;

/**
 *
 * @author Admin
 */
public class Vidu1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Dusk dusk = new Dusk(new Flywithwings(),new Quack() ,"vietminh");
         System.out.println("phien ban 1");
         dusk.display();
         
         Dusk dusk1 = new Dusk(new Flylikeabird(), new Keunhuchim(),"vit lai chim");
         System.out.println("Phien ban 2 ");
         dusk1.display();
    }
    
}
