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
public class Coffe implements IBegerage{

    @Override
    public String description() {
        return "Ly cafe như muốn nói, nói với em câu gì";
    }

    @Override
    public int coast() {
        return 100000;
    }
    
}
