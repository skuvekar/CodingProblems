/**
 *
 * @author shruti.kuvekar
 */
//self created solution
public class Approach1 {

   public static String addComplexNumbers(String a, String b) {
        float ArealNumber  = Float.parseFloat(a.split("\\+")[0].trim());
        float AimaginaryNumber = Float.parseFloat(a.split("\\+")[1].split("i")[0]);
        float BrealNumber  = Float.parseFloat(b.split("\\+")[0].trim());
        float BimaginaryNumber = Float.parseFloat(b.split("\\+")[1].split("i")[0]);

        float resultReal = ArealNumber+BrealNumber;
        float resultImaginary = AimaginaryNumber+BimaginaryNumber;
        
        return resultReal+" + "+resultImaginary+"i";
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Acomplexnumber = "";
        String Bcomplexnumber = "";
        System.out.print("\nEnter complex number a : ");
        Acomplexnumber = sc.nextLine();
        System.out.print("\nEnter complex number b : ");
        Bcomplexnumber = sc.nextLine();
        
        System.out.println();
        System.out.println("The result is as follows: ");
        System.out.println("("+Acomplexnumber+") + ("+Bcomplexnumber+") = "+addComplexNumbers(Acomplexnumber, Bcomplexnumber));

    }
}


output:
run:

Enter complex number a : 2+3i

Enter complex number b : 4+4i

The result is as follows: 
(2+3i) + (4+4i) = 6.0 + 7.0i
BUILD SUCCESSFUL (total time: 16 seconds)

