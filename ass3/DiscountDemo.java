package com.company;
import java.util.Scanner;
class Discount
{
    private int cost;
    private String name;
    private double dc,amt;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter cost of the Article: ");
        this.cost=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name of the Customer: ");
        this.name=sc.nextLine();
        cal();
    }
    void cal()
    {
        if(cost<=5000)
            dc=0;
        else if(cost<=10000)
            dc=cost*0.1;
        else if(cost<=15000)
            dc=cost*0.15;
        else
            dc=cost*0.2;
        amt=cost-dc;
    }
    void display()
    {
        System.out.println("Name\tCost\tDiscount\tPayable Amount");
        System.out.println(name+"\t"+cost+"\t"+dc+"\t"+amt);
    }
}
public class DiscountDemo
{
    public static void main(String[] args)
    {
        Discount obj=new Discount();
        obj.input();
        obj.display();
    }
}