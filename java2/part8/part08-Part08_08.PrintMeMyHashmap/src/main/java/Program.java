
import java.util.HashMap;
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        // Test your program here!

        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");

    }

    public static void printKeys(HashMap<String, String> hashmap) {

        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {

//        ArrayList<String> validKeys = new ArrayList<>();
        for (String key : hashmap.keySet()) {
            if (!key.contains(text)) {
                continue;
            }
            System.out.println(key);
//            validKeys.add(key);

        }
//        for( String key: validKeys) {
//            System.out.println(key);
//        }

    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {

        for (String key : hashmap.keySet()) {
            String value = hashmap.get(key);

            if (!value.contains(text)) {
                continue;
            }
            System.out.println(value);
        }

    }
}
