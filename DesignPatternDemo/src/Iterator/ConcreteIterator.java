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
public class ConcreteIterator implements Iterator{

    ConcreteAggerate aggerate;
    private int index = -1;

    public ConcreteIterator(ConcreteAggerate aggerate) {
        this.aggerate = aggerate;
    }
    
    @Override
    public Object First() {
        index = 0;
        return aggerate.GetItem(index);
    }

    @Override
    public Object Next() {
       // index++;
        if(!isDone())
            return aggerate.GetItem(++index);
        else 
            return null;
    }

    @Override
    public boolean isDone() {
        return index >= aggerate.Count()-1 ? true : false;
    }

    @Override
    public Object CurrentItem() {
        return aggerate.GetItem(index);
    }
    
}
