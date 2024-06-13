public class Approach1 {

    public static int binaryArray[] = new int[1000];
    public static int n;

    public static void convertToInt(int array[]) {
        String b = "0b";
        for (int i = 0; i < array.length; i++) {
            b = b+String.valueOf(array[i]);
        }
        n=Integer.parseInt(Integer.toBinaryString(n));
    }

    public static void reverseIntArray(int array[]) {
        binaryArray = array;
        int temp, i = 0, left = 0, right;
        right = binaryArray.length - 1 - left;
        while (left < right) {
            temp = binaryArray[left];
            binaryArray[left] = binaryArray[right];
            binaryArray[right] = temp;
            left++;
        }
        System.out.println();
        System.out.println("Reversed array");
        for (int j = 0; j < binaryArray.length; j++) {
            System.out.print(binaryArray[j] + " ");
        }
        System.out.println();
    }

    public static void convertDecimalToBinary(int n) {

        int a = n;

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

        n = 10;
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
