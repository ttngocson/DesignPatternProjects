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
// AbstractColleguage
public class Participant {
    private Chatroom chatroom;
    private String name;

    public Participant(String name) {
        this.name = name;
    }

    public Chatroom getChatroom() {
        return chatroom;
    }

    public void setChatroom(Chatroom chatroom) {
        this.chatroom = chatroom;
    }

    public String getName() {
        return name;
    }
    
    public void Send(String to, String message){
        chatroom.Send(name, to, message);
    }
    
    public void Receive(String from, String message){
        System.out.println(from + " " + this.name + " " + message);
    }
}
