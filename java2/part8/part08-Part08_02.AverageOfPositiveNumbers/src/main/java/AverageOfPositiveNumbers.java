
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        int sum = 0;
        int count = 0;
        
        while(true) {
            
            Integer num = Integer.valueOf(scanner.nextLine());
            
            
            
            if( num == 0) {
                if( count == 0 ) {
                    System.out.println("Cannot calculate the average");
                    break;
                } else {
                    double average = (double) sum / count;
                    System.out.println(average);
                    break;
                }
            } else if (num > 0) {
                sum += num;
                count += 1;
            }
            
            
            
        }
        
    }
}
