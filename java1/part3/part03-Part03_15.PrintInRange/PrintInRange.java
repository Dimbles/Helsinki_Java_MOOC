
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(56);
        numbers.add(78);
        numbers.add(34);
        numbers.add(67);
        numbers.add(2);
        
        System.out.println("The numbers in the range [0, 10]");
        printNumbersInRange( numbers, 0, 10);

    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int number : numbers) {
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
    }

}
