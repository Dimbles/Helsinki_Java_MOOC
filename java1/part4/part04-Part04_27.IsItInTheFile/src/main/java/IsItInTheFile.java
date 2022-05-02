
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;


public class IsItInTheFile {

    public static void main(String[] args) {
        boolean unableToRead = false;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        //reads the file 
        
        ArrayList<String> list = new ArrayList<>();

        try ( Scanner scanner2 = new Scanner(Paths.get(file))) {

            // we read all the lines of the file
            while (scanner2.hasNextLine()) {
                list.add(scanner2.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            unableToRead = true;
        }

        System.out.println("");
        
        //searches for string 
        boolean found = false;
        
        if ( unableToRead == true) {
            System.out.println("Reading the file " + file + " failed.");
        }
        
        for ( String line: list) {
            if ( line.contains(searchedFor)) {
                System.out.println("Found!");
                found = true;
            }
        }
        
        if (found == false) {
            System.out.println("Not found");
        }
    }
}
