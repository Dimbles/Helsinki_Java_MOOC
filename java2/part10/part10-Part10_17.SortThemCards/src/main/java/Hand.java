/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jakep
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cards;
    
    public Hand() {
        this.cards = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.cards.add(card);
    }
    
    public void print() {
        Iterator<Card> iterator = cards.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
    }
    }
    
    public void sort() {
        Collections.sort(this.cards);
    }
    
    public int totalValue() {
        int total = 0;
        Iterator<Card> iterator = cards.iterator();
        while(iterator.hasNext()) {
            total += iterator.next().getValue();
    }
        return total;
    }
    
    @Override
    public int compareTo(Hand another) {
        return this.totalValue() - another.totalValue();
    }
    
    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
    }
    
}
