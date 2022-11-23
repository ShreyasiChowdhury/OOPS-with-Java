package com.company;
import java.util.Scanner;
public class MaxVowel
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input:");
        String str=sc.nextLine();
        str=str.toUpperCase();
        String word="";
        int max=0;
        for(String s:str.split(" "))
        {
            int count=0;
            for(char ch: s.toCharArray())
            {
                if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                    count++;
            }
            if(count>max)
            {
                max=count;
                word=s;
            }
        }
        System.out.println("The word having maximum vowel: "+word);
        System.out.println("The number of vowels in the word: "+max);
    }
}
