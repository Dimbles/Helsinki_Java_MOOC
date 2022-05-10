
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();
        

        while (true) {
            System.out.println("> ");
            
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            String[] pieces = input.split(" ");

            if (pieces[0].equals("add")) {
                int amount = Integer.valueOf(pieces[1]);
                first.add(amount);
                
            }

            if (pieces[0].equals("move")) {
                int amount = Integer.valueOf(pieces[1]);
                if( first.contains() < amount) {
                    amount = first.contains();
                }
                first.remove(amount);
                second.add(amount);
                
            }

            if (pieces[0].equals("remove")) {
                int amount = Integer.valueOf(pieces[1]);
                second.remove(amount);
                
            }

            if (pieces[0].equals("quit")) {

                break;
            }

        }


    }

}
