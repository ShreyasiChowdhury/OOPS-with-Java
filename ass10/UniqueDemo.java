package com.company;
import java.util.Scanner;
class Unique
{
    String str;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        str=sc.next();
        str=str.toUpperCase();
    }
    boolean check()
    {
        int[] freq=new int[91];
        for(int i=0;i<str.length();i++)
            freq[str.charAt(i)]++;
        for(int i=65;i<91;i++)
        {
            if(freq[i]>1)
                return false;
        }
        return true;
    }
    void printResult()
    {
        if(check())
            System.out.println(str+" is an Unique Word");
        else
            System.out.println(str+" is not an Unique Word");
    }
}
class UniqueDemo
{
    public static void main(String[] args)
    {
        Unique obj=new Unique();
        obj.input();
        obj.printResult();
    }
}
