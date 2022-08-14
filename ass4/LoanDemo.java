package com.company;
import java.util.Scanner;
import java.lang.*;
class Loan
{
    private int time;
    private double principal,rate,interest,amt;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter principal: ");
        principal=sc.nextDouble();
        System.out.print("Enter time: ");
        time=sc.nextInt();
        calculate();
    }
    void calculate()
    {
        if(time==0)
        {
            System.out.println("Invalid Time");
            System.exit(0);
        }
        else if(time<=5)
            rate=15;
        else if(time<=10)
            rate=12;
        else
            rate=10;
        interest=(principal*rate*time)/100;
        amt=principal+interest;
        display();
    }
    void display()
    {
        System.out.println("Interest: "+interest+"\nPayable Amount: "+amt);
    }
}
public class LoanDemo
{
    public static void main(String[] args)
    {
        Loan obj=new Loan();
        obj.getData();
    }
}