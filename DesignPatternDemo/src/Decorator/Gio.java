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
public class Gio extends Decorator{

    public Gio(IBegerage iBegerage) {
        super(iBegerage);
    }

    @Override
    public String description() {
        return iBegerage.description() + " + 1 cục giò heo"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int coast() {
        return iBegerage.coast() + 20000; //To change body of generated methods, choose Tools | Templates.
    }
    
}
