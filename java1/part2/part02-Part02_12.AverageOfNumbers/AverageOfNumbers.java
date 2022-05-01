
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // The task is to keep track of number ones
        int sum = 0;
        int total = 0;

        // The task is to read an input from the user
        while (true) {
            System.out.println("Give a number: ");
            // The task is to read a user inputted number
            int number = Integer.valueOf(scanner.nextLine());

            // The task is to exit the loop if the user
            // has inputted zero
            if (number == 0) {
                break;
            }

            sum = sum + number;

            total = total + 1;

            // The task is to increase the amount of ones
            // if the user inputs a number one
        }

        // The task is to print out the total of ones
        if (total > 0) {
            double average = (sum * 1.0) / total;
            System.out.println("Average of the numbers: " + average);
        }

    }
}
