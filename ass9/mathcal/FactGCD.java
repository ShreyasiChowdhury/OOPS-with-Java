package mathcal;
public class FactGCD
{
    public static double calFactorial(double num)
    {
        if(num<=1)
            return 1;
        else
            return num*calFactorial(num-1);
    }
    public static double calGCD(double a,double b)
    {
        int gcd=1;
        for(int i=1;i<=a && i<=b;i++)
        {
            if(a%i==0 && b%i==0)
                gcd=i;
        }
        return gcd;
    }
}
