/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author clive
 */
public class Person {
    private String name;
    private String address;
    
    public Person(String name, String address) {
        this.address = address;
        this.name = name;
    }
    
    public String toString() {
        return this.name + "\n  " + this.address;
    }
}
