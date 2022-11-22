package com.company;
import java.util.Scanner;

class BankException extends Exception {
    public BankException(String message) {
        super(message);
    }
}
public class Prog4b {
    public static void main(String[] args) {
        try {
            System.out.println("Enter existing bank balance:");
            Scanner sc = new Scanner(System.in);
            double amt = sc.nextDouble();
            if (amt < 5000) {
                throw new BankException("Unable to withdraw");
            }
            else {
                System.out.println("Enter amount to withdraw:");
                double wd = sc.nextDouble();
                amt -= wd;
                System.out.println("Existing bank balance: "+amt);
            }
        }
        catch (BankException me) {
            System.out.println(me.getMessage());
        }
    }
}

