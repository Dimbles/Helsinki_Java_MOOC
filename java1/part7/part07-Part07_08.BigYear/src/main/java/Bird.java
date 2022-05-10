/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jakep
 */
public class Bird {
    private String name;
    private String latin;
    private Integer obs;
    
    public Bird( String name, String latin) {
        this.name = name;
        this.latin = latin;
        this.obs = 0;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getLatin() {
        return this.latin;
    }
    
    public Integer getObs() {
        return this.obs;
    }
    
    public void addObs() {
        this.obs += 1;
    }
    
    @Override
    
    public String toString() {
        return this.name + " (" + this.latin + "): " + this.obs + " observations";
    }
    
}
