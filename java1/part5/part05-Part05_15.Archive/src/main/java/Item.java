/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jakep
 */
public class Item {
    private String id;
    private String name;
    
    public Item( String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
 
    @Override
    public String toString() {
        return this.id + ": " + this.name;
    }
 
    public boolean equals(Object comparison) {
        
        // if the variables share the same address, they are equal
        if (this == comparison) {
            return true;
        }
 
        // if the compared object is not of type Book, the objects are not equal
        if (!(comparison instanceof Item)) {
            return false;
        }
 
        // cast the Object type comparison object
        // into a Book type comparisonBook object
        Item comparisonItem = (Item) comparison;
 
        return this.id.equals(comparisonItem.id);
    }
}
