package org.example;

public class Calculator {
    public int addition(int i, int j){
        return i+j;
    }
    public int subtraction(int i, int j){
        return i-j;
    }
    public boolean isNum1Bigger(int i, int j){
        return i>j;
    }
    public double multipleTwoFloatNumbers(double i, double j){
        return i*j;
    }
    public double divideTwoFloatNumbers(double dividend, double divisor){
        if (divisor==0) {
            System.out.println("Error! Divisor can not be equal 0");
            return 0;
        }
        return dividend/divisor;
    }
}
