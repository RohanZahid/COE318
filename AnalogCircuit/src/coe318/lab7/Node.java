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
public class Node {
    Circuit cir = Circuit.getInstance();
    int id;
    static int uid = 0;
    Node () {
        id = uid++;
        cir.add(this);
    }
    public String toString() {
        return "Node ID: " + id;
    }
}
