
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputs = new ArrayList<>(); // reading inputs

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num < 0) {
                break;
            }

            inputs.add(num);
        }

        inputs.stream()
                .filter(input -> input > 1 && input <= 5)
                .forEach(name -> System.out.println(name));

    }
}
