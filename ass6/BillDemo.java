package com.company;
import java.util.Scanner;
class Bill
{
    private String name;
    private int bno,call;
    private double amt;
    Bill()
    {
        name="";
        bno=0;
        call=0;
    }
    Bill(String name,int bno,int call)
    {
        this.name=name;
        this.bno=bno;
        this.call=call;
    }
    void calculate()
    {
        if(call<=100)
            amt=call*0.6;
        else if(call<=200)
            amt=100*0.6+(call-100)*0.8;
        else if(call<=300)
            amt=100*0.6+100*0.8+(call-200)*1.2;
        else
            amt=100*0.6+100*0.8+100*1.2+(call-300)*1.5;
        amt=amt+125;
    }
    void display()
    {
        System.out.println("\nName : "+name);
        System.out.println("Bill Number : "+bno);
        System.out.println("Call : "+call);
        System.out.println("Amount : "+amt);
    }
}
public class BillDemo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        String name=sc.nextLine();
        System.out.println("Enter Bill Number:");
        int bno=sc.nextInt();
        System.out.println("Enter No. of calls:");
        int call=sc.nextInt();
        Bill obj=new Bill(name,bno,call);
        obj.calculate();
        obj.display();
    }
}