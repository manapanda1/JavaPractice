import java.util.*;
class powerOfNumber{


   static double powerOfNumberr(int n, int p)
     {
       return Math.pow(n,p);							
     }
   public static void main(String[] args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Number");
       int n=sc.nextInt();
       int p=sc.nextInt();
       System.out.println("OUTPUT : "+powerOfNumberr(n,p));	
       
     }
}