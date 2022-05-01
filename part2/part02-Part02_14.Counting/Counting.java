
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int end = Integer.valueOf(scanner.nextLine());

        int start = 0;
        for (int i = start; i < end + 1; i++) {
            System.out.println(i);
        }

    }
}
