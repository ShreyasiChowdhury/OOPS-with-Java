package com.company;
import java.util.Scanner;
class Triplet
{
    private int a,b,c;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a: ");
        this.a=sc.nextInt();
        System.out.println("Enter b: ");
        this.b=sc.nextInt();
        System.out.println("Enter c: ");
        this.c=sc.nextInt();
        findPrint();
    }
    int checkTriplet()
    {
        int a2=a*a,b2=b*b,c2=c*c;
        if(a2+b2==c2 || a2+c2==b2 || b2+c2==a2)
            return 1;
        else
            return 0;
    }
    void findPrint()
    {
        int x=checkTriplet();
        if(x==1)
            System.out.println(a+", "+b+", "+c+" are Pythagorean Triplet");

        else
            System.out.println(a+", "+b+", "+c+" are not Pythagorean Triplet");
    }
}
public class TripletDemo
{
    public static void main(String[] args)
    {
        Triplet obj=new Triplet();
        obj.getData();
    }
}