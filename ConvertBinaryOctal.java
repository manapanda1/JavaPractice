import java.util.*;
class ConvertBinaryOctal{


   static int printAns(int n)
     {
       int ans=0;
       int temp=0;
       int i=0;
       int mans=0;
       while(n>0)
         {
          int d=n%10;
          
          if(d==1) temp+=(int)Math.pow(2,i%3);
          i++;
         
          if(i%3==0)
            {
              ans=ans*10+temp;
              temp=0;
            }
         
         n=n/10;
         }

         if(temp!=0) ans=ans*10+temp;
         while(ans>0)
          {
           int d=ans%10;
           mans=mans*10+d;
           ans=ans/10;
          }
        return mans;
     }
   public static void main(String[] args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Number");
       int n=sc.nextInt();
       System.out.println(printAns(n));
     }
}