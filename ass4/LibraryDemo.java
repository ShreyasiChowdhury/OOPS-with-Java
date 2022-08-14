package com.company;
import java.util.Scanner;
class Library
{
    private String name;
    private int  price,day;
    private double fine;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name: ");
        name=sc.nextLine();
        System.out.print("Enter price: ");
        price=sc.nextInt();
        System.out.print("Enter days: ");
        day=sc.nextInt();
    }
    void cal()
    {
        if(day<1)
            fine=0;
        else if(day<=7)
            fine=25*day;
        else if(day<=15)
            fine=40*day;
        else if(day<=30)
            fine=60*day;
        else
            fine=80*day;
        fine=fine/100;
    }
    void display()
    {
        System.out.println("Book Name: "+name+"\nPrice: "+price+"\nFine: Rs."+fine);
    }
}
public class LibraryDemo
{
    public static void main(String[] args)
    {
        Library obj=new Library();
        obj.input();
        obj.cal();
        obj.display();
    }
}