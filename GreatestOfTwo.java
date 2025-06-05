import java.util.*;
class GreatestOfTwo{


   static int greatestOfTwo(int n1, int n2)
     {
       if(n1>n2) return n1;
       return n2;
     }
   public static void main(String[] args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter two Number");
       int n1=sc.nextInt();
       int n2=sc.nextInt();
       
       System.out.println("Output :"+greatestOfTwo(n1,n2));
       
       
     }
}