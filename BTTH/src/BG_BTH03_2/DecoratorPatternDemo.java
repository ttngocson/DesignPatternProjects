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
public class DecoratorPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IShape circle = new Circle();
        circle = new RedShapeDecorator(circle);
        circle.draw();
        
        IShape retangle = new Retangle();
        retangle = new RedShapeDecorator(retangle);
        retangle.draw();
    }
    
}
