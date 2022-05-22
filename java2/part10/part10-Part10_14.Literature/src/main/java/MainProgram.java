
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        UserInterface ui = new UserInterface(books, scanner);

        //ui process which collects userinput and creates books
        ui.start();

        //for testing 
//        Book book1 = new Book("aaaaa", 100);
//        Book book2 = new Book("bbbbb", 10);
//        Book book3 = new Book("ccccc", 10);
//        Book book4 = new Book("aaaab", 10);
//        Book book5 = new Book("ddddd", 5);
//
//        books.add(book1);
//        books.add(book2);
//        books.add(book3);
//        books.add(book4);
//        books.add(book5);
        //printing and sorting the created books
//        System.out.println(books.size() + " books in total.");
//
//        System.out.println("Books:");
//        for (Book book : books) {
//            System.out.println(book);
//        }
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getName);

        Collections.sort(books, comparator);

        System.out.println(books.size() + " books in total.");

        System.out.println(" ");
        System.out.println("Books:");
        for (Book book : books) {
            System.out.println(book);
        }

    }

}
