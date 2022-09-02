package com.company;
import java.util.Scanner;
class Calculate
{
    private int num,f,rev;
    Calculate(){}
    Calculate(int n)
    {
        this.num=n;
        this.f=0;
        this.rev=0;
    }
    int prime()
    {
        f=1;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                f=0;
                break;
            }
        }
        return f==1?1:0;
    }
    int reverse()
    {
        int rem;
        while(num!=0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        return rev;
    }
    void display()
    {
        int temp=num;
        if(prime()==1 && reverse()==temp)
            System.out.println(temp+" is a prime palindrome number");
        else if(prime()==1)
            System.out.println(temp+" is a prime number");
        else if(reverse()==temp)
            System.out.println(temp+" is a palindrome number");
        else
            System.out.println(temp+" is not a prime palindrome number");
    }
}
public class CalculateDemo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        Calculate obj=new Calculate(n);
        obj.display();
    }
}