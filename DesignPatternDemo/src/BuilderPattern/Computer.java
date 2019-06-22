/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPattern;

import java.util.ArrayList;

/**
 *
 * @author transon
 */
public class Computer {
    String cpu, memory, hardisk, monitor;
    ArrayList<String> complements = new ArrayList<>();

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < complements.size(); i++)
            str  = str + complements.get(i) + ", ";
        return "Computer" + 
                    "\n\tcpu: " + cpu + 
                    "\n\tmemory: " + memory + 
                    "\n\thardisk: " + hardisk + 
                    "\n\tmonitor: " + monitor + 
                    "\n\tcomplements: " + str;
    }
    
    public static class Builder{
        Computer computer;

        public Builder() {
            computer = new Computer();
        }
        
        public Builder addCPU(String cpu){
            computer.cpu = cpu;
            return this;
        }
        
        public Builder addMemory(String memory){
            computer.memory = memory;
            return this;
        }
        
        public Builder addHardisk(String hardisk){
            computer.hardisk = hardisk;
            return this;
        }
        
        public Builder addMonitor(String monitor){
            computer.monitor = monitor;
            return this;
        }
        
        public Builder addComplements(String str){
            computer.complements.add(str);
            return this;
        }
        
        public Computer build(){
            return computer;
        }
        
    }
}
