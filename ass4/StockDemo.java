package com.company;
import java.util.Scanner;
class Stock
{
    private String title,author,pub;
    private int noc;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter details of stocked books::");
        System.out.println("Enter title of the book: ");
        title=sc.nextLine();
        System.out.println("Enter name of the author: ");
        author=sc.nextLine();
        System.out.println("Enter name of the publisher: ");
        pub=sc.nextLine();
        System.out.println("Enter no. of copies: ");
        noc=sc.nextInt();
    }
    void purchase(String t,String a,String p,int n)
    {
        if(!title.equalsIgnoreCase(t) || !author.equalsIgnoreCase(a) || !pub.equalsIgnoreCase(p))
            System.out.println("\nOut of Stock!");
        else
        {
            if(noc<n)
            {
                    System.out.println("\n"+noc+" copies are available. Thanks for coming!");
                    noc=0;
                    System.out.println("\nCopies remaining: "+noc);
            }
            else
            {
                    System.out.println("\nBook available. Glad to serve you. Thanks for coming!");
                    noc=noc-n;
                    System.out.println("\nCopies remaining: "+noc);
            }
        }
    }
}
public class StockDemo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String t,a,p;
        int n;
        Stock obj = new Stock();
        obj.getData();
        System.out.println("\nEnter details of book to check and sell::");
        System.out.println("Enter title of the book: ");
        t=sc.nextLine();
        System.out.println("Enter name of the author: ");
        a=sc.nextLine();
        System.out.println("Enter name of the publisher: ");
        p=sc.nextLine();
        System.out.println("Enter no. of copies: ");
        n=sc.nextInt();
        obj.purchase(t,a,p,n);
    }
}
