/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;
import java.util.Scanner;
/**
 *A simple DC circuit model.
 *
 * @author m1zahid
 */
public class UserMain {
    /**
     * Allows the user to enter resistors or voltage sources with corresponding nodes and values.
     * @param args 
     */
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        Circuit c1 = Circuit.getInstance();
        boolean run = true;
        int nint1, nint2, diff;
        Voltage vo;
        Resistor ro;
        
        Node n1 = null, n2 = null; //Initializes the 2 nodes for the component.
        double r, v;
        String s = "";
        while (run == true) { 
            s = scan.next();
            if(s.equalsIgnoreCase("end")) { //If "end" is entered, the program ends.
                System.out.println("All Done");
                run = false;
            }
            else if(s.equals("v")) { //If "v" is entered, the voltage source is created.
                nint1 = scan.nextInt();
                nint2 = scan.nextInt();
                if (nint1 < Node.uid) { //If the first node entered already exists, it is located in the arraylist.
                    for (int i = 0; i < Node.uid; i++) {
                        if (c1.nodes.get(i).id == nint1)
                            n1 = c1.nodes.get(i);
                    }
                }
                else { //If the first node entered does NOT exist, nodes until the specified node will be created.
                    diff = nint1 - Node.uid;
                    for (int i = 0; i <= diff; i ++)
                        n1 = new Node();
                }
                if (nint2 < Node.uid) { //If the second node entered already exists, it is located in the arraylist.
                    for (int i = 0; i < Node.uid; i++) {
                        if (c1.nodes.get(i).id == nint2)
                            n2 = c1.nodes.get(i);
                    }
                }
                else { //If the second node entered does NOT exist, nodes until the specified node will be created.
                    diff = nint2 - Node.uid;
                    for (int i = 0; i <= diff; i ++)
                        n2 = new Node();
                }
                v = scan.nextDouble();
                vo = new Voltage(v, n1, n2); //A new voltage source with the entered specifications is created.
            }
            else if(s.equals("r")) { //If "r" is entered, the resistor is created.
                nint1 = scan.nextInt();
                nint2 = scan.nextInt();
                if (nint1 < Node.uid) { //If the first node entered already exists, it is located in the arraylist.
                    for (int i = 0; i < Node.uid; i++) {
                        if (c1.nodes.get(i).id == nint1)
                            n1 = c1.nodes.get(i);
                    }
                }
                else { //If the first node entered does NOT exist, nodes until the specified node will be created.
                    diff = nint1 - Node.uid;
                    for (int i = 0; i <= diff; i ++)
                        n1 = new Node();
                }
                if (nint2 < Node.uid) { //If the second node entered already exists, it is located in the arraylist.
                    for (int i = 0; i < Node.uid; i++) {
                        if (c1.nodes.get(i).id == nint2)
                            n2 = c1.nodes.get(i);
                    }
                }
                else { //If the second node entered does NOT exist, nodes until the specified node will be created.
                    diff = nint2 - Node.uid;
                    for (int i = 0; i <= diff; i ++)
                        n2 = new Node();
                }
                r = scan.nextDouble();
                ro = new Resistor(r, n1, n2); //A new resistor with the entered specifications is created.
            }
            else if (s.equalsIgnoreCase("spice")) { //If "spice" is entered, the spice description of the circuit is printed.
                System.out.println(c1.toString());
            }
                
        }
    }   
}
