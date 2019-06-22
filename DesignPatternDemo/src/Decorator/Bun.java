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
public class Bun implements IBegerage{

    @Override
    public String description() {
        return "Bún chả Hà Nội";
    }

    @Override
    public int coast() {
        return 50000;
    }
    
}
