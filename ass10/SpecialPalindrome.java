package com.company;
import java.util.Scanner;
class SpecialPalindrome
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
        StringBuilder rev= new StringBuilder();
        for(int i=n-1;i>=0;i--)
            rev.append(str.charAt(i));
        if(str.equals(rev.toString().toUpperCase()))
            System.out.println(str+" is Palindrome");
        else
            System.out.println(str+" is not Palindrome");
    }
}
class SpecialPalindromeDemo
{
    public static void main(String[] args)
    {
        SpecialPalindrome obj=new SpecialPalindrome();
        obj.input();
        obj.checkSpecial();
        obj.checkPalindrome();
    }
}