package com.company;
import java.util.Scanner;

class Consecutive {
    String str;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        str=sc.nextLine();
        str=str.toUpperCase();
        str+=" ";
    }
    void check()
    {
        String word="";
        int count=0;
        int n=str.length();
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i)==' ')
            {
                int len=word.length();
                for(int j=0;j<len-1;j++)
                {
                    if(word.charAt(j)+1==word.charAt(j+1))
                    {
                        count++;
                        System.out.println(word);
                        break;
                    }
                }
                word="";
            }
            else
            {
                word+=str.charAt(i);
            }
        }
        System.out.println("Number of words containing consecutive letters: "+count);
    }
}

class ConsecutiveDemo {
    public static void main(String[] args) {
        Consecutive obj = new Consecutive();
        obj.input();
        obj.check();
    }
}