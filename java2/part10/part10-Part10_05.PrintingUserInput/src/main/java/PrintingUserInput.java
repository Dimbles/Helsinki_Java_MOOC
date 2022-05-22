
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>(); // reading inputs

        while (true) {
            String row = scanner.nextLine();
            if (row.equals("")) {
                break;
            }

            inputs.add(row);
        }

        String combined = inputs.stream()
                .reduce("", (previousString, word) -> previousString + word + "\n");
        System.out.println(combined);

    }
}
