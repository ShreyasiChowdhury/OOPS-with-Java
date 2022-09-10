package com.company;
import java.util.Scanner;
class Sale
{
    Scanner sc=new Scanner(System.in);
    String title,author,publication;
    double price;
    void input()
    {
        System.out.println("Enter Book Title:");
        title=sc.nextLine();
        System.out.println("Enter Author Name:");
        author=sc.nextLine();
        System.out.println("Enter Publication Name:");
        publication=sc.nextLine();
        System.out.println("Enter Book Price:");
        price=sc.nextDouble();
    }
    void display()
    {
        System.out.println("Book Title: "+title+"\nAuthor: "+author+
                "\nPublication: "+publication+"\nPrice: "+price);
    }
}
class Purchase extends Sale
{
    Scanner sc=new Scanner(System.in);
    int noc,amount;
    void accept()
    {
        System.out.println("Enter number of copies:");
        noc=sc.nextInt();
    }
    void calculate()
    {
        amount=noc*(int)price;
    }
    void show()
    {
        display();
        System.out.println("No. of Copies: "+noc+"\nAmount to be paid: "+amount);
    }
}
public class BookDemo
{
    public static void main(String[] args)
    {
        Purchase obj=new Purchase();
        obj.input();
        obj.accept();
        obj.calculate();
        obj.show();
    }
}