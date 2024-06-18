public class test {

    public static long binaryArray[] = new long[1000];
    public static long n;

    public static void convertToInt(long array[]) {
        String b = "0b";
        for (int i = 0; i < array.length; i++) {
            b = b+String.valueOf(array[i]);
        }
        n=Long.parseLong(Long.toBinaryString(n));
    }

    public static void reverseIntArray(long array[]) {
        binaryArray = array;
        long temp, i = 0;
        int left = 0, right;
        right = binaryArray.length - 1 - left;
        while (left < right) {
            temp = binaryArray[left];
            binaryArray[left] = binaryArray[right];
            binaryArray[right] = temp;
            left++;
        }
        System.out.println();
        System.out.println("Reversed array");
        for (int j = 0; j <binaryArray.length; j++) {
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

        n = 14;
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
n: 14

Binary Array before reversal: 
0 1 1 1 

Reversed array
1 0 1 1 

Value of n after conversion: 
n: 1110

BUILD SUCCESSFUL (total time: 0 seconds)
