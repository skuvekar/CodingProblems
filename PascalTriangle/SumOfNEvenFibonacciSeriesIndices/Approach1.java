//Finding sum of first n even indices in the Fibonacci series

public class Approach1 {

    public static int fibonacci(int n) {
        int fibArr[] = new int[(n * 2)];
        fibArr[0] = 0;
        fibArr[1] = 1;
        int n1 = 0, n2 = 1, n3 = 0, sum = 0;
        for (int i = 2; i < (n * 2); i++) {
            n3 = n1 + n2;
            fibArr[i] = n3;
            n1 = n2;
            n2 = n3;

            if (i % 2 == 0) {
                sum = sum + fibArr[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int fibonacci = fibonacci(5);
        System.out.println(fibonacci);
    }
}
