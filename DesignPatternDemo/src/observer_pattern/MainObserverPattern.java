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
public class MainObserverPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Observer_client observer = new Observer_client();
        Subject subject = observer.getSubject();
        
        subject.add(2,3);
        
    }
    
}
