/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab1;

/**
 *
 * @author m1zahid
 */
public class test {
    public static void main(String args[]) {
        String a = "SOFTWARESYSTEM";
        char [] b = new char[7];
        int i = 0;
        do {
            i=i+2;
            b[i/2-1] = a.charAt(i-1);
            
        } while (i < a.length());
        System.out.println("" + b[0] + b[1] + b[2] + b[3] + b[4] + b[5] + b[6]);
    }
}
