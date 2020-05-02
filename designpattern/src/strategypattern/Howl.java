/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;

/**
 *
 * @author Spark
 */
public class Howl implements BarkBehavior {

    @Override
    public void bark() {
        System.out.println("Hoowl! Hoooowl!");
    }
    
}
