
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        String input = "13\n" + "24\n" + "76\n" + "475\n" + "865\n" + "34\n"
                 + "57\n" + "35\n" + "-1\n";
        
        PointsManager pointsManager = new PointsManager();
        Scanner scanner = new Scanner(System.in);
        Grades grades = new Grades(6);
        UserInterface ui = new UserInterface(pointsManager, scanner, grades);
        
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
        ui.start();
        
    }
}
