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

public class Package {

    private ArrayList<Gift> items;

    public Package() {

        this.items = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        this.items.add(gift);
    }

    public int totalWeight() {
        if (items.isEmpty()) {
            return -1;
        }

        int sumOfWeights = 0;
        for (Gift item : items) {
            sumOfWeights += item.getWeight();
        }

        return sumOfWeights;

    }

}
