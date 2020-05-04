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
public class Youtube {

    public static void main(String[] args) {
        YoutubeData youtubeData = new YoutubeData();

        UserOne userOne = new UserOne();

        UserTwo userTwo = new UserTwo();

        UserThree userThree = new UserThree();

        System.out.println("Registering all subscribers");
        System.out.println("-------------------------------");

        youtubeData.registerSubscriber(userOne);
        System.out.println("Registered UserOne.");

        youtubeData.registerSubscriber(userTwo);
        System.out.println("Registered UserTwo.");

        youtubeData.registerSubscriber(userThree);
        System.out.println("Registered UserThree.\n");

        System.out.println("Releasing Video");
        System.out.println("------------------");
        youtubeData.setVideo("Foundations of Flutter!");
        
        System.out.println("\nUnregistering UserTwo.");
        System.out.println("-------------------------");
        youtubeData.removeSubscriber(userTwo);
        
         System.out.println("\nReleasing Another Video");
        System.out.println("-------------------------------");
        youtubeData.setVideo("Foundations of Java!");
    }
}
