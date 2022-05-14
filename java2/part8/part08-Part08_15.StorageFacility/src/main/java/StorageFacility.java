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
import java.util.HashMap;

public class StorageFacility {
    
    private HashMap<String, ArrayList<String>> register;
    
    public StorageFacility() {
        this.register = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.register.putIfAbsent(unit, new ArrayList<>());
        this.register.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        return register.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item) {
        if( register.containsKey(storageUnit)) {
            this.register.get(storageUnit).remove(item);
            if(this.register.get(storageUnit).size() == 0) {
                this.register.remove(storageUnit);
            }
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> names = new ArrayList<>();
        for( String storageUnit: register.keySet() ) {
            if( this.register.get(storageUnit).size() != 0) {
                names.add(storageUnit);
            }
        }
        return names;
    }
}

