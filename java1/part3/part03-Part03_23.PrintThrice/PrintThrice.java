
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Write your program here
        String name = reader.nextLine();
        int n = 3;
        for (int i = 0; i < n; i++) {
            System.out.print(name);

        }
    }
}
