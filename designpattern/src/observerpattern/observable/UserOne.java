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
public class UserOne implements Observer, DisplayContent {

    //local string to hold new video name
    String video;

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
        System.out.println("There's a new video available @userone : " + video);
    }
  
}
