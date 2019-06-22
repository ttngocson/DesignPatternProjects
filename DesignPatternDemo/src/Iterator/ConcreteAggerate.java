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
public class ConcreteAggerate {
    int[] a;
    int size;

    public ConcreteAggerate(int size) {
        this.size = size;
        a = new int[size];
        for(int i=0; i < size; i++)
            a[i] = i+1;
    }
    public Iterator createIterator(){
        return new ConcreteIterator(this);
    }
    public int Count(){
        return size;
    }
    public int GetItem(int i){
        return a[i];
    }
}
