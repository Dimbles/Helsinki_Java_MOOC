
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

    public String toString() {
        String plural = "";
        if (this.elements.size() > 1) {
            plural = "s";
        }

        String printOutput = "The collection " + this.name + " has " + this.elements.size() + " element" + plural + ":";

        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        // we form a string from the people on the list
        String elementsInCollection = "";
        int count = elements.size();
        String backSpace = "\n";

        for (int i = 0; i < count; i++) {
            if (i == count - 1) {
                backSpace = "";
            }
            elementsInCollection = elementsInCollection + elements.get(i) + backSpace;
        }

        return printOutput + "\n"
                + elementsInCollection;
    }

}
