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
public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(IShape shape) {
        super(shape);
    }
    
    private void setRedBorder(){
        System.out.println(" viền màu đỏ.");
    }

    @Override
    public void draw() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        shape.draw();
        setRedBorder();
    }
    
}
