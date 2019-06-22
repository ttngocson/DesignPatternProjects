/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thi_ttngocson_58133435;

import java.util.ArrayList;

/**
 *
 * @author transon
 */
public abstract class ItemDecorator implements Item{
    protected Item item;

    public ItemDecorator(Item item) {
        this.item = item;
    }
    
    @Override
    public void display() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        item.display();
    }

    @Override
    public MonHoc getBasedItem() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return item.getBasedItem();
    }
}
