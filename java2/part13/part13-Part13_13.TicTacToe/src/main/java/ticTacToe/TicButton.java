package ticTacToe;

import javafx.scene.control.Button;
import javafx.scene.text.Font;

public class TicButton extends Button {

    private Player player;
    private TicGrid grid;

    public TicButton( Player player, TicGrid grid) {
        super();
        this.player = player;
        this.grid = grid;

        this.setFont(Font.font("Monospaced", 40));
        this.setMinSize(100, 100);
        
        this.setOnAction((event) -> {
            if (this.getText().equals("")) {
                this.setText(player.getText());
                
                player.incTurn();
                grid.changeLabel("Turn: " + player.getText());
                if( player.getTurn() >= 9) {
                    grid.changeLabel("The end!");
                }
                grid.hasWon();
            }
        });

    }

}
