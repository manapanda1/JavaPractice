import java.util.*;
class PosOrNeg{


   static boolean checkEvenOrOdd(int n)
     {
       if(n>=0) return true;
       return false;
     }
   public static void main(String[] args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Number");
       int n=sc.nextInt();
       if(checkEvenOrOdd(n))
          {
           System.out.println("Output : positive number");
          }
       else
          {
           System.out.println("Output : negative number ");
           }
       
     }
}