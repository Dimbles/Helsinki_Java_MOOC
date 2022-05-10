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

public class RecipeManager {

    private ArrayList<Recipe> recipes;

    public RecipeManager() {
        this.recipes = new ArrayList<>();
    }
    
    public void addRecipe( Recipe recipe) {
        this.recipes.add(recipe);
    }

//    public void addRecipe(String name, Integer time, ArrayList<String> ingredients) {
//        Recipe recipe = new Recipe(name, time, ingredients);
//        this.recipes.add(recipe);
//    }

    public void printRecipes() {
        System.out.println("Recipes: ");
        //System.out.println("Number of recipes: " + recipes.size());
        for (Recipe recipe : recipes) {
            System.out.println(recipe.getName() + ", cooking time: " + recipe.getTime());

        }
    }

    public void printName(String word) {

        System.out.println("Recipes: ");
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(word)) {
                System.out.println(recipe.getName() + ", cooking time: " + recipe.getTime());
            }
        }
    }

    public void printTime(Integer time) {
        System.out.println("Recipes: ");
        for (Recipe recipe : recipes) {
            if (recipe.getTime() <= time) {
                System.out.println(recipe.getName() + ", cooking time: " + recipe.getTime());
            }
        }
    }

    public void printIngredient(String word) {

        System.out.println("Recipes: ");
        for (Recipe recipe : recipes) {
            if( recipe.containsIngredient(word)) {
                System.out.println(recipe.getName() + ", cooking time: " + recipe.getTime());
            }
        }
    }

}
