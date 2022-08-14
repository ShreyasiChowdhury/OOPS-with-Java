package com.company;
import java.util.Scanner;
class Square
{
    private double length;
    void setLength(double length)
    {
        this.length=length;
    }
    double getLength()
    {
        return length;
    }
    double getArea()
    {
        return length*length;
    }
    double getPerimeter()
    {
        return 4*length;
    }
    public String toString()
    {
        return "Length = "+getLength()+"\nArea = "+getArea()+"\nPerimeter = "+getPerimeter();
    }
}
public class SquareDemo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length: ");
        double length=sc.nextDouble();
        Square s=new Square();
        s.setLength(length);
        System.out.println(s);
    }
}