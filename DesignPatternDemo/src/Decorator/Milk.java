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
public class Milk extends Decorator{
    
    public Milk(IBegerage iBegerage) {
        super(iBegerage);
    }

    @Override
    public String description() {
        return iBegerage.description() + " + Sữa cô gái Hà Lan";//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int coast() {
        return iBegerage.coast() + 50000; //To change body of generated methods, choose Tools | Templates.
    }
    
}
