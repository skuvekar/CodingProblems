/**
 *
 * @author shruti.kuvekar
 */
public class Approach1 {

    public static void addComplexNumbers(String a, String b) {
        int ArealNumber  = Integer.parseInt(a.split("\\+")[0].trim());
        int AimaginaryNumber = Integer.parseInt(a.split("\\+")[1].split("i")[0]);
        int BrealNumber  = Integer.parseInt(b.split("\\+")[0].trim());
        int BimaginaryNumber = Integer.parseInt(b.split("\\+")[1].split("i")[0]);
        System.out.println(ArealNumber);
        System.out.println(AimaginaryNumber);
        System.out.println(BrealNumber);
        System.out.println(BimaginaryNumber);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Acomplexnumber = "";
        String Bcomplexnumber = "";
        System.out.print("\nEnter complex number a : ");
        Acomplexnumber = sc.nextLine();
        System.out.println("\nEnter complex number b : ");
        Bcomplexnumber = sc.nextLine();
        
        addComplexNumbers(Acomplexnumber, Bcomplexnumber);

    }
}
