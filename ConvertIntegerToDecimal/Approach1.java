//Version 1.0
/**
 *
 * @author shruti.kuvekar
 */
public class Approach1 {

    public static long binaryArray[] = new long[1000];
    public static long n;

    public static void convertToInt(long array[]) {
        String b = "";
        for (int i = 0; i < array.length; i++) {
            b = b + String.valueOf(array[i]);
        }
        n = Long.parseLong(b);
    }

    public static void reverseIntArray(long array[]) {
        binaryArray = array;
        long temp, i = 0;
        int left = 0, right = binaryArray.length - 1;
        while (left < right) {
            temp = binaryArray[left];
            binaryArray[left] = binaryArray[right];
            binaryArray[right] = temp;
            left++;
            right = right - left;

        }
        System.out.println();
        System.out.println("Reversed array");
        for (int j = 0; j < binaryArray.length; j++) {
            System.out.print(binaryArray[j] + " ");
        }
        System.out.println();
    }

    public static void convertDecimalToBinary(long n) {

        long a = n;

        int i = 0;
        while (a > 0) {
            binaryArray[i] = a % 2;
            a = a / 2;
            i++;
        }

        System.out.println("Binary Array before reversal: ");
        for (int k = 0; k < i; k++) {
            System.out.print(binaryArray[k] + " ");
        }
        System.out.println();

        reverseIntArray(Arrays.copyOf(binaryArray, i));
        convertToInt(binaryArray);
    }

    public static void main(String[] args) {

        n = 9;
        System.out.println("Value of n before conversion: ");
        System.out.println("n: " + n);
        System.out.println();
        convertDecimalToBinary(n);

        System.out.println();
        System.out.println("Value of n after conversion: ");
        System.out.println("n: " + n);
        System.out.println();

    }

}

output:
run:
Value of n before conversion: 
n: 9

Binary Array before reversal: 
1 0 0 1 

Reversed array
1 0 0 1 

Value of n after conversion: 
n: 1001

BUILD SUCCESSFUL (total time: 0 seconds)


//Improvements version 1.1:
/**
 *
 * @author shruti.kuvekar
 */
public class test {

    public static long n;
    public static long binaryArray[] = new long[1000];

    public static void changeToOriginalVariable(long array[]) {
        binaryArray = array;
        String b = "";
        for (int i = binaryArray.length-1; i >= 0; i--) {
            b = b+String.valueOf(binaryArray[i]);
        }
        n = Long.parseLong(b);
    }

    public static void convertIntegerToDecimal(long n) {
        int i = 0;
        while (n != 0) {
            binaryArray[i] = n % 2;
            n = n / 2;
            i++;
        }
        
        changeToOriginalVariable(Arrays.copyOf(binaryArray, i));
    }

    public static void main(String[] args) {
        n = 8;
        System.out.println();
        System.out.println("Value of n before conversion: "+n);
        System.out.println();
        convertIntegerToDecimal(n);
        System.out.println("Value of n after conversion: "+n);
        System.out.println();
    }
}

//output:
run:

Value of n before conversion: 8

Value of n after conversion: 1000

BUILD SUCCESSFUL (total time: 0 seconds)

