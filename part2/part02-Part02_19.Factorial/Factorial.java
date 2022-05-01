
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Give a number: ");
        int num = Integer.valueOf(scanner.nextLine());
        int factorial = num;

        for (int i = num - 1; i != 0; i = i - 1) {
            factorial = factorial * i;
        }

        System.out.println("Factorial: " + factorial);
        
        
        
    }
}
