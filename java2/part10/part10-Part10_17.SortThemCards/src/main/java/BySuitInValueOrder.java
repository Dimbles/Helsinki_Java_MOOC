/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jakep
 */

import java.util.Comparator;

//sorting by suit first, then value order
public class BySuitInValueOrder implements Comparator<Card> {
    public int compare(Card c1, Card c2) {
        int val1 = c1.getSuit().ordinal();
        int val2 = c2.getSuit().ordinal();
        if( val1 == val2) {
            return c1.getValue() - c2.getValue();
        } else if ( val1 > val2) {
            return 1; 
        } else {
            return -1;
        }
    }
}
