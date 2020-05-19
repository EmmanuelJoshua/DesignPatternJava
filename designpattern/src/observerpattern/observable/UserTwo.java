/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern.observable;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Spark
 */
public class UserTwo implements Observer, DisplayContent {

    String video;
    //local string to hold new video name

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof YoutubeData) {
            YoutubeData youtubeData = (YoutubeData) o;
            String newvideo = youtubeData.getVideo();
            video = newvideo;
            display();
        }
    }

    //method overriden from displaycontent interface to display video
    @Override
    public void display() {
        System.out.println("There's a new video available @usertwo : " + video);
    }

}
