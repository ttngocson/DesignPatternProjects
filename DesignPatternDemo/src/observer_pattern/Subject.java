/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer_pattern;

/**
 *
 * @author transon
 */
public class Subject {
    IObserverSubject observer;

    public void setObserver(IObserverSubject observer) {
        this.observer = observer;
    }
    
    public void add(int a, int b){
        observer.update(a+b);
    }
    
    public interface IObserverSubject{
        void update(int res);
    }
}
