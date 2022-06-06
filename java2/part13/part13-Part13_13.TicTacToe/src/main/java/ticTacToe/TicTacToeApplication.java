package ticTacToe;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class TicTacToeApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        // 1 creating layout of the UI
        //1.1 borderpane
        BorderPane layout = new BorderPane();

        //1.1.1 components of the broderpane
        //label with game info
        //creating gridpane with 9 buttons for the tic-tac-toes
        GridPane gridPane = new GridPane();

        //configuring gridpane
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        //declaring Player object and TicGridObject and gameInfo label
        Label xLabel = new Label("0");
        Label oLabel = new Label("0");

        Player player = new Player("X", xLabel, oLabel);
        Label gameInfo = new Label("Turn: " + player.getText());
        TicGrid grid = new TicGrid(player, gameInfo);

        //adding buttons to the gridpane 
        for (int x = 0; x <= 2; x++) {
            for (int y = 0; y <= 2; y++) {
                gridPane.add(grid.getSquare()[x][y], x, y);
            }
        }

        //adding borderpane components 
        //adding hbox to put label into
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(10, 10, 10, 10));
        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().addAll(gameInfo);

        //reset button
        Button buttonReset = new Button("Reset");
        buttonReset.setOnAction((event) -> grid.reset());
        buttonReset.setFont(Font.font("Monospaced", 20));
        buttonReset.setMinSize(10, 10);

        //score label
        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(20);
        vbox.setPadding(new Insets(10, 10, 10, 10));
        Label labelScore = new Label("SCORE");
        labelScore.setFont(Font.font("Monospaced", FontWeight.BOLD, 20));
        Label labelX = new Label("X");
        labelX.setFont(Font.font("Monospaced", FontWeight.BOLD, 20));
        Label labelO = new Label("O");
        labelO.setFont(Font.font("Monospaced", FontWeight.BOLD, 20));

        GridPane scoreGrid = new GridPane();
        scoreGrid.setAlignment(Pos.CENTER);
        scoreGrid.setHgap(30);
        scoreGrid.setVgap(10);
        scoreGrid.setPadding(new Insets(10,10,10,10));
        scoreGrid.add(labelX, 0, 0);
        scoreGrid.add(labelO, 1, 0);
        scoreGrid.add(xLabel, 0, 1);
        scoreGrid.add(oLabel, 1, 1);
        
        vbox.getChildren().addAll(buttonReset, labelScore, scoreGrid);
        //putting it all into the borderpane
        layout.setTop(hbox);
        layout.setCenter(gridPane);
        layout.setBottom(vbox);

        //setting the stage 
        Scene view = new Scene(layout, 600, 600);

        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
        System.out.println("Hello world!");
    }

}
