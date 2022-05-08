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

    private TodoList todo;
    private Scanner scanner;

    public UserInterface(TodoList todo, Scanner scanner) {
        this.todo = todo;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.println("What is the next task to add to the Todo List?");
                String task = scanner.nextLine();
                this.todo.add(task);
            } else if (command.equals("list")) {
                todo.print();
            } else if (command.equals("remove")) {
                System.out.println("What is the task that is to be removed from the Todo List?");
                int task = Integer.valueOf(scanner.nextLine());
                todo.remove(task);
            }

        }

    }

}
