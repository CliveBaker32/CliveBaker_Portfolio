/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author clive
 */
public class ProductWarehouseWithHistory extends  ProductWarehouse{
    private ChangeHistory history;
    
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        
        this.history = new ChangeHistory();
        this.addToWarehouse(initialBalance);
    }
    public String history() {
        return String.valueOf(this.history);
    }
    
    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount); // Use the superclass method
        this.history.add(super.getBalance()); // Add the current balance to the history
    }
    
    @Override
    public double takeFromWarehouse(double amount) {
        double taken = super.takeFromWarehouse(amount); // Use the superclass method
        this.history.add(getBalance()); // Add the current balance to the history
        return taken;
    
    }
    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " + this.history.maxValue());
        System.out.println("Smallest amount of product: " + this.history.minValue());
        System.out.println("Average: " + this.history.average());
    }
}
