
/**
 * Check if a number is Prime
 * @author ashish
 */
public class Prime {

    /**
     * Check if number is prime
     * @param n
     * @return boolean
     */
    public static boolean isPrime(int n)
    {
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }

        return true;

    }
    public static void main(String[] args) {

        System.out.println(isPrime(11));
    }
}
