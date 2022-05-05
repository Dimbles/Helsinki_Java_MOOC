/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jakep
 */
public class Fitbyte {
    private int age;
    private int rest;
    
    public Fitbyte( int age, int rest) {
        this.age = age;
        this.rest = rest;
    }
    
    public double maximum() {
        return (206.3 - ( (double) 0.711 * this.age));
    }
    
    public double targetHeartRate( double percentageOfMaximum ) {
        return (this.maximum() - this.rest) * (percentageOfMaximum) + this.rest;
    }
    
}
