import java.util.*;
class PrimeInRange{


   static boolean checkPrime(int n)
     {
       int count=0;
       for(int i=2;i<=Math.sqrt(n);i++)
         {
           if(n%i==0)
             {
               return false;
              
             }
            
          
         }
          return true;
     }
   public static void main(String[] args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Range Of Number");
       int n1=sc.nextInt();
       int n2=sc.nextInt();
       for(int i=n1;i<=n2;i++)
         {
          if(checkPrime(i))
            {
             System.out.println(i+" ");
            }
         }
       
     }
}