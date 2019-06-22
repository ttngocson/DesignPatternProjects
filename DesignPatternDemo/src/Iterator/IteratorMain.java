/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

/**
 *
 * @author transon
 */
public class IteratorMain {

    /**
     * @param iterator
     */
    
    public static void DuyetTapHop(Iterator iterator){
        while (iterator.isDone()==false){
            System.out.println(iterator.Next());
        }
     
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ConcreteAggerate aggerate = new ConcreteAggerate(5);
        Iterator iterator = aggerate.createIterator();
        iterator.First();
        System.out.println(iterator.CurrentItem());
        //DuyetTapHop(iterator);
    }
    
}
