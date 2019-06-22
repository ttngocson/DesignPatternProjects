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
// Mediator
public interface IChatroom {
    void Register(Participant participant);
    void Send(String from, String to, String message);
}
