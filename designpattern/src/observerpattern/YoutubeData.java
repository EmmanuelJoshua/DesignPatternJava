/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import java.util.ArrayList;

/**
 *
 * @author Spark
 */
public class YoutubeData implements Subject {

    //an arraylist holding the observers/subscribers
    ArrayList<Observer> observers;
    
    //local string to hold new video name
    String newvideo;

    //class constructor to initialise the observers arraylist
    public YoutubeData() {
        observers = new ArrayList<>();
    }

    //method overriden from subject interface to register subscribers
    @Override
    public void registerSubscriber(Observer o) {
        observers.add(o);
    }

    //method overriden from subject interface to remove subscribers
    @Override
    public void removeSubscriber(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(o);
        }
    }

    //method overriden from subject interface to notify subscribers of new data
    @Override
    public void notifySubscriber() {
        //iterate through observers arraylist
        for (int i = 0; i < observers.size(); i++) {
            //update observers with new video
            Observer observer = (Observer) observers.get(i);
            observer.update(newvideo);
        }
    }

    public void newVideoAlert() {
        notifySubscriber();
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
