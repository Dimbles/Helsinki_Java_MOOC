/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jakep
 */
public class CustomTacoBox implements TacoBox{
    Integer tacos;
    
    public CustomTacoBox( int tacos) {
        this.tacos = tacos;
    }
    
    
    public int tacosRemaining() {
        return this.tacos;
    }

    public void eat() {
        if( this.tacos > 0) {
           this.tacos -= 1; 
        }       
    }
}
