package com.company;
import java.util.Scanner;
class Sort
{
    Scanner sc=new Scanner(System.in);
    private int[] arr = new int[10];
    int n=arr.length;
    void inputArray()
    {
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++)
        {
            this.arr[i]=sc.nextInt();
        }
        arrange();
    }
    void arrange()
    {
        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min])
                    min=j;
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        printArray();
    }
    void printArray()
    {
        System.out.println("Sorted array is:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        binarySearch();
    }
    void binarySearch()
    {
        System.out.print("Enter the value to be searched: ");
        int key=sc.nextInt();
        int low=0,high=n-1,mid=(low+high)/2;
        while(low<=high)
        {
            if(arr[mid]<key)
                low=mid+1;
            else if(arr[mid]==key)
            {
                System.out.println(key+" found at "+(mid+1)+" location");
                break;
            }
            else
                high=mid-1;
            mid=(low+high)/2;
        }
        if(low>high)
            System.out.println(key+" not found");
    }
}
public class SortDemo
{
    public static void main(String[] args)
    {
        Sort obj=new Sort();
        obj.inputArray();
    }
}