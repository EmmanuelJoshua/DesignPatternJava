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
public class AlsatianDog extends Dog {

    public AlsatianDog(){
        barkbehavior = new Bark();
        runbehavior = new Run();
    }
    
    @Override
    void display() {
      System.out.println("I'm an Alsatian");
    }
    
}
