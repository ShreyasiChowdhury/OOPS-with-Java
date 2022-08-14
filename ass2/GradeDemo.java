package com.company;
import java.util.Scanner;
class Grade
{
    private String name;
    private double cmarks;
    private double jvmarks;
    private double pymarks;
    private double jsmarks;
    void setDetails(String name,double cmarks,double jvmarks,double pymarks,double jsmarks)
    {
        this.name=name;
        this.cmarks=cmarks;
        this.jvmarks=jvmarks;
        this.pymarks=pymarks;
        this.jsmarks=jsmarks;
    }
    String getName()
    {
        return name;
    }
    double getAverageGrade()
    {
        return (cmarks+jvmarks+pymarks+jsmarks)/4;
    }
    public String toString()
    {
        return "Name : "+getName()+"\nAverage Grade : "+getAverageGrade();
    }
}
public class GradeDemo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name: ");
        String name=sc.nextLine();
        System.out.print("Enter marks of C: ");
        double cmarks=sc.nextDouble();
        System.out.print("Enter marks of Java: ");
        double jvmarks=sc.nextDouble();
        System.out.print("Enter marks of Python: ");
        double pymarks=sc.nextDouble();
        System.out.print("Enter marks of Java Script: ");
        double jsmarks=sc.nextDouble();
        Grade s=new Grade();
        s.setDetails(name,cmarks,jvmarks,pymarks,jsmarks);
        System.out.println(s);
    }
}