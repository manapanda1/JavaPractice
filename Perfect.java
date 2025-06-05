import java.util.*;
class Perfect{


   static boolean checkPerfect(int n)
     {
       int ans=0;
       for(int i=1;i<=n/2;i++)
          {
            if(n%i==0)
              {
               ans+=i;
              }
          }
        if(n==ans) return true;
        return false;
     }
   public static void main(String[] args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Number");
       int n=sc.nextInt();
       System.out.println("Output : "+checkPerfect(n));
     }
}