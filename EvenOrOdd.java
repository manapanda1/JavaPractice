import java.util.*;
class EvenOrOdd{


   static boolean checkEvenOrOdd(int n)
     {
       if(n%2==0) return true;
       return false;
     }
   public static void main(String[] args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Number");
       int n=sc.nextInt();
       if(checkEvenOrOdd(n))
          {
           System.out.println("Output : even number");
          }
       else
          {
           System.out.println("Output : odd number ");
           }
       
     }
}