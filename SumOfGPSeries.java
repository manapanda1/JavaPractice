import java.util.*;
class SumOfGPSeries{


   static double sumOfGPSeries(int n, int a, int r)
     {
 
       double p=Math.pow(r,n);
       return a*(p-1)/(r-1);
     }
   public static void main(String[] args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Number");
       int n=sc.nextInt();
       int a=sc.nextInt();
       int r=sc.nextInt();
       System.out.println("Output : "+sumOfGPSeries(n,a,r));
     }
}