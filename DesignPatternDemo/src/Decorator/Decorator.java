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
public abstract class Decorator implements IBegerage{

    IBegerage iBegerage;

    public Decorator(IBegerage iBegerage) {
        this.iBegerage = iBegerage;
    }
}
