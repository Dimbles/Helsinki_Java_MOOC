
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("");

        // implement finding the greatest number in the list here
        int greatest = 0;
        int size = list.size();
        for ( int i = 0; i < size ; i ++) {
            if ( list.get(i) > greatest) {
                greatest = list.get(i);
            }
        }
        System.out.println("The greatet number: " + greatest);
    }
}
