
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if (id.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            Item item = new Item(id, name);

            if (items.contains(item)) {
                System.out.println("This item is already in the archive. Let's not add the same item again.");
            } else {
                items.add(item);
            }
        }
        
        System.out.println("==Items==");
        for( Item item: items) {
            System.out.println(item);
        }

    }
}
