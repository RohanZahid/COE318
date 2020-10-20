/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

/**
 *
 * @author m1zahid
 */
public class Voltage {
    private double voltage;
    private int id;
    static int uid = 1;
    Node node1, node2;
    Circuit cir = Circuit.getInstance();
    public Voltage(double voltage, Node node1, Node node2) {
       if(node1.id < node2.id) {
           Node temp = node1;
           node1 = node2;
           node2 = temp;
           voltage = voltage*-1;
       }
        this.voltage = voltage;
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
        return "V" + id + " " + node1.id + " " + node2.id + " DC " + voltage;
    }
    
    
}
