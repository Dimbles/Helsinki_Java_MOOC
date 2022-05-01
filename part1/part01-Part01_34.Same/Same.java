
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {

        // Write your program here 
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String first = reader.nextLine();
        System.out.println("Enter the second string:");
        String second = reader.nextLine();

        if (first.equals(second)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

    }
}
