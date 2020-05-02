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
public class RunWithAssist implements RunBehavior{

    @Override
    public void run() {
       System.out.println("I'm now running with support!");
    }
    
}
