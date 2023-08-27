package ProblemE8_25;

import java.util.ArrayList;

public class ArrayListMethod {
    private double balance;
    private int accountNumber;
    private static int lastAssignedNumber = 1000;
    public static final double OVERRATE_VALUE = 20.95;
    private ArrayList<Double> statement = new ArrayList<>();

    public ArrayListMethod(){
        lastAssignedNumber++;
        accountNumber = lastAssignedNumber;
        balance = 0;
    }

    public ArrayListMethod(double initialBalance){
        lastAssignedNumber++;
        accountNumber = lastAssignedNumber;
        balance = initialBalance;
    }
    public void deposit(double amount){
        balance = balance + amount;
        addToStatement(amount);
    }

    public void withdraw(double amount){
        if(amount>balance){
            balance = balance - OVERRATE_VALUE;
            addToStatement(-OVERRATE_VALUE);
        }
        else {

            balance = balance - amount;
            addToStatement(-amount);
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void addToStatement(double value){
        statement.add(value);
    }

    public ArrayList<Double> getStatement(){
        return statement;
    }

    public void clearStatement(){
        statement.clear();
    }
}
