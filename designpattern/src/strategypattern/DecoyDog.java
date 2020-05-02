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
public class DecoyDog extends Dog{

    public DecoyDog(){
        barkbehavior = new MuteBark();
        runbehavior = new RunNoWay();
    }
    
    @Override
    void display() {
      System.out.println("I'm a Decoy");
    }
    
}
