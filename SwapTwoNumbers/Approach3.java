//using binary operator xor
//reference link : https://www.geeksforgeeks.org/java-program-to-swap-two-numbers/?_gl=1*535k7i*_ga*d21JTTBFeU80QU84QW1FTzYwZnBRLW5oRGZ5WGhGS1FpaXhtSl8yZkFuejhVWTNsR1k4MF9vNW5TU0VwSmo3cQ..*_ga_E752F18V9F*MTcxNzk0ODM0MC4yLjEuMTcxNzk0ODM0MC4wLjAuMA..
public class Approach3 {
    public static void main(String[] args) {
        int a=10, b =15;
        
        System.out.println("Value of a and b before swapping: ");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println();
        
        a= a^b;
        b=a^b;
        a=a^b;
        
        System.out.println("Value of a and b after swapping: ");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        
    }
   
}
