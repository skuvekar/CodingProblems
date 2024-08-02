//TimeComplexity-> On^2
//PascalTriangle using recursion and nCr formula
//nCr=n!/((n-r)!*r!)
public class Approach2 {

    //dataype changed from int to long to be able to calculate for large numbers
    public static long factorial(long num) {
        long fact = 1;
        if (long == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static void pascal(int number) {
        for (int i = 0; i <= number; i++) {
            int n=1;
            for (int j = 0; j <= number - i; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j <= i; j++) {
                n=factorial(i)/(factorial(i-j)*factorial(j));
                System.out.print(n+"      ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pascal(5);
    }
}
