/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MediatorPattern;

import java.util.Hashtable;

/**
 *
 * @author transon
 */
public class Chatroom implements IChatroom{

    private Hashtable participants = new Hashtable();
    
    @Override
    public void Register(Participant participant) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (participants.get(participant.getName()) == null )
            participants.put(participant.getName(), participant);
        participant.setChatroom(this);
    }

    @Override
    public void Send(String from, String to, String message) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Participant pto = (Participant)participants.get(to);
        if (pto != null)
            pto.Receive(from, message);
    }
}
