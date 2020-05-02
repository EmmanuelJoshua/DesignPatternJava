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
public abstract class Dog {

    BarkBehavior barkbehavior;
    RunBehavior runbehavior;
    
    public Dog() {

    }
    
    public void setBarkBehavior(BarkBehavior bb){
        barkbehavior = bb;
    }
    
    public void setRunBehavior(RunBehavior rb){
        runbehavior = rb;
    }
    
    abstract void display();
    
    public void performBark(){
        barkbehavior.bark();
    }
    
    public void performRun(){
        runbehavior.run();
    }
    
}
