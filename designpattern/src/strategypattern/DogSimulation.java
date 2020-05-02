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
public class DogSimulation {

    public static void main(String[] args) {

        AlsatianDog alsatian = new AlsatianDog();
        BasenjiDog basenji = new BasenjiDog();
        PuppyDog puppy = new PuppyDog();
        DecoyDog decoy = new DecoyDog();

        System.out.println("Dogs run!");
        System.out.println("---------------------------");
        System.out.print("Alsatian: ");
        alsatian.performRun();
        System.out.print("Basenji: ");
        basenji.performRun();
        System.out.print("Puppy: ");
        puppy.performRun();
        System.out.print("Decoy: ");
        decoy.performRun();
        decoy.setRunBehavior(new RunWithAssist());
        System.out.print("Decoy after getting assistance: ");
        decoy.performRun();

        System.out.println("\nDogs bark!");
        System.out.println("---------------------------");
        System.out.print("Alsatian: ");
        alsatian.performBark();
        System.out.print("Basenji: ");
        basenji.performBark();
        System.out.print("Puppy: ");
        puppy.performBark();
        System.out.print("Decoy: ");
        decoy.performBark();
    }
}
