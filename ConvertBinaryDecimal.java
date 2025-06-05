import java.util.*;
class ConvertBinaryDecimal{


   static int printAns(int n)
     {
       int ans=0;
       for(int i=n,j=0;i>0;i=i/10,j++)
         {
           int d=i%10;
           if(d==1) ans+=Math.pow(2,j);
           
         }
        return ans;
     }
   public static void main(String[] args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Number");
       int n=sc.nextInt();
       System.out.println(printAns(n));
     }
}