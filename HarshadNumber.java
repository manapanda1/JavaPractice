import java.util.*;
class HarshadNumber{


   static boolean isHarshad(int n)
     {
       int ans=0;
       for(int i=n;i>0;i=i/10)
          {
           int rem=i%10;
           ans+=rem;
          }
        if(n%ans==0) return true;
        return false;
     }
   public static void main(String[] args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Number");
       int n=sc.nextInt();
       System.out.println("Output : "+isHarshad(n));
     }
}