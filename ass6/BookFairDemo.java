package com.company;
import java.util.Scanner;
class BookFair
{
    private String bname;
    private double price,dis;
    BookFair()
    {
        this.bname=bname;
        this.price=price;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Book Name:");
        bname=sc.nextLine();
        System.out.println("Enter Price:");
        price=sc.nextDouble();
    }
    void calculate()
    {
        if(price<=1000)
            dis=price*0.02;
        else if(price<=3000)
            dis=price*0.1;
        else
            dis=price*0.15;
        price=price-dis;
    }
    void display()
    {
        System.out.println("\nBook Name : "+bname);
        System.out.println("Discount : "+dis);
        System.out.println("Final Price : "+price);
    }
}
public class BookFairDemo
{
    public static void main(String[] args)
    {
        BookFair obj=new BookFair();
        obj.input();
        obj.calculate();
        obj.display();
    }
}