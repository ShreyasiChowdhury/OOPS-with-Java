package com.company;
import java.util.Scanner;
class Discount
{
    Scanner sc=new Scanner(System.in);
    private double price,amt;
    void setDetails()
    {
        System.out.println("Enter price:");
        price=sc.nextDouble();
    }
    double calDiscount(double dis1)
    {
        return price-price*dis1/100;
    }
    double calDiscount(double dis1,double dis2)
    {
        amt=calDiscount(dis1);
        return amt-amt*dis2/100;
    }
    double calDiscount(double dis1,double dis2,double dis3)
    {
        amt=calDiscount(dis1,dis2);
        return amt-amt*dis3/100;
    }
    void printDetails()
    {
        System.out.println("Enter your mode of discount (1/2/3) :");
        int x=sc.nextInt();
        if(x==1)
        {
            System.out.println("Enter 1 discount:");
            double dis1=sc.nextDouble();
            double new_price=calDiscount(dis1);
            System.out.println("Original Price: "+price+"\nDiscounted Price: "+new_price);
        }
        else if(x==2)
        {
            System.out.println("Enter 2 discounts:");
            double dis1=sc.nextDouble();
            double dis2=sc.nextDouble();
            double new_price=calDiscount(dis1,dis2);
            System.out.println("Original Price: "+price+"\nDiscounted Price: "+new_price);
        }
        else if(x==3)
        {
            System.out.println("Enter 3 discounts:");
            double dis1=sc.nextDouble();
            double dis2=sc.nextDouble();
            double dis3=sc.nextDouble();
            double new_price=calDiscount(dis1,dis2,dis3);
            System.out.println("Original Price: "+price+"\nDiscounted Price: "+new_price);
        }
        else
            System.out.println("Wrong Input");
    }
}
public class DiscountDemo
{
    public static void main(String[] args)
    {
        Discount obj=new Discount();
        obj.setDetails();
        obj.printDetails();
    }
}