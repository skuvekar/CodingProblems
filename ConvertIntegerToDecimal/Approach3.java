/**
 *
 * @author shruti.kuvekar
 */
public class Approach3 {

    public static long ConvertDecimalToBinary(long a) {
        int cnt = 0;
        long rem = 0;
        long binary = 0;
        while (a != 0) {
            rem = a % 2;
            double tens = Math.pow(10, cnt);
            binary += (long) (rem * tens);
            a /= 2;
            cnt++;
        }
        return binary;
    }

    public static void main(String[] args) {
        int n = 11;
        
        long ConvertDecimalToBinary = ConvertDecimalToBinary(n);
        System.out.println(ConvertDecimalToBinary);

    }
}


output:

run:
Binary representation of 11 is 1011
BUILD SUCCESSFUL (total time: 0 seconds)
