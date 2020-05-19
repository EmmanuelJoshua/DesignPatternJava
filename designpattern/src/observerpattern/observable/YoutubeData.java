/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern.observable;

import java.util.Observable;

/**
 *
 * @author Spark
 */
public class YoutubeData extends Observable {

    String newvideo;

    public void newVideoAlert() {
        setChanged();
        notifyObservers();
    }

    //setters for video
    public void setVideo(String newvideo) {
        this.newvideo = newvideo;
        newVideoAlert();
    }

    //getters for video
    public String getVideo() {
        return newvideo;
    }

}
