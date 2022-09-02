package com.company;
import java.util.Scanner;
class Student
{
    private String name;
    private int mm,scm;
    private double comp;
    Student(){}
    Student(String name,int mm,int scm,double comp)
    {
        this.name=name;
        this.mm=mm;
        this.scm=scm;
        this.comp=comp;
    }
    String check()
    {
        double marks=(mm+scm+comp)/3;
        if(mm>=90 && scm>=90 && comp>=90)
            return "Science with Computer";
        else if(marks>=90)
            return "Bio-Science";
        else if(marks>=80)
            return "Science with Hindi";
        else
            return "Not eligible";
    }
    void display()
    {
        System.out.println("\nName : "+name+"\nEligibility : "+check());
    }
}
public class StudentDemo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        String name=sc.nextLine();
        System.out.println("Enter marks in Maths:");
        int mm=sc.nextInt();
        System.out.println("Enter marks in Science:");
        int scm=sc.nextInt();
        System.out.println("Enter marks in Computer:");
        double comp=sc.nextDouble();
        Student obj=new Student(name,mm,scm,comp);
        obj.display();
    }
}