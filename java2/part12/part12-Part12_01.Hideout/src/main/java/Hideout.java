
public class Hideout<T> {
    
    private T hideout;
    
    public Hideout() {
        this.hideout = null;
    }
    
    public void putIntoHideout(T toHide) {
        this.hideout = toHide;
    }
    
    public T takeFromHideout() {
        
        T take = this.hideout;
        
        this.hideout = null;
        
        return take;
    }
    
    public boolean isInHideout() {
        if( this.hideout != null) {
            return true;
        } else {
            return false;
        }
    }
    
}
