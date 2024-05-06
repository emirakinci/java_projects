// this programme finds the prime numbers inside an array

public class Primes {

    public static boolean findPrime(int number){
        
        for(int i=2; i<number; i++)
        {
            if(number % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        boolean result;
        int arr[] = {19, 8, 15, 27};

        for(int i=0; i<arr.length; i++)
        {
            result = findPrime(arr[i]);
            System.out.println(arr[i] + ": " + result);
        }
    }
}