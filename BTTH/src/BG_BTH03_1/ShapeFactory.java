/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BG_BTH03_1;
/**
 *
 * @author transon
 */
public class ShapeFactory {
    IShape shape;            

    public ShapeFactory() {}
    
    public IShape getShape(String name){
        if(name.equals("Circle"))
            shape = new Circle();
        if(name.equals("Square"))
            shape = new Square();
        if(name.equals("Retangle"))
            shape = new Retangle();
        return shape;
    }
    
    public void print(){
        shape.draw();
    }
}
