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

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dict;

    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }

    public void start() {

        while (true) {

            System.out.println("Please give me a command:");

            String command = scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                System.out.println("Give me a word:");
                String word = scanner.nextLine();
                System.out.println("Give me a translation of that word:");
                String translation = scanner.nextLine();
                dict.add(word, translation);
            } else if (command.equals("search")) {
                System.out.println("Give a word to search:");
                String search = scanner.nextLine();
                String translation = dict.translate(search);
                if (translation == null) {
                    System.out.println("Word " + search + " was not found");
                } else {
                    System.out.println(translation);
                }
            } else {
                System.out.println("Unknown command");
            }
        }

    }

}
