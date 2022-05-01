
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = reader.nextLine();
        System.out.println("Enter password: ");
        String password = reader.nextLine();

        String name1 = "alex";
        String name2 = "emma";
        String password1 = "sunshine";
        String password2 = "haskell";

        if ((username.equals(name1) && password.equals(password1)) || (username.equals(name2) && password.equals(password2))) {
            System.out.println("You have succesfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
