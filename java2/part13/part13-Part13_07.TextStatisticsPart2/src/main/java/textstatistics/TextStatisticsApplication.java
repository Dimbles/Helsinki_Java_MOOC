package textstatistics;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.util.Arrays;

public class TextStatisticsApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane componentGroup = new BorderPane();
        
        //labels and hbox
        Label lettersLabel = new Label("Letters: 0");
        Label wordsLabel = new Label("Words: 0");
        Label longestLabel = new Label("The longest word is: ");

        HBox hbox = new HBox();
        hbox.setSpacing(20);
        hbox.getChildren().add(lettersLabel);
        hbox.getChildren().add(wordsLabel);
        hbox.getChildren().add(longestLabel);

        componentGroup.setBottom(hbox);

        //TextArea
        TextArea text = new TextArea();
        componentGroup.setCenter(text);

        //text-area properties 
        text.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();

            // set values of labels
            lettersLabel.setText("Letters: " + characters);
            wordsLabel.setText("Words: " + words);
            longestLabel.setText("The longest word is: " + longest);
            
        });

        Scene viewport = new Scene(componentGroup);

        stage.setScene(viewport);
        stage.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
        System.out.println("Hello world!");
    }

}
