/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jakep
 */
public class Bot extends Player{
    
    public Bot() {
        
    }
    
    public void play() {
        System.out.println("I'm a robot");
    }
    
    public void addMove( String move) {
        System.out.println(move);
    }
    
}
