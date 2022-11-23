package com.company;
import java.util.Scanner;
public class Reverse
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input:");
        String str=sc.nextLine();
        str=str.toUpperCase();
        StringBuilder rev= new StringBuilder();
        String[] s=str.split(" ");
        for (String word:s)
            rev.insert(0, word + " ");
        System.out.println("Reversed sentence:\n"+rev);
    }
}
