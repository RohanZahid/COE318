/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

/**
 *A voltage source model.
 * @author m1zahid
 */
public class Voltage {
    private double voltage;
    private int id;
    static int uid = 1;
    Node node1, node2;
    Circuit cir = Circuit.getInstance();
    /**
     * Create a voltage source.
     * @param voltage voltage in volts
     * @param node1 the first node
     * @param node2 the second node
     */
    public Voltage(double voltage, Node node1, Node node2) {
       if(voltage < 0) { //Reverses the polarity if the voltage is negative.
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
     * Returns the ID of the voltage source.
     *
     * @return id
     */
    public int getID() {
        return id;
    }
    /**
     * Returns the voltage of the voltage source.
     *
     * @return voltage
     */
    public double getVoltage() {
        return voltage;
    }
    /**
     * Returns the String representation of the voltage source.
     *
     * @return String of V
     */
    public String toString() {
        return "V" + id + " " + node1.id + " " + node2.id + " DC " + voltage;
    }
    
    
}
