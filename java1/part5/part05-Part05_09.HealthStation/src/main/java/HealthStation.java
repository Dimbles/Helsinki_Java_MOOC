
public class HealthStation {
    private int count;
    
    public HealthStation() {
        this.count = 0;
    }


    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        count += 1;
        return person.getWeight();
        
    }
    
    public void feed(Person person) {
        int currentWeight = person.getWeight();
        person.setWeight(currentWeight + 1);
    }
    
    public int weighings() {
        return this.count;
    }
    
    

}
