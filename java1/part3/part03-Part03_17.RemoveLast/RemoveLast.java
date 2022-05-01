
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> names = new ArrayList<>();
        names.add("ana");
        names.add("anne");
        names.add("charlie");
        names.add("nobody");
        names.add("olly");
        names.add("toby");

        removeLast( names );
        System.out.println(names.get(names.size() - 1));
    }

    public static void removeLast(ArrayList<String> strings) {

        //if array is empty, do nothing
        if (strings.size() == 0) {
            return;
        }

        //removing last 
        int size = strings.size();
        strings.remove(size - 1);
    }

}
