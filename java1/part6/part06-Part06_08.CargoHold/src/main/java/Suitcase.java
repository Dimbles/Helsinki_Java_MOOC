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

public class Suitcase {

    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();

    }

    public void addItem(Item item) {
        if (item.getWeight() + this.totalWeight() > this.maxWeight) {

        } else {
            this.items.add(item);
        }

    }

    public String toString() {
        int count = this.items.size();
        if (count == 0) {
            return "no items (0 kg)";
        } else if (count == 1) {
            return count + " item (" + this.totalWeight() + " kg)";
        } else {
            return count + " items (" + this.totalWeight() + " kg)";
        }
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Item item : items) {
            totalWeight += item.getWeight();
        }

        return totalWeight;
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }

        Item toBeReturned = this.items.get(0);
        for (Item item : this.items) {
            if (item.getWeight() > toBeReturned.getWeight()) {
                toBeReturned = item;
            }
        }

        return toBeReturned;
    }

}
