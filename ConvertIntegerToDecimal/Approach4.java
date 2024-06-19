/**
 *
 * @author shruti.kuvekar
 */
public class Approach4 {
    public static long n;
    public static void convertDecimalToBinary(long a){
        String b = "";
        long rem = 0;
        while(a!=0){
        rem = a % 2;
        b = String.valueOf(rem)+b;
        a/=2;
        }
        n = Long.parseLong(b);    
    }
    public static void main(String[] args) {
        n = 18; 
        
        System.out.println("Value of n before conversion: ");
        System.out.println(n);
        System.out.println();
        
        convertDecimalToBinary(n);
        
        System.out.println("Value of n after conversion: ");
        System.out.println(n);
        System.out.println();
    }
}


output: 
run:
Value of n before conversion: 
18

Value of n after conversion: 
10010

BUILD SUCCESSFUL (total time: 0 seconds)
