import java.lang.Math;

public class Gcd {
    public static int findGcd(int num1, int num2)
    {
        int end = Math.min(num1, num2);
        int gcd = 0;

        for(int i=1; i<end; i++)
        {
            if((num1 % i == 0) && (num2 % i == 0))
            {
                gcd = i;
            }
        }

        return gcd;
    }
    public static void main(String args[])
    {
        System.out.println(findGcd(18, 45));
    }
}
