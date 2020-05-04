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
public interface Observer {
    
    //an update method to be implemented by the Observers parsing a string parameter
    public void update(String videoname);
}
