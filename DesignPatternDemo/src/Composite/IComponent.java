/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author transon
 */
public interface IComponent {
    void Add(IComponent c);
    void Remove(IComponent c);
    void Display(int depth);
}
