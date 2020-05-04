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
public class UserTwo implements Observer, DisplayContent {

    //local string to hold new video name
    String video;

    //method overriden from observer interface to update new data
    @Override
    public void update(String newvideo) {
        this.video = newvideo;
        display();
    }

    //method overriden from displaycontent interface to display video
    @Override
    public void display() {
        System.out.println("There's a new video available @usertwo : " + video);
    }
}
