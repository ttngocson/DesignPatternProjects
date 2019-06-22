/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Command

package CommandPattern;

/**
 *
 * @author transon
 */
public abstract class Command {
    abstract public void Execute();
    abstract public void UnExecute();
}
