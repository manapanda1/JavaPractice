import java.util.*;
class Amstrong{


   static boolean checkAmstrong(int n)
     {
       int digitC=0;
       for(int i=n;i>0;i=i/10)
          {
           digitC++;
          }
       int ans=0;
       
        for(int i=n;i>0;i=i/10)
          {
            int rem=i%10;
            ans+=Math.pow(rem,digitC);
          }
       if(n==ans) return true;
       return false;
     }
   public static void main(String[] args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Number");
       int n=sc.nextInt();
       System.out.println("Output : "+checkAmstrong(n));
     }
}