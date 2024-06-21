/**
 *
 * @author shruti.kuvekar
 */
public class Approach1 {

    public static int findFactorial(int a) {
        int fact = 1;
        while(a>1){
             fact*=a;
             a--;
        }
        return fact;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("The factorial of " + n + " is " + findFactorial(n));
        
    }
}


output:
run:
The factorial of 5 is 120
BUILD SUCCESSFUL (total time: 0 seconds)
