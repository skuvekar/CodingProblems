public class Approach2{
    public static void main(String [] args){
        int a=10, b=15, temp; 
        
        System.out.println("Value of a and b before swapping: ");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println();
        
        temp = a;
        a = b;
        b = temp;
        
        System.out.println("Value of a and b after swapping: ");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
         
    }
}
