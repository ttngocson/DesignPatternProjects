/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caffeine;

/**
 *
 * @author transon
 */
public class Caffeine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        tea.prepareRecipe();
        System.out.println();
        coffee.prepareRecipe();
    }
    
}
