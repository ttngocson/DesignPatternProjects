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
public class ChicagoPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String item){
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } 
        else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } 
        else if (item.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } 
        else if (item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } 
        else 
            return null;
    }

private static class ChicagoStyleCheesePizza extends Pizza {

        public ChicagoStyleCheesePizza() {
            System.out.println("ChicagoStyleCheesePizza");
        }
    }

    private static class ChicagoStyleVeggiePizza extends Pizza {

        public ChicagoStyleVeggiePizza() {
            System.out.println("ChicagoStyleVeggiePizza");
        }
    }

    private static class ChicagoStyleClamPizza extends Pizza {

        public ChicagoStyleClamPizza() {
            System.out.println("ChicagoStyleClamPizza");
        }
    }

    private static class ChicagoStylePepperoniPizza extends Pizza {

        public ChicagoStylePepperoniPizza() {
            System.out.println("ChicagoStylePepperoniPizza");
        }
    }
}
