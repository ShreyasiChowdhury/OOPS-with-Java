package com.company;
import java.util.Scanner;

public class Palindrome
{
    static boolean check(String s)
    {
        int n=s.length();
        for(int i=0;i<n;i++,n--)
        {
            if(s.charAt(i)!=s.charAt(n-1))
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input:");
        String str=sc.nextLine();
        str=str.toUpperCase();
        str=str+" ";
        StringBuilder word=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch!=' ')
            {
                word.append(ch);
            }
            else
            {
                if(check(word.toString()))
                    System.out.println(word);
                word=new StringBuilder();
            }
        }
    }
}