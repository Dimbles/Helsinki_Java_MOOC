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

public class Recipe {
    private String name;
    private Integer time;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, Integer time, ArrayList<String> ingredients) {
        this.name = name;
        this.time = time;
        this.ingredients = ingredients;
    }
    
    public void setName(String word) {
        this.name = word;
    }
    
    public void setTime(Integer time) {
        this.time = time;
    }
    
    public void addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
    }
    
    public String getName() {
        return this.name;
    }
    
    public Integer getTime() {
        return this.time;
    }
    
    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }
    
    public boolean containsIngredient( String ingredient) {
        for ( String ing: ingredients) {
            if( ing.equals(ingredient)) {
                return true;
        }
            
    }
        return false;
    }
}
    
    

