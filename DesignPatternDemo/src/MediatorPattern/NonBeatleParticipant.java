/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MediatorPattern;

/**
 *
 * @author transon
 */
// ConcreteColleague2
public class NonBeatleParticipant extends Participant{

    public NonBeatleParticipant(String name) {
        super(name);
    }

    @Override
    public void Receive(String from, String message) {
        System.out.print("To an Non-Beatle: ");
        super.Receive(from, message); //To change body of generated methods, choose Tools | Templates.
    }
    
}
