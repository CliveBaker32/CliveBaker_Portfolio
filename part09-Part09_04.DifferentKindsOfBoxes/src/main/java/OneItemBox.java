
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
public class OneItemBox extends Box {
    private int capacity;
    private ArrayList<Item> items;
    
    public OneItemBox() {
        this.capacity = 0;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
       if (!this.items.isEmpty()) {
           return;
       }
       this.items.add(item);
        
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
        
    }
    
}
