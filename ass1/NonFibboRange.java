package com.company;
import java.util.Scanner;
public class NonFibboRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        int a=0,b=1,c,d;
        System.out.print("Enter upper bound: ");
        n=sc.nextInt();
        System.out.println("Non - Fibonacci numbers till "+n+" are:");
        for(i=0;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
            d=a+b;
            for(j=c+1;j<d;j++)
            {
                if(j<=n)
                    System.out.println(j);
                else
                    break;
            }
        }
    }
}