//using arithmetic operators
public class Approach4 {
    public static void main(String[] args) {
        int a=10, b =15;
        
        System.out.println("Value of a and b before swapping: ");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println();
        
        a = (a+b)-(b=a);
        
        System.out.println("Value of a and b after swapping: ");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        
    }
   
}
