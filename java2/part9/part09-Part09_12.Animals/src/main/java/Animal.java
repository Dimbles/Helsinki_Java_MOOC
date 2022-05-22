/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jakep
 */
public abstract class Animal {
    public String name;
    
//    private Animal() {
//        
//    }
    
    public Animal(String name ) {
       this.name = name;
    }
    
    public void sleep() {
        System.out.println(name + " sleeps");
    }
    public void eat() {
        System.out.println(name + " eats");
    }
    public String getName() {
        return this.name;
    }
    
    
    
}
