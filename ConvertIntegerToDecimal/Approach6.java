//improved version of Approach3
/**
 *
 * @author shruti.kuvekar
 */
public class Approach6 {

    public static long n;

    public static void convertIntToDecimal(long a) {
        long rem = 0;
        int cnt = 0;
        long result=0;

        while (a != 0) {
            rem = a % 2;
            double pow = Math.pow(10, cnt);
            result = result+(long)(pow * rem);
            a/=2;
            cnt++;
        }
        n = result;
    }

    public static void main(String[] args) {
        n = 17;

        System.out.println("Value of n before conversion:");
        System.out.println(n);
        System.out.println();

        convertIntToDecimal(n);

        System.out.println("Value of n after conversion:");
        System.out.println(n);
        System.out.println();

    }
}


output: 
run:
Value of n before conversion:
17

Value of n after conversion:
10001

BUILD SUCCESSFUL (total time: 0 seconds)
