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

public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void add(double status) {
        this.history.add(status);
    }
    
    public void clear() {
        this.history.clear();
    }
    
    public String toString() {
        return history.toString();
    }
    
    public double maxValue() {
        if(history.size() == 0) {
            return 0;
        }
        double max = history.get(0);
        for( double value: history) {
            if(value > max) {
                max = value;
            }
        }
        return max;
    }
    
    public double minValue() {
        if( history.size() == 0) {
            return 0;
        }
        double min = history.get(0);
        for( double value: history) {
            if(value < min) {
                min = value;
            }
        }
        return min;
    }
    
    public double average() {
        if( history.size() == 0) {
            return 0;
        }
        int count = history.size();
        int sum = 0;
        for( double value: history) {
            sum += value;
        }
        double average = (double) sum / count;
        return average;
    }
    
}
