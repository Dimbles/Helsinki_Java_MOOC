/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jakep
 */


public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory history;
    
    public ProductWarehouseWithHistory( String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        
        this.history = new ChangeHistory();
        this.addToWarehouse(initialBalance);
    }
    
    public String history() {
        return history.toString();
    }
    
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        history.add(this.getBalance());
    }
    
    public double takeFromWarehouse(double amount) {
        double take = super.takeFromWarehouse(amount);
        history.add(this.getBalance());
        return take;
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.history);
        System.out.println("Largest amount of product: " + history.maxValue());
        System.out.println("Smallest amount of product: " + history.minValue());
        System.out.println("Average: " + history.average());
    }
}
