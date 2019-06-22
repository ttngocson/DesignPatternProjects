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
public class XiMuoi extends Decorator{

    public XiMuoi(IBegerage iBegerage) {
        super(iBegerage);
    }

    @Override
    public String description() {
        return iBegerage.description() + " + 1 cục xí muội";
    }

    @Override
    public int coast() {
        return iBegerage.coast() + 5000;
    }
    
}
