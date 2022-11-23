package com.company;
import java.util.Scanner;
class City {
    Scanner sc=new Scanner(System.in);
    int size=10;
    String[] city=new String[size];
    String[] std=new String[size];
    void input()
    {
        System.out.println("Enter "+size+" cities and their STD codes:");
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter City Name: ");
            city[i]=sc.nextLine();
            System.out.print("Enter its STD Code: ");
            std[i]=sc.nextLine();
        }
    }
    void search()
    {
        System.out.println("Enter the city name to be searched:");
        String name=sc.nextLine();
        int pos;
        for(pos=0;pos<size;pos++)
        {
            if(name.compareToIgnoreCase(city[pos])==0)
                break;
        }
        if(pos<size)
        {
            System.out.println("Search Successful");
            System.out.println("City: "+city[pos]);
            System.out.println("STD Code: "+std[pos]);
        }
        else
        {
            System.out.println("Search unsuccessful, no such city in the list");
        }
    }
}
class CityDemo {
    public static void main(String[] args) {
        City obj=new City();
        obj.input();
        obj.search();
    }
}
