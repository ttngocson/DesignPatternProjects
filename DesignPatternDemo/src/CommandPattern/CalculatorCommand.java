/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandPattern;

/**
 *
 * @author transon
 */
public class CalculatorCommand extends Command{

    char operator;
    int operand;
    Calculator calculator;

    public CalculatorCommand(char operator, int operand, Calculator calculator) {
        this.operator = operator;
        this.operand = operand;
        this.calculator = calculator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public void setOperand(int operand) {
        this.operand = operand;
    }
    
    private char Undo(char operator){
        char undo = ' ';
        switch(operator){
            case '+':
                undo = '-';
                break;
            case '-':
                undo = '+';
                break;
            case '*':
                undo = '/';
                break;
            case '/':
                undo = '*';
                break;
        }
        return undo;
    }
    
    @Override
    public void Execute() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        calculator.Operation(operator, operand);
    }

    @Override
    public void UnExecute() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        calculator.Operation(Undo(operator), operand);
    }
    
}
