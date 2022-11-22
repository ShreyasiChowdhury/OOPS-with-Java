package com.company;

public class Prog2 {
    public static void main(String[] args)
    {
        int a = 5;
        int b = 0;
        try {
            int c = divide(a, b);
            System.out.println(c);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
        finally {
            System.out.println("This block will always execute");
        }
    }
    static int divide(int a, int b) throws ArithmeticException
    {
        if (b == 0) {
            throw new ArithmeticException("Not expected");
        }
        return a / b;
    }
}
