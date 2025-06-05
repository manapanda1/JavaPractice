import java.util.*;
class PallindromeInRange{


   static boolean checkPallindrome(int n)
     {
       int r=0;
       int d=0;
       int ans=0;
       for(int i=n;i>0;i=i/10)
         {
     
           d=i%10;
           ans=ans*10+d;
         }
       if(n==ans) return true;
       else return false;
     }
   public static void main(String[] args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Numbers");
       int n1=sc.nextInt();
       int n2=sc.nextInt();
       for(int i=n1;i<=n2;i++)
         {
           if(checkPallindrome(i))
              System.out.println(i +" ");
         }
       
     }
}