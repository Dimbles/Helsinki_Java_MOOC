/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jakep
 */

import java.util.Scanner;

public class UserInterface {
    
    private BirdManager birdManager;
    private Scanner scanner;
    
    public UserInterface( BirdManager birdManager, Scanner scanner) {
        this.birdManager = birdManager;
        this.scanner  = scanner;
    }
    
    public void start() {
        
        
        
        while(true) {
            System.out.println("?");
            
            String command = scanner.nextLine();
            
            if(command.equals("Quit")) {
                break;
            }
            
            if(command.equals("Add")) {
                System.out.println("Name:");
                String name = scanner.nextLine();
                System.out.println("Name in latin:");
                String latin = scanner.nextLine();
                Bird newBird = new Bird(name, latin);
                birdManager.addBird(newBird);
        }
            if(command.equals("Observation")) {
                System.out.println("Bird?");
                String name = scanner.nextLine();
                birdManager.addObs(name);
            }
            if(command.equals("All")) {
                birdManager.printAll();
            }
            if(command.equals("One")) {
                System.out.println("Bird?");
                String name = scanner.nextLine();
                birdManager.printBird(name);
            }
        
    }
    
    
}
}
