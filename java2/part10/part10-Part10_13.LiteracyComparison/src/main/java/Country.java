/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jakep
 */
public class Country {
    String name;
    int year;
    String gender;
    double literacy;
    
    public Country(String name, int year, String gender, double literacy) {
        this.name = name;
        this.year = year;
        this.gender = gender;
        this.literacy = literacy;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getGender() {
        return this.gender;
    }
    
    public Double getLiteracy() {
        return this.literacy;
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.year + "), " + this.gender + ", " + this.literacy;
    }
    
    
}
