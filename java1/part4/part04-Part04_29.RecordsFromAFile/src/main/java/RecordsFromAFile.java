
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //getting file name
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        //making array and storing string in them
        ArrayList<String> list = new ArrayList<>();
        // implement reading the file here.
        try ( Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                list.add(fileReader.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

        System.out.println("");

        //lopoing through string and splitting at commas
        for (String line : list) {
            String[] parts = line.split(",");
            String name = parts[0];
            int age = Integer.valueOf(parts[1]);

            System.out.println(name + ", " + age + " years");
        }

    }
}
