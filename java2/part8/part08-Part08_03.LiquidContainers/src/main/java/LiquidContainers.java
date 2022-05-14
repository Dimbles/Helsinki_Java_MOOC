
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int one = 0;
        int two = 0;

        //printLiquid(one, two);
        while (true) {

            System.out.println(" ");
            System.out.println("First: " + one + "/100");
            System.out.println("Second: " + two + "/100");

            String input = scan.nextLine();

            String[] parts = input.split(" ");

            if (parts[0].equals("quit")) {
                break;
            }

            if (Integer.valueOf(parts[1]) >= 0) {

                if (parts[0].equals("add")) {
                    Integer amount = Integer.valueOf(parts[1]);
                    one += amount;
                    if (one > 100) {
                        one = 100;
                    }
                }

                if (parts[0].equals("move")) {
                    Integer amount = Integer.valueOf(parts[1]);
                    int newOne = one - amount;
                    if (newOne < 0) {
                        amount = one;
                        newOne = 0;
                    }
                    two += amount;
                    one = newOne;
                    if (two > 100) {
                        two = 100;
                    }
                }

                if (parts[0].equals("remove")) {
                    Integer amount = Integer.valueOf(parts[1]);
                    two -= amount;
                    if (two < 0) {
                        two = 0;
                    }
                }
            }
        }

    }



}
