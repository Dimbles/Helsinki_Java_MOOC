
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        int tally = 0;

        double mean = 0;

        int even = 0;
        int odd = 0;

        System.out.println("Give numbers:");

        while (true) {
            //read input
            int num = Integer.valueOf(scanner.nextLine());

            //break loop
            if (num == -1) {
                break;
            }

            //check for invalid input
            //handle valid input
            sum += num;

            tally += 1;

            //check for even numbers
            if (num % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }

        }

        mean = (sum * 1.0) / tally;

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + tally);
        System.out.println("Average: " + mean);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}
