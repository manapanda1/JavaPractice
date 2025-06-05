import java.util.*;
class PrintFibonacci{


   static int printFibonacci(int n)
     {
       if (n <= 1)
            return n;
        return printFibonacci(n - 1) + printFibonacci(n - 2);
     }
   public static void main(String[] args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Number");
       int n=sc.nextInt();
       System.out.println(printFibonacci(n));	
       
     }
}