//x/1! - x^3/3! + x^5/5! -
package com.company;
import java.util.Scanner;
import java.lang.Math;
public class Series {
    static double fact(double num){
        double i,fact=1;
        for(i=1;i<=num;i++)
            fact=fact*i;
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,sign=-1;
        double x,n,sum,temp,term;
        System.out.print("Enter the value of x: ");
        x=sc.nextDouble();
        System.out.print("Enter the value of n: ");
        n=sc.nextDouble();
        sum=x;
        System.out.print("Terms are:\n"+x+" , ");
        for(i=1;i<n;i++)
        {
            temp=2*i+1;
            term=(Math.pow(x,temp)/fact(temp))*sign;
            System.out.print(term+" , ");
            sum=sum+term;
            sign=sign*(-1);
        }
        System.out.println("\nResult is: "+sum);
    }
}
