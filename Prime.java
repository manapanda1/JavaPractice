import java.util.*;
class Prime{


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
       System.out.println("Enter the Number");
       int n=sc.nextInt();
       System.out.println("Output : "+checkPrime(n));
     }
}