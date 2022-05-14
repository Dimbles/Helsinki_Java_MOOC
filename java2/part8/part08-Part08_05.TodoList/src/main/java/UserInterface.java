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
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface( TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    
    public void start() {
        
        while(true) {
         
            System.out.println("Command: ");
            String command = scanner.nextLine();
            
            if( command.equals("add")) {
                System.out.println("To add:");
                String add = scanner.nextLine();
                list.add(add);
                
            }
            
            if( command.equals("list")) {
                list.print();
            }
            
            if( command.equals("remove")) {
                System.out.println("Which one is removed?"); 
                Integer remove = Integer.valueOf(scanner.nextLine());
                list.remove(remove);
                
            }
            if( command.equals("stop")) {
                break;
            }
            
            
            
            
        }
        
        
    }
    

    
    
    
}
