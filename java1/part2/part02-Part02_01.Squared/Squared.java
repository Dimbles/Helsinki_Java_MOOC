
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaring the variables and assigning user input to them
        int num = Integer.valueOf(scanner.nextLine());

        // Identifying the operation and declaring a variable for the result
        int square = num * num;

        // Printing the result of the operation
        System.out.println(square);
        
    }
}
