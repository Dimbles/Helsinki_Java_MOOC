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

public class Herd implements Movable{
    private ArrayList<Movable> herd;
    
    public Herd() {
        this.herd = new ArrayList<>();
    }
    
    public String toString() {
        String print = "";
        for( Movable movable: herd) {
            print += movable + "\n";
        }
        return print;
    }
    
    public void addToHerd(Movable movable) {
        herd.add(movable);
    }
    
    public void move(int dx, int dy) {
        for( Movable movable: herd) {
            movable.move(dx, dy);
        }
    }
    
}
