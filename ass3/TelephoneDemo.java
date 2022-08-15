package com.company;
import java.util.Scanner;
class Telephone
{
    private int prv,pre,call;
    private String name;
    private double amt,total;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter previous meter reading: ");
        this.prv=sc.nextInt();
        System.out.println("Enter present meter reading: ");
        this.pre=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name of the Customer: ");
        this.name=sc.nextLine();
        cal();
    }
    void cal()
    {
        call=pre-prv;
        amt=0;
        if(call<=100)
            amt=0;
        else if(call<=200)
            amt=amt+90*(call-100);
        else if(call<=400)
            amt=amt+90*100+80*(call-200);
        else
            amt=amt+90*100+80*200+70*(call-400);
        amt=amt/100;
        total=180+amt;
    }
    void display()
    {
        System.out.println("Name\tCalls made\tPayable Amount");
        System.out.println(name+"\t"+call+"\t"+total);
    }
}
public class TelephoneDemo
{
    public static void main(String[] args)
    {
        Telephone obj=new Telephone();
        obj.input();
        obj.display();
    }
}