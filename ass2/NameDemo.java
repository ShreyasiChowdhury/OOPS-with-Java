package com.company;
import java.util.Scanner;
class Name
{
    private String name;
    void setName(String name)
    {
        this.name=name;
    }
    String nameFormat()
    {
        int flag=0,index1=name.indexOf(' ');
        char first=Character.toUpperCase(name.charAt(0));
        String last=name.substring(index1+1,name.length());
        for(int i=0;i<last.length();i++)
        {
            if(last.charAt(i)==' ')
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            int index2=last.indexOf(' ');
            char middle=Character.toUpperCase(last.charAt(0));
            String surname=last.substring(index2+1,last.length());
            surname=surname.substring(0,1).toUpperCase()+surname.substring(1).toLowerCase();
            return first+". "+middle+". "+surname;
        }
        else
            return first+". "+last;
    }
    public String toString()
    {
        return "Name after formatting : "+nameFormat();
    }
}
public class NameDemo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter full name:");
        String name=sc.nextLine();
        Name n=new Name();
        n.setName(name);
        System.out.println(n);
    }
}