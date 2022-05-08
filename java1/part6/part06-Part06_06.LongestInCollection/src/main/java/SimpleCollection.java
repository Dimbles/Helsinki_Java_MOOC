
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest() {
        if (this.elements.isEmpty()) {
            return null;
        }

        //creating string to put first value in 
        String returnString = this.elements.get(0);

        //going through the list
        for (String name : elements) {
            if (returnString.length() < name.length()) {
                returnString = name;
            }
        }

        return returnString;

    }

}
