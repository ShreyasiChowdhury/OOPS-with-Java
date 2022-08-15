package com.company;
import java.util.Scanner;
class Time
{
    private int sec,min,hr;
    void setSeconds(int sec)
    {
        this.sec=sec;
    }
    void calFormat()
    {
        hr=sec/3600;
        min=(sec-(hr*3600))/60;
        sec=sec-(hr*3600)-(min*60);
    }
    void printFormat()
    {
        System.out.println("Hours : "+hr+"\nMinutes : "+min+"\nSeconds :"+sec);
    }
}
public class TimeDemo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter time in seconds: ");
        int sec=sc.nextInt();
        Time t=new Time();
        t.setSeconds(sec);
        t.calFormat();
        t.printFormat();
    }
}