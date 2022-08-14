package com.company;
import java.util.Scanner;
import java.lang.Math;
class Circle
{
    private double radius;
    void setRadius(double radius)
    {
        this.radius=radius;
    }
    double getRadius()
    {
        return radius;
    }
    double getArea()
    {
        return Math.PI*radius*radius;
    }
    double getCircumference()
    {
        return 2*Math.PI*radius;
    }
    public String toString()
    {
        return "Radius = "+getRadius()+"\nArea = "+getArea()+"\nCircumference = "+getCircumference();
    }
}
public class CircleDemo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius=sc.nextDouble();
        Circle r=new Circle();
        r.setRadius(radius);
        System.out.println(r);
    }
}