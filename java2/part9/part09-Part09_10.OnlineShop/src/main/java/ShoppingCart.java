/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jakep
 */

import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {
    private Map<String, Item> items;
    
    public ShoppingCart() {
        this.items = new HashMap<>();
    }
    
    public void add(String product, int price) {
        if( items.containsKey(product)) {
            items.get(product).increaseQuantity();
        } else {
        Item item = new Item(product, 1, price);
        this.items.put(product, item);
        }
    }
    
    public int price() {
        int totalPrice = 0;
        
        for( Item item: items.values()) {
            totalPrice+= item.price();
        }
        
        return totalPrice;
        
    }
    
    public void print() {
        
        for( Item item: items.values()) {
            System.out.println(item);
        }
        
    }
    
    
}
