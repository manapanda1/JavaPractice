import java.util.*;
class Replace01{


   static int reverseDigit(int n)
     {
       int ans=0;
       for(int i=n;i>0;i=i/10)
          {
           int rem=i%10;
           ans=ans*10+rem;
          }
        return ans;
     }
    static int replace01(int n)
     {
       int temp=0;
       int ans=0;
        for(int i=n;i>0;i=i/10)
          {
           int rem=i%10;
           if(rem==0) ans=ans*10+1;
           else ans=ans*10+rem;
           
          }
        temp=reverseDigit(ans);
        return temp;
       
     }
   public static void main(String[] args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Number");
       int n=sc.nextInt();
       System.out.println("Output : "+replace01(n));
     }
}