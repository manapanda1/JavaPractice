import java.util.*;
class SumOfAPSeries{


   static int sumOfAPSeries(int n, int a, int d)
     {
 
       return (n/2)*(2*a+(n-1)*d);
     }
   public static void main(String[] args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Number");
       int n=sc.nextInt();
       int a=sc.nextInt();
       int d=sc.nextInt();
       System.out.println("Output : "+sumOfAPSeries(n,a,d));
     }
}