/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;
import java.util.ArrayList;
/**
 *
 * @author m1zahid
 */
public class Circuit {
    ArrayList <Resistor> resistors = new ArrayList<Resistor>();
    ArrayList <Voltage> voltages = new ArrayList<Voltage>();
    ArrayList <Node> nodes = new ArrayList<Node>();
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
    public void add (Voltage v) {
        voltages.add(v);
    }
    public void add (Node n) {
        nodes.add(n);
    }
    public String toString() {
        String s = "";
        for (int i = 0; i < resistors.size(); i++) {
            s += resistors.get(i).toString() + "\n"; 
        }
        for (int i = 0; i < voltages.size(); i++) {
            s += voltages.get(i).toString() + "\n"; 
        }
        return s;
    }
}
