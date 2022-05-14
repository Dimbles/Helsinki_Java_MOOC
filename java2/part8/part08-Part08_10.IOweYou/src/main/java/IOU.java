/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jakep
 */

import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> records;
    
    public IOU() {
        this.records = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        this.records.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        return this.records.getOrDefault(toWhom, 0.0);
    }
    
}
