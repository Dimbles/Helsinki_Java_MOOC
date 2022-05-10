/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jakep
 */
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;


public class UserInterface {

    private RecipeManager recipeManager;
    private Scanner scanner;

    public UserInterface(RecipeManager recipeManager, Scanner scanner) {
        this.recipeManager = recipeManager;
        this.scanner = scanner;
    }

    public void start() {
        
        System.out.println("Commands: ");
        System.out.println("list - list the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("");
        System.out.println("Enter command: ");
        
        while (true) {
                String command = scanner.nextLine();
                if (command.equals("stop")) {
                    break;
                }
                if (command.equals("list")) {
                    this.recipeManager.printRecipes();
                    System.out.println("Enter command: ");
                }
                if (command.equals("find name")) {
                    System.out.println("Searched word: ");
                    String word = scanner.nextLine();
                    this.recipeManager.printName(word);
                    System.out.println("Enter command: ");
                }
                if (command.equals("find cooking time")) {
                    System.out.println("Max cooking time: ");
                    Integer timeSearch = Integer.valueOf(scanner.nextLine());
                    this.recipeManager.printTime(timeSearch);
                    System.out.println("Enter command: ");
                }
                if (command.equals("find ingredient")) {
                    System.out.println("Ingredient: ");
                    String ingredient = scanner.nextLine();
                    this.recipeManager.printIngredient(ingredient);
                    System.out.println("Enter command: ");
                }
            }
    }
    
}
