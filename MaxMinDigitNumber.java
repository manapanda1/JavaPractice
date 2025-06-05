import java.util.*;
class MaxMinDigitNumber{


   static int maxDigit(int n)
     {
       int ans=Integer.MIN_VALUE;
       for(int i=n;i>0;i=i/10)
          {
           int rem=i%10;
           if(rem>ans)
             {
               ans=rem;
             }
          }
        return ans;
     }
    static int minDigit(int n)
     {
       int ans=Integer.MAX_VALUE;
       for(int i=n;i>0;i=i/10)
          {
           int rem=i%10;
           if(rem<ans)
             {
               ans=rem;
             }
          }
        return ans;
     }

   public static void main(String[] args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Number");
       int n=sc.nextInt();
       System.out.println("Output : "+maxDigit(n));
       System.out.println("Output : "+minDigit(n));
     }
}