//improved version of Approach1
/**
 *
 * @author shruti.kuvekar
 */
public class Approach5 {

    public static long n;
    public static long binaryArray[] = new long[32];

    public static void changeVariableValue(long array[]) {
        long temp = n;
        n = 0;
        String b = "";
        for (long bit : array) {
            b = b+((n << 1) | bit);
        }
        System.out.println("32-bit binary format of "+temp+" is:");
        System.out.println(b);
        System.out.println();
        
        n = Long.parseLong(b);

    }

    public static void convertDecimalToBinary(long a) {
        long rem = 0;
        int i = 31;
        while (a != 0) {
            binaryArray[i] = a % 2;
            a /= 2;
            i--;
        }

        System.out.println("Binary Array: ");
        for (int j = 0; j < binaryArray.length; j++) {
            System.out.print(binaryArray[j] + " ");
        }
        System.out.println();
        System.out.println();
        
        changeVariableValue(binaryArray);
    }

    public static void main(String[] args) {
        n = 17;
        
        System.out.println("Value of n before conversion:");
        System.out.println(n);
        System.out.println();
        
        convertDecimalToBinary(n);
        
        System.out.println("Value of n after conversion:");
        System.out.println(n);
        System.out.println();
    }
}


output:
run:
Value of n before conversion:
17

Binary Array: 
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 1 

32-bit binary format of 17 is:
00000000000000000000000000010001

Value of n after conversion:
10001

BUILD SUCCESSFUL (total time: 0 seconds)
