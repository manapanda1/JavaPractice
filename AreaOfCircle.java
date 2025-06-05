import java.util.*;
class AreaOfCircle{


   static double printArea(int n)
     {
       
       return 3.14*n*n;
        
     }
   public static void main(String[] args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Number");
       int n=sc.nextInt();
       System.out.println(printArea(n));
     }
}