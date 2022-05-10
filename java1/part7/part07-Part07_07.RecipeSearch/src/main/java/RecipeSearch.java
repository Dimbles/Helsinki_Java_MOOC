
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.FileReader;

public class RecipeSearch {

    public static void main(String[] args) {

        //declaring objects
        Scanner scanner = new Scanner(System.in);
        RecipeManager manager = new RecipeManager();
        UserInterface ui = new UserInterface(manager, scanner);
        //reading file and seperating recipes into csv string

        System.out.println("File to read: ");
        String file = scanner.nextLine();

        ArrayList<String> recipes = new ArrayList<String>();
        try ( BufferedReader reader = new BufferedReader(new FileReader(file));) {
            String line = null;
            String tmp = "";

            while ((line = reader.readLine()) != null) {
                if (line.equals("")) {
                    recipes.add(tmp);
                    tmp = "";
                } else {
                    tmp = tmp + line + ",";
                }
            }
            recipes.add(tmp);
            reader.close();

        } catch (Exception e) {
            System.out.println("Reading the file failed.");
        }
//        System.out.println("Recipes size: " + recipes.size() );
//        for( String recipe: recipes) {
//            System.out.println(recipe);
//        }

        //turning the recipes into recipe class
        for (String recipe : recipes) {
            String[] parts = recipe.split(",");
            String name = parts[0];
            Integer time = Integer.valueOf(parts[1]);
            ArrayList<String> ingredients = new ArrayList<>();
            for (int i = 2; i < parts.length; i++) {
                ingredients.add(parts[i]);
            }
            Recipe newRecipe = new Recipe(name, time, ingredients);
            manager.addRecipe(newRecipe);
        }

//        manager.printRecipes();
        ui.start();

    }
}
