/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jakep
 */
import java.util.ArrayList;

public class BirdManager {

    private ArrayList<Bird> birds;

    public BirdManager() {
        this.birds = new ArrayList<>();
    }

    public void addBird(Bird bird) {
        this.birds.add(bird);
    }

    public void addObs(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                bird.addObs();

            }
        }
        System.out.println("Not a bird!");

    }

    public void printAll() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }

    public void printBird(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
            }
        }

    }
}
