
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your class here

        System.out.println("=== list1 ===");
        
        List<String> myList1 = new List<>();
        System.out.println(myList1.contains("hello"));
        myList1.add("hello");
        System.out.println(myList1.contains("hello"));
        int index = myList1.indexOfValue("hello");
        System.out.println(index);
        System.out.println(myList1.value(index));
        myList1.remove("hello");
        System.out.println(myList1.contains("hello"));

        System.out.println("=== list2 ===");
        
        List<String> myList2 = new List<>();
        myList2.add("hello");
        myList2.add("world");

        for (int i = 0; i < myList2.size(); i++) {
            System.out.println(myList2.value(i));
        }

    }

}
