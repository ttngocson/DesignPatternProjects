/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Invoker

package CommandPattern;

import java.util.ArrayList;

/**
 *
 * @author transon
 */
public class User {
    private Calculator calculator = new Calculator();
    private ArrayList commands = new ArrayList();
    private int current = 0;
    
    public void Redo(int levels){
        System.out.println("----Redo " + levels + " levels");
        for( int i = 0; i < levels; i++)
            if(current < commands.size() - 1)
                ((Command)commands.get(current++)).Execute();
    }
    
    public void Undo(int levels){
        System.out.println("----Undo " + levels + " levels");
        for( int i = 0; i < levels; i++)
            if(current > 0)
                ((Command)commands.get(--current)).UnExecute();
    }
    
    public void  Compute(char operator, int operand){
        Command command = new CalculatorCommand(operator, operand, calculator);
        command.Execute();
        commands.add(command);
        current++;
    }
}
