/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jakep
 */
public class OneItemBox extends Box{
    
    private boolean empty;
    private Item item;
    
    public OneItemBox() {
        this.empty = true;
        this.item = null;
    }
    
    @Override
    public void add(Item item) {
        if (empty == true) {
            this.item = item;
            empty = false;
        }
    }
        
    @Override    
    public boolean isInBox(Item item) {
        if( empty == false && this.item.equals(item)) {
            return true;
        } else {
            return false;
        }
    }
    
}
