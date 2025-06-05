import java.util.*;
class Permutation{


   static int fact(int n)
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
       int r=sc.nextInt();
       int ans1=fact(n);
       int ans2=fact(n-r);
       System.out.println(ans1/ans2);	
       
     }
}