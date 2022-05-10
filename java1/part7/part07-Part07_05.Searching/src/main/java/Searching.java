
import java.util.ArrayList;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book(459284, "name0"));
        books.add(new Book(459293, "name1"));
        books.add(new Book(459382, "name2"));
        books.add(new Book(459481, "name3"));
        books.add(new Book(459579, "name4"));
        books.add(new Book(459678, "name5"));
        books.add(new Book(459777, "name6"));

        //should print 5
        System.out.println("Linear search - should print 5: " + linearSearch(books, 459678));

        System.out.println("BInary search - should print 5: " + binarySearch(books, 459678));

    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {

        for (int i = 0; i < books.size(); i++) {
            int bookId = books.get(i).getId();
            if (bookId == searchedId) {
                return i;
            }
        }

        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {

        int start = 0;
        int end = books.size() - 1;

        while (start <= end) {
            int middle = (end + start) / 2;
            int middleId = books.get(middle).getId();

            if (middleId == searchedId) {
                return middle;
            }

            if (middleId < searchedId) {
                start = middle + 1;
            }

            if (middleId > searchedId) {
                end = middle - 1;
            }

        }

        return -1;
    }
}
