package com.company;
import java.util.Scanner;
import java.lang.*;
class Account
{
    int acno;
    float balance;
    Account(){}
    Account(int a,float b)
    {
        acno=a;
        balance=b;
    }
    void withdraw(float w)
    {
        balance-=w;
        System.out.println("Account Number: "+acno+"\nExisting balance: "+balance);
    }
    void deposit(float d)
    {
        balance+=d;
        System.out.println("Account Number: "+acno+"\nExisting balance: "+balance);
    }
}
class Calculate extends Account
{
    int r,t;
    float si,amt;
    Calculate(int a,float b)
    {
        super(a,b);
    }
    void accept(int x,int y)
    {
        r=x;
        t=y;
        amt=0;
    }
    void compute()
    {
        si=(balance*r*t)/100;
        amt+=si;
    }
    void display()
    {
        System.out.println("Account Number: "+acno+"\nBalance: "+balance+"\nInterest: "+si+"\nAmount to be paid: "+amt);
    }
}
public class BankDemo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Account Number:");
        int a=sc.nextInt();
        System.out.println("Enter Existing Balance:");
        float b=sc.nextFloat();
        Calculate obj=new Calculate(a,b);
        while(true)
        {
            System.out.println("\n1.Withdraw\n2.Deposit\n3.Interest Calculation\n4.Exit");
            System.out.println("Enter your choice: ");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter amount to withdraw:");
                    float w=sc.nextFloat();
                    obj.withdraw(w);
                    break;
                case 2:
                    System.out.println("Enter amount to deposit:");
                    float d=sc.nextFloat();
                    obj.deposit(d);
                    break;
                case 3:
                    System.out.println("Enter interest rate:");
                    int x=sc.nextInt();
                    System.out.println("Enter time:");
                    int y=sc.nextInt();
                    obj.accept(x,y);
                    obj.compute();
                    obj.display();
                    break;
                case 4:
                    System.out.println("Program ends.");
                    System.exit(0);
                default:
                    System.out.println("Invalid Input.");
                    System.exit(1);
            }
        }
    }
}