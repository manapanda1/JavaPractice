import java.util.*;
class LeapYear{


   static boolean checkLeapYear(int n)
     {
       if(n%4==0) return true;
       else return false;
     }
   public static void main(String[] args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Number");
       int n=sc.nextInt();
       System.out.println("Output : "+checkLeapYear(n));
     }
}