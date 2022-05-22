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
import java.util.Scanner;

public class UserInterface {
    private ArrayList<Book> books;
    private Scanner scanner;
    
    public UserInterface( ArrayList<Book> books, Scanner scanner) {
        this.books = books;
        this.scanner = scanner;
    }
    
    public void start() {
        
        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String name = scanner.nextLine();
            if(name.equals("")) {
                break;
            }
            System.out.println("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());
            
            Book book = new Book(name, age);
            books.add(book);
            
        }
        
        
        
//        System.out.println(books.size() + " books in total.");
//        
//        System.out.println("Books:");
//        for( Book book: books) {
//            System.out.println(book);
//        }
        
        
        
        
    }
}
