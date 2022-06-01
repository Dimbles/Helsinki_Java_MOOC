
import java.util.ArrayList;

public class Pipe<T> {
    
    ArrayList<T> contents;
    
    public Pipe() {
        this.contents = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        this.contents.add(value);
    }
        
    public T takeFromPipe() {
        
        if(this.contents.isEmpty()) {
            return null;
        } else {
        
        T take = this.contents.get(0);
        
        this.contents.remove(0);
        
        return take;
        }
    }
        
    public boolean isInPipe() {
        if( this.contents.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
        
        
}




