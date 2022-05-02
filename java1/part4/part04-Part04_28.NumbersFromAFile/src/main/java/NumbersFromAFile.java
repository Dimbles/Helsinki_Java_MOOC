
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        ArrayList<Integer> list = new ArrayList<>();
        
        int count = 0;

        try ( Scanner scanner2 = new Scanner(Paths.get(file))) {

            // we read all the lines of the file
            while (scanner2.hasNextLine()) {
                int value = Integer.valueOf(scanner2.nextLine());
                if (value >= lowerBound && value <= upperBound) {
                    list.add(value);
                    count += 1;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Numbers: " + count);

        System.out.println("");

    }

}
