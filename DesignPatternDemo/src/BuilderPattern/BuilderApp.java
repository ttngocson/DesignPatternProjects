/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPattern;

/**
 *
 * @author transon
 */
public class BuilderApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computer computer = new Computer.Builder().addCPU("Core i9 8900HQ")
                .addMemory("GSkill 32GB DDR4 bus 3200")
                .addHardisk("SSD Samsung Evo 990 pro")
                .addMonitor("Samsung Monitor 24 inches 4K")
                .addComplements("Chuột cống")
                .addComplements("Bàn phím gỗ")
                .addComplements("GPU 1080ti NVIDIA")
                .build();
        System.out.println(computer.toString());
    }
    
}
