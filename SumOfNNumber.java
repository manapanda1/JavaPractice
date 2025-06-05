import java.util.*;
class SumOfNNumber{


   static int sumOfN_Number(int n)
     {
       return n*(n+1)/2;
     }
   public static void main(String[] args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Number");
       int n=sc.nextInt();
       System.out.println("Output : "+sumOfN_Number(n));
     }
}