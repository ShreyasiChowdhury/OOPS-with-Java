package com.company;
import java.util.Scanner;
class Honda
{
    private int type,cost;
    private double new_cost;
    void getType()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter stroke number (2 or 4): ");
        type=sc.nextInt();
        System.out.print("Enter previous cost: ");
        cost=sc.nextInt();
    }
    void find()
    {
        if(type==2)
            new_cost=(cost*0.1)+cost;
        if(type==4)
            new_cost=(cost*0.12)+cost;
    }
    void printCost()
    {
        System.out.println("Type: "+type+"\nNew Cost: "+new_cost);
    }
}
public class HondaDemo
{
    public static void main(String[] args)
    {
        Honda obj=new Honda();
        obj.getType();
        obj.find();
        obj.printCost();
    }
}