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
public class MediatorApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Chatroom c = new Chatroom();
        Participant Cow = new BeatleParticipant("Cow");
        Participant Sheep = new BeatleParticipant("Sheep");
        Participant Goat = new BeatleParticipant("Goat");
        Participant Dog = new BeatleParticipant("Dog");
        Participant Cat = new NonBeatleParticipant("Cat");
        Participant Dove = new BeatleParticipant("Dove");
        Participant Turkey = new BeatleParticipant("Turkey");
        Participant Cock = new BeatleParticipant("Cock");
        Participant Chicken = new NonBeatleParticipant("Chicken");
        
        c.Register(Cow);
        c.Register(Sheep);
        c.Register(Goat);
        c.Register(Dog);
        c.Register(Cat);
        c.Register(Dove);
        c.Register(Turkey);
        c.Register(Cock);
        c.Register(Chicken);
        
        Cow.Send("Sheep", "moo moo");
        Sheep.Send("Goat", "beee beee");
        Goat.Send("Dog", "meee meee");
        Dog.Send("Cat", "wow wow");
        Cat.Send("Dove", "miao miao");
        Dove.Send("Turkey", "ruu ruu ruu");
        Turkey.Send("Cock", "glú glú glú");
        Cock.Send("Chicken", "cocorocó");
        Chicken.Send("Cow", "pío pío pío");
    }
    
}
