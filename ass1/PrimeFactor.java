package com.company;
import java.util.Scanner;
public class PrimeFactor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,num;
        System.out.print("Enter the number: ");
        num=sc.nextInt();
        System.out.println("Prime factors of "+num+" are:");
        for(i=2;i<num;i++)
        {
            while(num%i==0)
            {
                System.out.println(i);
                num=num/i;
            }
        }
        if(num>2)
            System.out.println(num);
    }
}