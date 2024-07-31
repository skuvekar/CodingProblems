//my approach

public class Approach1 {

    public static int fibonacci(int n) {
        int n1 = 0, n2 = 1, sum=0;
        for (int i = 0; i < n; i++) {
            int n3 = n1 + n2;
            System.out.println(n1 + " ");
            sum = sum+n1;
            n1 = n2;
            n2 = n3;
        }
        return sum;
    }

    public static void main(String[] args) {
        int fibonacci = fibonacci(10);
        System.out.println(fibonacci);
    }
}
