
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author clive
 */
public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void add(double status) {
        this.history.add(status);
    }
    
    public void clear() {
        this.history.clear();
    }
    
    
    public String toString() {
        return String.valueOf(this.history);
    }
    
    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0.0;
        }
        
        double largest = this.history.get(0);
        
        for (Double num: this.history) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }
    
    public double minValue() {
        if (this.history.isEmpty()) {
            return 0.0;
        }
        
        double smallest = this.history.get(0);
        
        for (Double num: this.history) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }
    
    public double average() {
        if (this.history.isEmpty()) {
            return 0.0;
        }
        
        double total = 0.0;
        double count = 0.0;
        
        for (Double num: this.history) {
            total = total + num;
            count++;
        }
        double average = 1.0 * total / count;
        return average;
    }
}
