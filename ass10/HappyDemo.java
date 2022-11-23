package com.company;
import java.util.Scanner;

class Happy {
    String str;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        str=sc.next();
        str=str.toUpperCase();
    }
    int sumDigit(int num)
    {
        int sum=0,d;
        while(num>0)
        {
            d=num%10;
            sum+=d*d;
            num/=10;
        }
        return sum;
    }
    boolean check()
    {
        StringBuilder pos=new StringBuilder();
        int num;
        for(int i=0;i<str.length();i++)
        {
            num=((int)str.charAt(i))-64;
            pos.append(num);
        }
        num=Integer.parseInt(pos.toString());
        int sum=sumDigit(num);
        while(sum>9)
        {
            sum=sumDigit(sum);
        }
        return sum == 1;
    }
    void printResult()
    {
        if(check())
            System.out.println(str+" is a Happy Word");
        else
            System.out.println(str+" is not a Happy Word");
    }
}
class HappyDemo {
    public static void main(String[] args) {
        Happy obj = new Happy();
        obj.input();
        obj.printResult();
    }
}