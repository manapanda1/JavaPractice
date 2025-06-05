import java.util.*;
class Factorial{


   static int printFactorial(int n)
     {
       int fact=1;
       for(int i=n;i>0;i--)
         {
           fact*=i;
         }
       return fact;							
     }
   public static void main(String[] args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Number");
       int n=sc.nextInt();
       System.out.println(printFactorial(n));	
       
     }
}