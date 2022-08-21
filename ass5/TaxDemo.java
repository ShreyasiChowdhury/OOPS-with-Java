package com.company;
import java.util.Scanner;
class Tax
{
    private String name;
    private int income;
    private double tax;
    void setDetails(String name,int income)
    {
        this.name=name;
        this.income=income;
    }
    void calculate()
    {
        if(income<=250000)
            tax=0;
        else if(income<=500000)
            tax=0.1*income;
        else if(income<=1000000)
            tax=30000+0.2*income;
        else
            tax=50000+0.3*income;
    }
    void printDetails()
    {
        System.out.println("Name: "+name+"\nIncome: "+income+"\nTax: "+tax);
    }
}
public class TaxDemo
{
    public static void main(String[] args)
    {
        String name;
        int income;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        name=sc.nextLine();
        System.out.println("Enter income:");
        income=sc.nextInt();
        Tax t=new Tax();
        t.setDetails(name,income);
        t.calculate();
        t.printDetails();
    }
}