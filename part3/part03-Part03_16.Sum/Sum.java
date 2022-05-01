
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(56);
        numbers.add(78);
        numbers.add(34);
        numbers.add(67);
        numbers.add(2);

        System.out.println("Sum: " + sum(numbers));
    }

    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

}
