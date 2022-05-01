
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int longestLength = 0;
        String longestName = "No name";
        int count = 0;
        int sum = 0;

        while (true) {
            String text = scanner.nextLine();

            if (text.equals("")) {
                break;
            }

            String[] pieces = text.split(",");
            int age = Integer.valueOf(pieces[1]);
            int nameLength = pieces[0].length();
            
            //longest name
            if (nameLength > longestLength) {
                longestName = pieces[0];
                longestLength = nameLength;
            }
            
            sum += age;
            
            count += 1;
        }
        
        //average of ages 
        double averageAge = ((double) sum) / count;

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + averageAge);

    }
}
