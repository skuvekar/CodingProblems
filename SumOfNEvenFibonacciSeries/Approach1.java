//Find Sum of Fibonacci Series Numbers of First N Even Indexes
public class Approach1 {

  public static long fibonacciSum(int n) {
      long sum=0;
      long fib [] = new long[n*2];
      fib[0]=0;
      fib[1]=1;
      for(int i =2; i<(n*2); i++){
          fib[i]=fib[i-1]+fib[i-2];
  
          if(i%2==0){
          sum = sum +fib[i];
          }
      }
      return sum;
  }
  public static void main(String[] args) {
      long fibonacci = fibonacciSum(5);
      System.out.println(fibonacci);
  
  }

/*
output:
run:
33
BUILD SUCCESSFUL (total time: 0 seconds)
*/  
