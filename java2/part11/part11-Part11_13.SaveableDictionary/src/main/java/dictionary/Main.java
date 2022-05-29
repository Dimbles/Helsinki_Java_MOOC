package dictionary;

public class Main {

    public static void main(String[] args) {
        // You can test your dictionary here

        SaveableDictionary dictionary = new SaveableDictionary("words.txt");

        //load dictionary
        dictionary.load();

        // use the dictionary
        dictionary.add("vert", "green");
        dictionary.add("rouge", "red");
        dictionary.add("mucho", "many");

        //save dictoinary
        dictionary.save();
    }
}
