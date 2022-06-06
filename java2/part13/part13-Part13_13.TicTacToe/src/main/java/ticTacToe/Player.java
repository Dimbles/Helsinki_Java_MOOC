package ticTacToe;

import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class Player {

    private String text;
    private int turn;
    private int xScore;
    private int oScore;
    private Label xLabel;
    private Label oLabel;

    public Player(String text, Label xLabel, Label oLabel) {
        this.text = text;
        this.turn = 0;
        this.xScore = 0;
        this.oScore = 0;

        this.xLabel = xLabel;
        xLabel.setFont(Font.font("Monospaced", 20));
        
        this.oLabel = oLabel;
        oLabel.setFont(Font.font("Monospaced", 20));

    }

    public String getText() {
        return this.text;
    }

    public void setText(String newText) {
        this.text = newText;
    }

    public int getTurn() {
        return this.turn;
    }

    public void incTurn() {

        if (turn % 2 == 0) {
            this.setText("O");
        } else {
            this.setText("X");
        }

        this.turn += 1;

    }

    public void setTurn(int num) {
        this.turn = num;
    }
    
    public int getXScore() {
        return this.xScore;
    }
    
    public int getOScore() {
        return this.oScore;
    }

    public void incXScore() {
        this.xScore += 1;
    }

    public void incOScore() {
        this.oScore += 1;
    }
    
    public void setXLabel(String text) {
        this.xLabel.setText(text);
    }
    
    public void setOLabel(String text) {
        this.oLabel.setText(text);
    }

}
