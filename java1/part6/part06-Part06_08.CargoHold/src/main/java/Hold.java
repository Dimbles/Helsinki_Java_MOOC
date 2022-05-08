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

public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> hold;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.hold = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= maxWeight) {
            this.hold.add(suitcase);
        }

    }

    public int totalWeight() {
        int weight = 0;

        for (Suitcase suitcase : this.hold) {
            weight += suitcase.totalWeight();
        }

        return weight;
    }

    public String toString() {
        int count = this.hold.size();

        if (count == 0) {
            return "No suitcase in the hold";
        } else if (count == 1) {

            return count + " suitcase (" + this.totalWeight() + " kg)";
        } else {

            return count + " suitcases (" + this.totalWeight() + " kg)";
        }
    }

    public void printItems() {
        for (Suitcase suitcase : this.hold) {
            suitcase.printItems();
        }
    }

}
