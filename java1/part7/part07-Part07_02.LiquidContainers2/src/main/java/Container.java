/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jakep
 */
public class Container {
    
    private int amount;
    private int maxCapacity;
    
    public Container() {
        this.amount = 0;
        this.maxCapacity = 100;
    }
    
    public int contains() {
        return this.amount;
    }
    
    public void add( int amount ) {
        if( amount > 0) {
           this.amount += amount; 
        }
        
        if (this.amount > maxCapacity) {
            this.amount = maxCapacity;
        }
        
    }
    
    public void remove( int amount ) {
        if( amount > 0) {
            this.amount -= amount;
        }
        
        if (this.amount < 0) {
            this.amount = 0;
        }
    }
    
    public String toString() {
        return this.amount + "/100";
    }
     
}
