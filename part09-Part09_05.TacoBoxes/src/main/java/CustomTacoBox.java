/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author clive
 */
public class CustomTacoBox implements TacoBox {
    
    private int tacos;
    
    public CustomTacoBox(int initialTacos) {
        this.tacos = initialTacos;
    }
    
    
    @Override
    public int tacosRemaining() {
        return this.tacos;
    }

    @Override
    public void eat() {
        
        this.tacos = this.tacos - 1;
        if (this.tacos < 0) {
            this.tacos = 0;
        }
    }
    
}
