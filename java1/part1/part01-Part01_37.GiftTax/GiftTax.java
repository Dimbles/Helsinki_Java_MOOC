
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scan.nextLine());
        double tax = 0;
        int taxLower = 0;
        double percent = 0;
        int lowerBound = 0;

        if (value < 5000) {
            System.out.println("No tax!");
        } else if (value < 25000) {
            taxLower = 100;
            percent = 0.08;
            lowerBound = 5000;
            tax = taxLower + ((value - lowerBound) * percent);
            System.out.println("Tax: " + tax);
        } else if (value < 55000) {
            taxLower = 1700;
            percent = 0.1;
            lowerBound = 25000;
            tax = taxLower + ((value - lowerBound) * percent);
            System.out.println("Tax: " + tax);
        } else if (value < 200000) {
            taxLower = 4700;
            percent = 0.12;
            lowerBound = 55000;
            tax = taxLower + ((value - lowerBound) * percent);
            System.out.println("Tax: " + tax);
        } else if (value < 1000000) {
            taxLower = 22100;
            percent = 0.15;
            lowerBound = 200000;
            tax = taxLower + ((value - lowerBound) * percent);
            System.out.println("Tax: " + tax);
        } else if (value > 1000000) {
            taxLower = 142100;
            percent = 0.17;
            lowerBound = 1000000;
            tax = taxLower + ((value - lowerBound) * percent);
            System.out.println("Tax: " + tax);
        }
    }
}
