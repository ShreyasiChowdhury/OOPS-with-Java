package com.company;
import java.util.Scanner;
class Profit
{
    private String name;
    private double cost,price;
    private int item;
    void setDetails(String name,double cost,double price,int item)
    {
        this.name=name;
        this.cost=cost;
        this.price=price;
        this.item=item;
    }
    void getDetails()
    {
        System.out.println("Name\tCost\tPrice\tItem");
        System.out.println(name+"\t"+cost+"\t"+price+"\t"+item);
    }
    double getProfit()
    {
        double profit;
        profit=(price-cost)*item;
        return profit;
    }
    public String toString()
    {
        return "Profit = "+getProfit();
    }
}
public class ProfitDemo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter product name: ");
        String name=sc.nextLine();
        System.out.println("Enter unit cost: ");
        double cost=sc.nextDouble();
        System.out.println("Enter sale price: ");
        double price=sc.nextDouble();
        System.out.println("Enter total number of sold items: ");
        int item=sc.nextInt();
        Profit p=new Profit();
        p.setDetails(name,cost,price,item);
        p.getDetails();
        System.out.println(p);
    }
}