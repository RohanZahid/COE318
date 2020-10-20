/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

/**
 *A resistor model.
 * @author m1zahid
 */
public class Resistor {
    private double resistance;
    private int id;
    static int uid = 1;
    Node node1, node2;
    Circuit cir = Circuit.getInstance();
    /**
     * Create a resistor.
     * @param resistance resistance in Ohms
     * @param node1 the first node
     * @param node2 the second node
     */
    public Resistor(double resistance, Node node1, Node node2) {
        if (resistance < 0) { //Throws an exception if the resistance is negative.
            throw new IllegalArgumentException("The Resistance can't be negative");
        }
        this.resistance = resistance;
        this.node1 = node1;
        this.node2 = node2;
        id = uid++;
        cir.add(this);
    }
    /**
     * Returns the array of the nodes of the voltage source.
     *
     * @return nodes
     */
    public Node [] getNode() {
        Node [] nodes  = new Node [2];
        nodes[0] = node1;
        nodes[1] = node2;
        return nodes;
    }
    /**
     * Returns the String representation of the resistor.
     *
     * @return String of R
     */
    public String toString() {
        return "R" + id + " " + node1.id + " " + node2.id + " " + resistance;
    }
    
    
}
