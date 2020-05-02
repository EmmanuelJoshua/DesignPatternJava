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
public class BasenjiDog extends Dog {

    public BasenjiDog(){
        barkbehavior = new Howl();
        runbehavior = new Run();
    }
    
    @Override
    void display() {
       System.out.println("I'm a Basenji Dog");
    }
    
}
