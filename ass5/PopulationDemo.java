package com.company;
import java.util.Scanner;
import java.lang.Math;
class Population
{
    private float p,r;
    private int a,b;
    Population(){}
    Population(int a,int b,float p,float r)
    {
        this.a=a;
        this.b=b;
        this.p=p;
        this.r=r;
    }
    void calculate()
    {
        for(int i=a;i<=b;i++)
        {
            p=p*(1+r/100);
            p=Math.round(p);
            print(i,p);
        }
    }
    void print(int i,float p)
    {
        System.out.println("Population of year "+i+": "+(int)p);
    }
}
public class PopulationDemo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lower limit of year:");
        int a=sc.nextInt();
        System.out.println("Enter upper limit of year:");
        int b=sc.nextInt();
        System.out.println("Enter p:");
        float p=sc.nextFloat();
        System.out.println("Enter r:");
        float r=sc.nextFloat();
        Population obj=new Population(a,b,p,r);
        obj.calculate();
    }
}