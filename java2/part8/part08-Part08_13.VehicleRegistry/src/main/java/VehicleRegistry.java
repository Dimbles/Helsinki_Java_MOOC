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
import java.util.Map;
import java.util.ArrayList;

public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> register; 
    
    public VehicleRegistry() {
        this.register = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        
        if(register.containsKey(licensePlate)) {
            return false;
        }
        
        register.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate) {
        return register.getOrDefault(licensePlate, null);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if(!register.containsKey(licensePlate)) {
            return false;
        }
        
        register.remove(licensePlate);
        return true;
    }
    
    public void printLicensePlates() {
        for( Map.Entry<LicensePlate, String> plate: register.entrySet()) {
            System.out.println(plate.getKey());
        }
    }
    
    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for( Map.Entry<LicensePlate, String> plate: register.entrySet()) {
            String owner = plate.getValue();
            if(!owners.contains(owner)){
                owners.add(owner);
            }
                
        }
        for( String owner: owners) {
            System.out.println(owner);
        }
    }
    
    
}
