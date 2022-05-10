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
import java.io.File;


public class FileReader {
    private Scanner scanner;
    private ArrayList<String> lines;
    
    public FileReader( Scanner scanner) {
        this.scanner = scanner;
        this.lines = new ArrayList<>();
    }
    
    public void readFile() {
        System.out.println("File to read: ");

        String file = scanner.nextLine();
        //reading data from file 
        try ( Scanner scanner2 = new Scanner(Paths.get(file));) {
           
            while (scanner2.hasNextLine()) {
                
                String line = scanner2.nextLine();
                
                lines.add(line);
                
            }
        } catch (Exception e) {
            System.out.println("Reading the file failed.");
        }
    
    
}
    
//    public RecipeManager convertToRecipes( ArrayList<String> lines) {
//        while( lines.size() > 0) {
//            String name = lines.get(0);
//            Integer time = Integer.valueOf(lines.get(1));
//            
//        }
//    }
    
}
