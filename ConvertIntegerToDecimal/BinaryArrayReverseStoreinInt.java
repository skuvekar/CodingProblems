//code to reverse the binary array of int datatype and store the reversed bits of the array in an int variable

public class BinaryArrayReverseStoreinInt {

    public static void main(String[] args) {
//        int[] binaryArray = {1, 0, 1, 1, 0}; // Example binary array
        int[] binaryArray = {0, 1, 0, 1}; // Example binary array

        // Step 1: Reverse the binary array
        reverseArray(binaryArray);

        // Step 2: Convert the reversed array to an integer in binary format
        int reversedBinary = Integer.parseInt(Integer.toBinaryString(convertToBinary(binaryArray)));

        // Output the result in binary format
//        System.out.println("Reversed Binary: " + Integer.toBinaryString(reversedBinary));
        System.out.println("Reversed Binary: " + reversedBinary);
    }

    private static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    private static int convertToBinary(int[] array) {
        int result = 0;
        for (int bit : array) {
            result = (result << 1) | bit;
            System.out.println(result);
        }
        return result;
    }
}
