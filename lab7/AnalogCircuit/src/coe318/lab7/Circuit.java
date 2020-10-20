/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;
import java.util.ArrayList;
/**
 *A circuit model.
 * @author m1zahid
 */
public class Circuit {
    ArrayList components = new ArrayList();
    ArrayList <Node> nodes = new ArrayList<Node>();
    private static Circuit instance = null;
    public static Circuit getInstance() {
        if (instance == null) {
            instance = new  Circuit();
        }
        return instance;
    }
    private Circuit() {} //Yes, the constructor is PRIVATE!
    /**
     * Adds the resistor to the array of components.
     *
     * @param r
     */
    public void add (Resistor r) {
        components.add(r);
    }
    /**
     * Adds the voltage source to the array of components.
     *
     * @param v
     */
    public void add (Voltage v) {
        components.add(v);
    }
    /**
     * Adds the node to the array of nodes.
     *
     * @param n
     */
    public void add (Node n) {
        nodes.add(n);
    }
    /**
     * Returns the String representation of the circuit.
     *
     * @return String of circuit
     */
    public String toString() {
        String s = "";
        for (int i = 0; i < components.size(); i++) {
            s += components.get(i).toString() + "\n";
        }
        return s;
    }
}
