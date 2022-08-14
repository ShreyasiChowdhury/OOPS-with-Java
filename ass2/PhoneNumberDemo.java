package com.company;
import java.util.Scanner;
class PhoneNumber
{
    private long phnum;
    private String lname, fname;
    void setPhNum(long phnum,String lname,String fname)
    {
        this.phnum=phnum;
        this.lname=lname;
        this.fname=fname;
    }
    long getPhNum()
    {
        return phnum;
    }
    String getLName()
    {
        return lname;
    }
    String getFName()
    {
        return fname;
    }
    public String toString()
    {
        return "Last Name : "+getLName()+"\nFirst Name : "+getFName()+
                "\nPhone Number : "+getPhNum();
    }
}
public class PhoneNumberDemo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter phone number: ");
        long phnum=sc.nextLong();
        System.out.print("Enter last name: ");
        String lname=sc.next();
        System.out.print("Enter first name: ");
        String fname=sc.next();
        PhoneNumber p=new PhoneNumber();
        p.setPhNum(phnum,lname,fname);
        System.out.println(p);
    }
}