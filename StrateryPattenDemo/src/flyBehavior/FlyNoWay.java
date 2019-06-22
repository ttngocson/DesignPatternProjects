/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyBehavior;

/**
 *
 * @author transon
 */
public class FlyNoWay implements IFlyBehavior{
    @Override
    public String fly(){
        return "I can't fly";
    }
}
