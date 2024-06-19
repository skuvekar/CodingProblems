/**
 *
 * @author shruti.kuvekar
 */
public class Approach2 {

    public static long n;

    public static void convertDecimalToBinary(long a) {
        //representing decimal in 32 bits binary format
        String b = "";
        System.out.println("Value of n after conversion in 32 bits binary format: ");
        for (int i = 32; i >= 0; i--) {
            long k;
            k = a >> i;
            if ((k & 1) > 0) {
                System.out.print(1);
                b = b + 1;
            } else {
                System.out.print(0);
                b = b + 0;
            }
        }
        System.out.println();
        n = Long.parseLong(b);
        System.out.println();
    }

    public static void main(String[] args) {
        n = 8;

        System.out.println("Value of n before conversion: ");
        System.out.println("n: " + n);
        System.out.println();

        convertDecimalToBinary(n);
        System.out.println("Value of n after conversion: ");
        System.out.println("n: " + n);
        System.out.println();

    }
}



output: 
run:
Value of n before conversion: 
n: 8

Value of n after conversion in 32 bits binary format: 
000000000000000000000000000001000

Value of n after conversion: 
n: 1000

BUILD SUCCESSFUL (total time: 0 seconds)
