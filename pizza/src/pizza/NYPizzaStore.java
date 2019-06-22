/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

/**
 *
 * @author transon
 */
public class NYPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String item){
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } 
        else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } 
        else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } 
        else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } 
        else 
            return null;
    }

    private static class NYStyleCheesePizza extends Pizza {

        public NYStyleCheesePizza() {
            System.out.println("NYStyleCheesePizza");
        }
    }

    private static class NYStyleVeggiePizza extends Pizza {

        public NYStyleVeggiePizza() {
            System.out.println("NYStyleVeggiePizza");
        }
    }

    private static class NYStyleClamPizza extends Pizza {

        public NYStyleClamPizza() {
            System.out.println("NYStyleClamPizza");
        }
    }

    private static class NYStylePepperoniPizza extends Pizza {

        public NYStylePepperoniPizza() {
            System.out.println("NYStylePepperoniPizza");
        }
    }
}
