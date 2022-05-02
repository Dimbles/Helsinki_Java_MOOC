
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            // Add to the list a new item
            // whose name is the previous user input
            items.add(new Item(name));
        }
        
        for ( Item item: items ) {
            System.out.println(item.toString());
        }

    }
}
