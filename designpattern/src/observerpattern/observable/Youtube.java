/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern.observable;

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

        youtubeData.addObserver(userOne);
        System.out.println("Registered UserOne.");

        youtubeData.addObserver(userTwo);
        System.out.println("Registered UserTwo.");

        youtubeData.addObserver(userThree);
        System.out.println("Registered UserThree.\n");

        int observers1 = youtubeData.countObservers();
        System.out.println("Number of registered subscribers: " + observers1);

        System.out.println("\nReleasing Video");
        System.out.println("------------------");
        youtubeData.setVideo("Foundations of Flutter!");

        System.out.println("\nUnregistering UserTwo.");
        System.out.println("-------------------------");
        youtubeData.deleteObserver(userTwo);

        int observers2 = youtubeData.countObservers();
        System.out.println("Number of registered subscribers: " + observers2);

        System.out.println("\nReleasing Another Video");
        System.out.println("-------------------------------");
        youtubeData.setVideo("Foundations of Java!");
    }
}
