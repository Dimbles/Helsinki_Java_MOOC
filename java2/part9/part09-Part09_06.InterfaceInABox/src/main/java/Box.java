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

public class Box implements Packable{
    private double maxCapacity;
    private ArrayList<Packable> contents;
    
    public Box( double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.contents = new ArrayList<>();
    }
    
    public void add( Packable item) {
        if( item.weight() + this.weight() <= maxCapacity) {
            contents.add(item);
        }
        
    }
    
    public double weight() {
        double weightVal = 0;
        for( Packable item: contents) {
            weightVal += item.weight();
        }
        return weightVal;
    }
    
    @Override
    
//    public String toString() {
//        String print = "";
//        for(Packable item: contents) {
//            print += item.toString();
//        }
//        return print;
//    }
    
      public String toString() {
          return "Box: " + contents.size() + " items, " + "total weight " + this.weight() + " kg";
      }
    
    
}
