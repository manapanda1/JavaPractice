import java.util.*;
class PrimeFactor{


   static boolean isPrime(int n)
      {
        for(int i=2;i<n;i++)
          {
            if(n%i==0)
             {
               return false;
             }
          }
         return true;
      }
   static void printFactor(int n)
     {
       
       for(int i=2;i<=n;i++)
          {
            if(n%i==0)
              {
               if(isPrime(i))
              {
               System.out.println(i);
              }

              }
          }
        
     }
   public static void main(String[] args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Number");
       int n=sc.nextInt();
       printFactor(n);
     }
}