/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.ArrayList;

/**
 *
 * @author transon
 */
public class Composite implements IComponent{
    
    private String name;
    private ArrayList children = new ArrayList();

    public Composite(String name) {
        this.name = name;
    }
    
    @Override
    public void Add(IComponent c) {
         children.add(c);
    }

    @Override
    public void Remove(IComponent c) {
        children.remove(c);
    }

    @Override
    public void Display(int depth) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
