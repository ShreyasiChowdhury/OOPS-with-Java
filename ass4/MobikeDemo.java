package com.company;
import java.util.Scanner;
class Mobike
{
    private int bno,days,charge;
    private long phno;
    private String name;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter customer's name: ");
        name=sc.nextLine();
        System.out.print("Enter bike number: ");
        bno=sc.nextInt();
        System.out.print("Enter phone number: ");
        phno=sc.nextLong();
        System.out.print("Enter days of rent: ");
        days=sc.nextInt();
    }
    void compute()
    {
        if(days<1)
            charge = 0;
        else if(days<=5)
            charge = 500*days;
        else if(days<=10)
            charge = 500*5 + 400*(days-5);
        else
            charge = 500*5 + 400*5 + 200*(days-10);
    }
    void display()
    {
        System.out.println("Bike No.\tPhone No.\tName\tNo. of days\tCharge");
        System.out.println(bno+"\t"+phno+"\t"+name+"\t"+days+"\t"+charge);
    }
}
public class MobikeDemo
{
    public static void main(String[] args)
    {
        Mobike obj = new Mobike();
        obj.input();
        obj.compute();
        obj.display();
    }
}
