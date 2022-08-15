package com.company;
import java.util.Scanner;
class Interest
{
    private int p,t;
    private double r,interest,amt;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principal: ");
        this.p=sc.nextInt();
        System.out.println("Enter time in whole year: ");
        this.t=sc.nextInt();
        cal();
    }
    void cal()
    {
        if(t==1)
            r=6.5;
        else if(t==2)
            r=7.5;
        else if(t==3)
            r=8.5;
        else
            r=9.5;
        interest=p*r*t;
        amt=p+interest;
    }
    void display()
    {
        System.out.println("Principal\tInterest\tAmount");
        System.out.println(p+"\t"+interest+"\t"+amt);
    }
}
public class InterestDemo
{
    public static void main(String[] args)
    {
        Interest obj=new Interest();
        obj.input();
        obj.display();
    }
}