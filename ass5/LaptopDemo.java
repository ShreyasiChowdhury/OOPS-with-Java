package com.company;
import java.util.Scanner;
class Laptop
{
    private String name;
    private double price,dis,amt;
    Laptop(){}
    Laptop(String name,double price)
    {
        this.name=name;
        this.price=price;
    }
    void compute()
    {
        if(price<=25000)
            dis=0.05;
        else if(price<=50000)
            dis=0.075;
        else if(price<=100000)
            dis=0.1;
        else
            dis=0.15;
        amt=price-price*dis;
    }
    void printDetails()
    {
        System.out.println("Name: "+name+"\nPrice: "+price+"\nDiscount: "+(dis*100)+"%"+"\nAmount: "+amt);
    }
}
public class LaptopDemo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        String name=sc.nextLine();
        System.out.println("Enter price:");
        int price=sc.nextInt();
        Laptop obj=new Laptop(name,price);
        obj.compute();
        obj.printDetails();
    }
}