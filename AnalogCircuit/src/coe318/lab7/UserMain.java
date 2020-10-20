/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;
import java.util.Scanner;
/**
 *
 * @author m1zahid
 */
public class UserMain {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        Circuit c1 = Circuit.getInstance();
        boolean run = true, check = false;
        int nint1, nint2, diff;
        Voltage vo;
        Resistor ro;
        
        Node n1 = null, n2 = null;
        double r, v;
        String s = "";
        while (run == true) {
            s = scan.next();
            if(s.equalsIgnoreCase("end")) {
                System.out.println("All Done");
                run = false;
            }
            else if(s.equals("v")) {
                nint1 = scan.nextInt();
                nint2 = scan.nextInt();
                if (nint1 < Node.uid) {
                    for (int i = 0; i < Node.uid; i++) {
                        if (c1.nodes.get(i).id == nint1)
                            n1 = c1.nodes.get(i);
                    }
                }
                else {
                    diff = nint1 - Node.uid;
                    for (int i = 0; i <= diff; i ++)
                        n1 = new Node();
                }
                if (nint2 < Node.uid) {
                    for (int i = 0; i < Node.uid; i++) {
                        if (c1.nodes.get(i).id == nint2)
                            n2 = c1.nodes.get(i);
                    }
                }
                else {
                    diff = nint2 - Node.uid;
                    for (int i = 0; i <= diff; i ++)
                        n2 = new Node();
                }
                v = scan.nextDouble();
                vo = new Voltage(v, n1, n2);
            }
            else if(s.equals("r")) {
                nint1 = scan.nextInt();
                nint2 = scan.nextInt();
                if (nint1 < Node.uid) {
                    for (int i = 0; i < Node.uid; i++) {
                        if (c1.nodes.get(i).id == nint1)
                            n1 = c1.nodes.get(i);
                    }
                }
                else {
                    diff = nint1 - Node.uid;
                    for (int i = 0; i <= diff; i ++)
                        n1 = new Node();
                }
                if (nint2 < Node.uid) {
                    for (int i = 0; i < Node.uid; i++) {
                        if (c1.nodes.get(i).id == nint2)
                            n2 = c1.nodes.get(i);
                    }
                }
                else {
                    diff = nint2 - Node.uid;
                    for (int i = 0; i <= diff; i ++)
                        n2 = new Node();
                }
                r = scan.nextDouble();
                ro = new Resistor(r, n1, n2);
            }
            else if (s.equalsIgnoreCase("spice")) {
                System.out.println(c1.toString());
            }
                
        }
    }   
}
