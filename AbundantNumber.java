import java.util.*;
class AbundantNumber{


   static boolean isAbundantNumber(int n)
     {
       
       int ans=0;
       for(int i=1;i<=n/2;i++)
          {
            if(n%i==0)
              {
               ans+=i;
              }
          }
       if(ans>n) return true;
       return false;
        
     }
   public static void main(String[] args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Number");
       int n=sc.nextInt();
       System.out.println(isAbundantNumber(n));
     }
}