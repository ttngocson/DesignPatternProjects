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
public class Observer_client implements Subject.IObserverSubject{
    Subject subject;

    public Observer_client() {
        subject = new Subject();
        subject.setObserver(this);
    }

    public Subject getSubject() {
        return subject;
    }
    
    
    @Override
    public void update(int res){
        System.out.println(res);
    }
}
