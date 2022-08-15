package com.company;
import java.util.Scanner;
class Employee
{
    Scanner sc=new Scanner(System.in);
    private int pan;
    private String name;
    private double taxincome,tax;
    void inputData()
    {
        System.out.println("Enter personal account number: ");
        this.pan=sc.nextInt();
        System.out.println("Enter name: ");
        this.name=sc.next();
        System.out.println("Enter taxable income: ");
        this.taxincome=sc.nextDouble();
        calculateData();
    }
    void calculateData()
    {
        if(taxincome<=250000)
            tax=0;
        else if(taxincome>=250001 && taxincome<=500000)
            tax=taxincome*0.1;
        else if(taxincome>=500001 && taxincome<=1000000)
            tax=taxincome*0.2 + 30000;
        else if(taxincome>=1000001)
            tax=taxincome*0.3 + 50000;
    }
    void outputData()
    {
        System.out.println("PAN\tName\tTax Income\tTax");
        System.out.println(pan+"\t"+name+"\t"+taxincome+"\t"+tax);
    }
}
public class EmployeeDemo
{
    public static void main(String[] args)
    {
        Employee obj=new Employee();
        obj.inputData();
        obj.outputData();
    }
}