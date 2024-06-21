/**
 *
 * @author shruti.kuvekar
 */
public class Approach2 {

    public static int findFactorial(int a) {
        if(a==0){
        return 1;
        }
        return a*findFactorial(a-1);
    }

    public static void main(String[] args) {
        int n = 0;
        System.out.println("The factorial of " + n + " is " + findFactorial(n));

    }
}


output:
run:
The factorial of 0 is 1
BUILD SUCCESSFUL (total time: 0 seconds)
