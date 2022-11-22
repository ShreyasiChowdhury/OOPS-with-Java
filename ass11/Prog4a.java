package com.company;
import java.util.Scanner;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}
public class Prog4a {
    public static void main(String[] args) {
        try {
            System.out.println("Enter age:");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if (num < 18) {
                throw new MyException("Under aged for voting");
            }
            else {
                System.out.println("Eligible for voting");
            }
        }
        catch (MyException me) {
            System.out.println(me.getMessage());
        }
    }
}

