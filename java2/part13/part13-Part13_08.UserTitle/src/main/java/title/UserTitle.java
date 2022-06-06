package title;

import java.util.Scanner;
import javafx.application.Application;
import javafx.application.Application.Parameters;
import javafx.stage.Stage;

public class UserTitle extends Application {

    private Scanner scanner = new Scanner(System.in);


    @Override
    public void start(Stage window) {
        
        System.out.println("Please enter a title");
        
        String title = scanner.nextLine();

        window.setTitle(title);
        window.show();
    }

}
