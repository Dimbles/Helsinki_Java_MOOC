
public class Statistics {

    private int count;
    private int numberCount;

    public Statistics() {
        this.count = 0;
        this.numberCount = 0;
    }

    public void addNumber(int number) {
        this.count += number;
        this.numberCount += 1;
    }
    
    public int getCount() {
        return this.numberCount;
    }
    
    public int sum() {
        return this.count;
    }
    
    public double average() {
        if( this.count == 0) {
            return 0;
        }
        return ( (double) this.sum()) / this.getCount();
    }
}
