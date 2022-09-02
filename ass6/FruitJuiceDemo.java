package com.company;
import java.util.Scanner;
class FruitJuice
{
    private int product_code,pack_size,product_price;
    private String flavour,pack_type;
    FruitJuice()
    {
        product_code=0;
        pack_size=0;
        product_price=0;
        flavour="";
        pack_type="";
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter product code:");
        product_code=sc.nextInt();
        System.out.println("Enter flavour:");
        flavour=sc.next();
        System.out.println("Enter pack type:");
        pack_type=sc.next();
        System.out.println("Enter pack size:");
        pack_size=sc.nextInt();
        System.out.println("Enter product price:");
        product_price=sc.nextInt();
    }
    void discount()
    {
        product_price=product_price-(int)(product_price*0.1);
    }
    void display()
    {
        System.out.println("Product Code : "+product_code);
        System.out.println("Flavour : "+flavour);
        System.out.println("Pack Type : "+pack_type);
        System.out.println("Pack Size : "+pack_size);
        System.out.println("Product Price : "+product_price);
    }
}
public class FruitJuiceDemo
{
    public static void main(String[] args)
    {
        FruitJuice obj=new FruitJuice();
        obj.input();
        obj.discount();
        obj.display();
    }
}