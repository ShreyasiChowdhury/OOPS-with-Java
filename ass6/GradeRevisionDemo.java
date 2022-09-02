package com.company;
import java.util.Scanner;
class GradeRevision
{
    private String name;
    private int bas,expn;
    private double inc,nbas;
    GradeRevision()
    {
        this.name=name;
        this.bas=bas;
        this.expn=expn;
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        name=sc.nextLine();
        System.out.println("Enter basic salary:");
        bas=sc.nextInt();
        System.out.println("Enter experience:");
        expn=sc.nextInt();
    }
    void increment()
    {
        if(expn<=3)
            inc=1000+(bas*0.1);
        else if(expn<=5)
            inc=3000+(bas*0.12);
        else if(expn<=10)
            inc=5000+(bas*0.15);
        else
            inc=8000+(bas*0.2);
        nbas=bas+inc;
    }
    void display()
    {
        System.out.println("\nName : "+name);
        System.out.println("Basic Salary : "+bas);
        System.out.println("Experience : "+expn);
        System.out.println("Increment : "+inc);
        System.out.println("New Basic Salary : "+nbas);
    }
}
public class GradeRevisionDemo
{
    public static void main(String[] args)
    {
        GradeRevision obj=new GradeRevision();
        obj.accept();
        obj.increment();
        obj.display();
    }
}