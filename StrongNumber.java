import java.util.*;
class StrongNumber{


   static int calFactorial(int n)
     {
       int fact=1;
       for(int i=n;i>0;i--)
         {
           fact*=i;
         }
       return fact;							
     }
   static boolean isStrong(int n)
     {
       int ans=0;
       for(int i=n;i>0;i=i/10)
        {
          int d=i%10;
          ans+=calFactorial(d);
        }
       if(ans==n) return true;
       return false;
     }
   public static void main(String[] args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Number");
       int n=sc.nextInt();
       System.out.println(isStrong(n));	
       
     }
}