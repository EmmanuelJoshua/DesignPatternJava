/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

/**
 *
 * @author Spark
 */
public interface Subject {
    
    //register subscriber method parsing a parameter of Observer
    public void registerSubscriber(Observer o);
    
     //remove subscriber method parsing a parameter of Observer
    public void removeSubscriber(Observer o);
    
     //notify subcriber method
    public void notifySubscriber();
}
