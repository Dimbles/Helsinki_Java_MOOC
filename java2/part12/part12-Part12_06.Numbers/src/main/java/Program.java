
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Random ladyLuck = new Random(); // create Random object ladyLuck
        
        System.out.println("How many random numbers should be printed?");
        
        int n = Integer.valueOf(scanner.nextLine());
        
        for (int i = 0; i < n; i++) {
            // Draw and print a random number
            int randomNumber = ladyLuck.nextInt(11); //generating random number between 0-10
            System.out.println(randomNumber);
        }
        
        
    }

}
