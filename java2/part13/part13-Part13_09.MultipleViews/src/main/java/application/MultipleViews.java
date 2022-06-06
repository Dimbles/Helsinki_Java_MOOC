package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;


public class MultipleViews extends Application {

    @Override
    public void start(Stage window) {

        
        //first scene 
        
        //borderpane 
        BorderPane borderPane = new BorderPane();
        
        Label label1 = new Label("First view!");
        
        Button button1 = new Button("To the second view!");
        
        borderPane.setTop(label1);
        borderPane.setCenter(button1);

        Scene first = new Scene(borderPane);
        
        //second scene 
        
        VBox vBox = new VBox();
        
        Button button2 = new Button("To the third view!"); 
        Label label2 = new Label("Second view!");
        
        vBox.getChildren().addAll(button2, label2);
                
        Scene second = new Scene(vBox);
        
        //third scene 
        
        GridPane gridPane = new GridPane();
        
        Label label3 = new Label("Third view!");
        
        Button button3 = new Button("To the first view!");
        
        gridPane.setConstraints(label3, 0, 0);
        gridPane.setConstraints(button3, 1, 1);
        
        gridPane.getChildren().addAll(label3, button3);
        
        Scene third = new Scene(gridPane);
        
        //actions 

        button1.setOnAction((event) -> {
            window.setScene(second);
        });

        button2.setOnAction((event) -> {
            window.setScene(third);
        });
        
        button3.setOnAction((event) -> {
            window.setScene(first);
        });

        window.setScene(first);
        window.show();
    }

    public static void main(String[] args) {

        launch(MultipleViews.class);
        System.out.println("Hello world!");
    }

}
