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

public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight( int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    
    public double getBoxWeight() {
        int weight = 0;
        for( Item item: items) {
            weight += item.getWeight();
        }
        return weight;
    }
    
    @Override
    public void add(Item item) {
        
        if( (item.getWeight() + this.getBoxWeight() <= this.capacity)) {
            items.add(item);
        }
    }
    
    @Override
    public boolean isInBox(Item item) {
        if(items.contains(item)) {
            return true;
        } else {
            return false;
        }
    }
}
