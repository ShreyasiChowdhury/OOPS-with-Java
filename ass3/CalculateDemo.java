package com.company;
import java.util.Scanner;
class Calculate
{
    private double num1,num2,sum,diff;
    void inputData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        this.num1=sc.nextDouble();
        System.out.println("Enter second number: ");
        this.num2=sc.nextDouble();
        calculateData();
    }
    void calculateData()
    {
        sum = num1+num2;
        diff=num1-num2;
        outputData();
    }
    void outputData()
    {
        System.out.println("Sum is : "+sum+"\nDifference is : "+diff);
    }
}
public class CalculateDemo
{
    public static void main(String[] args)
    {
        Calculate obj=new Calculate();
        obj.inputData();
    }
}