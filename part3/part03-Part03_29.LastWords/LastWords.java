
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while (loop == true) {
            String text = scanner.nextLine();

            if (text.equals("")) {
                loop = false;
            }

            String[] pieces = text.split(" ");

            System.out.println(pieces[pieces.length - 1]);

        }

    }
}
