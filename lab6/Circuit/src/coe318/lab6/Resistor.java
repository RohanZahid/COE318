/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;

/**
 *
 * @author m1zahid
 */
public class Resistor {
    private double resistance;
    private int id;
    static int uid = 1;
    Node node1, node2;
    Circuit cir = Circuit.getInstance();
    public Resistor(double resistance, Node node1, Node node2) {
        if (resistance < 0) {
            throw new IllegalArgumentException("The Resistance can't be negative");
        }
        this.resistance = resistance;
        this.node1 = node1;
        this.node2 = node2;
        id = uid++;
        cir.add(this);
    }
    public Node [] getNode() {
        Node [] nodes  = new Node [2];
        nodes[0] = node1;
        nodes[1] = node2;
        return nodes;
    }
    public String toString() {
        return "R" + id + " " + node1.id + " " + node2.id + " " + resistance;
    }
    
    
}
