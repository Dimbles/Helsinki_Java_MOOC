
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {

        // Write your program here 
        Scanner reader = new Scanner(System.in);

        System.out.println("Password?");
        String first = reader.nextLine();
        String password = "Caput Draconis";

        if (first.equals(password)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }

    }
}
