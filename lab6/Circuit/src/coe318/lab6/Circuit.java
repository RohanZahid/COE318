/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;
import java.util.ArrayList;
/**
 *
 * @author m1zahid
 */
public class Circuit {
    ArrayList <Resistor> resistors = new ArrayList<Resistor>();
    private static Circuit instance = null;
    public static Circuit getInstance() {
        if (instance == null) {
            instance = new  Circuit();
        }
        return instance;
    }
    private Circuit() {} //Yes, the constructor is PRIVATE!
    public void add (Resistor r) {
        resistors.add(r);
    }
    public String toString() {
        String s = "";
        for (int i = 0; i < resistors.size(); i++) {
            s += resistors.get(i).toString() + "\n"; 
        }
        return s;
    }
}
