import mathcal.*;
import mathcal.mathcheck.*;
class Cal
{
    public static void main(String[] args)
    {
        System.out.println("Factorial: "+FactGCD.calFactorial(5));
        System.out.println("GCD: "+FactGCD.calGCD(5,15));
        int num=8;
        if(Prime.isPrime(num)==1)
            System.out.println(num+" is prime");
        else
            System.out.println(num+" is not prime");
    }
}
