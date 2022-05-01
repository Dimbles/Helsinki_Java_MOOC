
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        //finding smallest number
        int smallest = 9999;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) < smallest) {
                smallest = list.get(i);
            }
        }
        System.out.println("Smallest number: " + smallest);

        //finding index of smallest number
        for (int i = 0; i < size; i++) {
            if (list.get(i) == smallest) {
                System.out.println("Found at index: " + i);

            }

        }
    }
}
