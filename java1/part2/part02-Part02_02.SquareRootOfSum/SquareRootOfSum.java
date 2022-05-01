
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaring the variables and assigning user input to them
        int num1 = Integer.valueOf(scanner.nextLine());
        int num2 = Integer.valueOf(scanner.nextLine());

        // Identifying the operation and declaring a variable for the result
        int sum = num1 + num2;
        double sqrt = Math.sqrt(sum);

        // Printing the result of the operation
        System.out.println(sqrt);        
        
    }
}
