package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndTextFieldApplication extends Application {

    @Override
    public void start(Stage window) {
        Button buttonComponent = new Button("This is a button");
        Label label = new Label("Name: ");
        TextField textComponent = new TextField();
        HBox hb = new HBox();
        
        //adding text field to hbox
        hb.getChildren().addAll(label, textComponent, buttonComponent);
        hb.setSpacing(10);
        //adding button to flowplane
        Scene view = new Scene(hb);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(ButtonAndTextFieldApplication.class);
    }

}
