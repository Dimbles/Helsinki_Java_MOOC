package ticTacToe;

import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class TicGrid {

    private TicButton[][] square;
    private Player player;
    private Label label;

    public TicGrid(Player player, Label label) {

        this.label = label;
        label.setFont(Font.font("Monospaced", 20));

        this.player = player;

        this.square = new TicButton[3][3];

        //adding buttons to the grid 
        for (int x = 0; x <= 2; x++) {
            for (int y = 0; y <= 2; y++) {
                square[x][y] = new TicButton(player, this);
            }
        }

    }

    //returning stored multi-dimensional array
    public TicButton[][] getSquare() {
        return this.square;
    }

    //methods to check if anybody has won 
    public boolean hasWon() {
        if (checkRows("X") || checkColumns("X") || checkDiagonals("X")) {
            this.label.setText("Player X is the winner! The end!");
            player.incXScore();
            player.setXLabel(("" + player.getXScore()));
            return true;
        } else if (checkRows("O") || checkColumns("O") || checkDiagonals("O")) {
            this.label.setText("Player O is the winner! The end!");
            player.incOScore();
            player.setOLabel(("" + player.getOScore()));
            return true;
        } else {
            return false;
        }
    }

    public boolean checkRows(String symbol) {
        for (int y = 0; y <= 2; y++) {
            if (square[0][y].getText().equals(symbol) && square[1][y].getText().equals(symbol) && square[2][y].getText().equals(symbol)) {
                return true;
            }
        }

        return false;

    }

    public boolean checkColumns(String symbol) {
        for (int x = 0; x <= 2; x++) {
            if (square[x][0].getText().equals(symbol) && square[x][1].getText().equals(symbol) && square[x][2].getText().equals(symbol)) {
                return true;
            }
        }

        return false;

    }

    public boolean checkDiagonals(String symbol) {

        if (square[0][0].getText().equals(symbol) && square[1][1].getText().equals(symbol) && square[2][2].getText().equals(symbol)) {
            return true;
        } else if (square[0][2].getText().equals(symbol) && square[1][1].getText().equals(symbol) && square[2][0].getText().equals(symbol)) {
            return true;
        } else {
            return false;
        }

    }

    //changing label 
    public void changeLabel(String text) {
        this.label.setText(text);
    }
    
    //resetting the grid 
    public void reset() {
        //resetting buttons to empty
        for (int x = 0; x <= 2; x++) {
            for (int y = 0; y <= 2; y++) {
                square[x][y].setText("");
            }
        }
        
        //resetting player count to 0
        player.setTurn(0);
        player.setText("X");
        
        //resetting label 
        this.label.setText("Turn: " + player.getText());
        
    }

}
