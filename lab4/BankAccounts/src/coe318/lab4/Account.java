/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab4;

/**
 *
 * @author m1zahid
 */
public class Account {
    String name;
    double balance, amount;
    int number;
    public Account (String name, int number, double initialBalance) {
        this.name = name;
        this.number = number;
        this.balance = initialBalance;
    }
    public String getName() {
        return this.name;
    }
    public int getNumber() {
        return this.number;
    }
    public double getBalance() {
        return this.balance;
    }
    public boolean deposit(double amount) {
        if(amount > 0) {
            this.balance += amount;
            return true;
        }
        return false;
    }
    public boolean withdraw(double amount) {
        if(amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            return true;
        }
        return false;
    }
    @Override
    public String toString() {//DO NOT MODIFY
        return "(" + getName() + ", " + getNumber() + ", " +String.format("$%.2f", getBalance()) + ")";
    }
}
