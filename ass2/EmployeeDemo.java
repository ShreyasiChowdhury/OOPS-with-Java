package com.company;
import java.util.Scanner;
class Employee
{
    private String fname;
    private String lname;
    private double salary;
    void setDetails(String fname,String lname,double salary)
    {
        this.fname=fname;
        this.lname=lname;
        this.salary=salary;
    }
    String getFName()
    {
        return fname;
    }
    String getLName()
    {
        return lname;
    }
    double getMonthlySalary()
    {
        return salary/12;
    }
    double getBonus()
    {
        return (salary*0.02)+1000;
    }
    public String toString()
    {
        return "First Name : "+getFName()+"\nLast Name : "+getLName()+
                "\nMonthly Salary : "+getMonthlySalary()+"\nBonus : "+getBonus();
    }
}
public class EmployeeDemo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first name: ");
        String fname=sc.next();
        System.out.print("Enter last name: ");
        String lname=sc.next();
        System.out.print("Enter annual salary: ");
        double salary=sc.nextDouble();
        Employee e=new Employee();
        e.setDetails(fname,lname,salary);
        System.out.println(e);
    }
}