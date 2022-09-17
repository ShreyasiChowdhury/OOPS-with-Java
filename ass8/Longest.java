package com.company;
import java.util.Scanner;
public class Longest
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input:");
        String str=sc.nextLine();
        String parts[]=str.split(" ");
        int max=parts[0].length();
        String output=parts[0];
        for(int i=1;i<parts.length;i++)
        {
            if(parts[i].length()>max)
            {
                max=parts[i].length();
                output=parts[i];
            }
        }
        System.out.println("The longest word: "+output);
        System.out.println("The length of the word: "+max);
    }
}