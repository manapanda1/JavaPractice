import java.util.*;
class AutomorphicNumber{


   public static boolean isAutomorphic(int n)
     {
       int sq=n*n;
       while(n>0)
         {
           if(n%10 != sq%10) return false;
           
	   n/=10;
           sq/=10;
         }
       return true;
     }
   public static void main(String[] args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Number");
       int n=sc.nextInt();
       System.out.println(isAutomorphic(n));	
       
     }
}