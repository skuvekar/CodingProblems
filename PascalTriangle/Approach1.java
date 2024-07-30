//TimeComplexity On^2
//PascalTriangle binomial Coefficient approach
//Each number in the triangle is calculated and printed using the formula (i – j) / (j + 1), where i is the row number and j is the column number.
public class Approach1 {
    
    public static void pascal(int rows){
        for(int i =0; i<rows; i++){
            int number =1;
            for(int j=0; j<rows-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print(number+" ");
                number=number*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        pascal(5);
    }
}
