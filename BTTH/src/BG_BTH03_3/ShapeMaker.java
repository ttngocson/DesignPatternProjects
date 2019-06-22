/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BG_BTH03_3;

/**
 *
 * @author transon
 */
public class ShapeMaker {
    private IShape circle, retangle, square;

    public ShapeMaker()
    {
        circle = new Circle();
        retangle = new Retangle();
        square = new Square();
    }
    
    public void drawCircle(){
        //circle = new Circle();
        circle.draw();
    }
    
    public void drawRetangle(){
        //retangle = new Retangle();
        retangle.draw();
    }
    
    public void drawSquare(){
        //square = new Square();
        square.draw();
    }
}
