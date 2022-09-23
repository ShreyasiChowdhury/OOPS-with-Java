package mathcal.mathcheck;
import java.lang.Math;
public class Prime
{
    public static int isPrime(double n)
    {
        if(n<=1)
            return 0;
        else if(n==2)
            return 1;
        else if(n%2==0)
            return 0;
        for(int i=3;i<=Math.sqrt(n);i+=2)
        {
            if(n%i==0)
                return 0;
        }
        return 1;
    }
}
