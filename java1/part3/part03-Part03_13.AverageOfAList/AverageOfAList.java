
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");
        
        //calculates the average 
        
        int size = list.size();
        int total = size;
        //sum starting at 1 to balance the -1 at the end of the list
        int sum = 0;
        
        for ( int number: list) {
            sum += number;
        }
        
        double average = ((double) sum )/ total;
        
        System.out.println("Average: " + average);
        
    }
}
