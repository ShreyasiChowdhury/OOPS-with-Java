package com.company;
import java.util.Scanner;
public class Asterisk
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input:");
        String str=sc.nextLine();
        str=str.toUpperCase();
        char[] vowels={'A','E','I','O','U'};
        for(char ch:vowels)
        {
            str=str.replace(ch,'*');
        }
        System.out.println("Output:\n"+str);
    }
}