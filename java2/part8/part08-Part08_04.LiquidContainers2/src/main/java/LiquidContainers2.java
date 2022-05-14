
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println(" ");
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            if (parts[0].equals("quit")) {
                break;
            }
            
            if (parts[0].equals("add")) {
                Integer amount = Integer.valueOf(parts[1]);
                first.add(amount);
            }
            
            if (parts[0].equals("remove")) {
                Integer amount = Integer.valueOf(parts[1]);
                second.remove(amount);
            }
            
            if (parts[0].equals("move")) {
                Integer amount = Integer.valueOf(parts[1]);
                if(first.contains() < amount) {
                    amount = first.contains();
                }  
                first.remove(amount);
                second.add(amount);
            }

        }
    }

}
