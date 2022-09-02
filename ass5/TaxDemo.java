package com.company;
import java.util.Scanner;
class Tax
{
    private String name;
    private double income,tax;
    Tax(){}
    Tax(String name,double income)
    {
        this.name=name;
        this.income=income;
    }
    void computeTax()
    {
        if(income<=250000)
            tax=0;
        else if(income<=500000)
            tax=income*0.1;
        else if(income<=1000000)
            tax=30000+income*0.2;
        else
            tax=50000+income*0.3;
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
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        String name=sc.nextLine();
        System.out.println("Enter income:");
        double income=sc.nextDouble();
        Tax obj=new Tax(name,income);
        obj.computeTax();
        obj.printDetails();
    }
}