package com.company;
import java.util.Scanner;
class SpecialPalin
{
    String str;
    int n;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        str=sc.next();
        str=str.toUpperCase();
        n=str.length();
    }
    void checkSpecial()
    {
        if(str.charAt(0)==str.charAt(n-1))
            System.out.println(str+" is Special");
        else
            System.out.println(str+" is not Special");
    }
    void checkPalindrome()
    {
        String rev="";
        for(int i=n-1;i>=0;i--)
            rev+=str.charAt(i);
        if(str.equals(rev.toUpperCase()))
            System.out.println(str+" is Palindrome");
        else
            System.out.println(str+" is not Palindrome");
    }
}
public class SpecialPalinDemo
{
    public static void main(String[] args)
    {
        SpecialPalin obj=new SpecialPalin();
        obj.input();
        obj.checkSpecial();
        obj.checkPalindrome();
    }
}