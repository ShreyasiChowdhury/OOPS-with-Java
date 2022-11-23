package com.company;
import java.util.Scanner;
public class Longest
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input:");
        String str=sc.nextLine();
        String[] words=str.split(" ");
        int len=0;
        String output="";
        for(String word:words)
        {
            if(len<word.length())
            {
                len=word.length();
                output=word;
            }
        }
        System.out.println("The longest word: "+output);
        System.out.println("The length of the word: "+len);
    }
}