/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT6;

/**
 *
 * @author transon
 */
public class context {
    private Tinh tinhToan; 
    
    public void setTinhToan(Tinh tinhToan){
        this.tinhToan = tinhToan;
    }
    public float tinh(float a, float b){
        return tinhToan.tinh(a, b);
    }
}
