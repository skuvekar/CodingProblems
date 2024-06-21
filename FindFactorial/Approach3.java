/**
 *
 * @author shruti.kuvekar
 */
public class Approach3 {

    public static long findFactorial(long a) {
        long fact = a==0 ? 1 : a*findFactorial(a-1) ;
        return fact;
    }

    public static void main(String[] args) {
        long n = 20;
        System.out.println("The factorial of " + n + " is " + findFactorial(n));

    }
}


output:
run:
The factorial of 20 is 2432902008176640000
BUILD SUCCESSFUL (total time: 0 seconds)
