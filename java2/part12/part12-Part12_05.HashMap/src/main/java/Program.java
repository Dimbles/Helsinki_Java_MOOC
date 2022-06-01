
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // You can test the class here

        HashMap<String, Integer> map = new HashMap<>();

        map.add("Jake", 25);
        map.add("ana", 23);
        map.add("neelix", 22);
        map.add("gabby", 23);
        map.add("josh", 25);
        map.add("michael", 30);

        System.out.println(map.remove("michael"));

        System.out.println(map.remove("ana"));

    }

}
