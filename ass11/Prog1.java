package com.company;

public class Prog1
{
    public static void main(String[] args)
    {
        try {
            int arr[] = {1, 2, 3, 4, 5};
            System.out.println(arr[5]);
            try {
                System.out.println(5/0);
            }
            catch (ArithmeticException e1) {
                System.out.println("Cause is: " + e1.getMessage());
            }
            catch (Exception e2) {
                System.out.println("This is exception");
            }
        }
        catch (ArrayIndexOutOfBoundsException e3) {
            System.out.println("Maintain array size");
        }
    }
}
