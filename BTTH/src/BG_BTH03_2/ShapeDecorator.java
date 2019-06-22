/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BG_BTH03_2;

/**
 *
 * @author transon
 */
public abstract class ShapeDecorator implements IShape{
    
    IShape shape;

    public ShapeDecorator(IShape shape) {
        this.shape = shape;
    }
    
}
