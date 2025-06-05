import java.util.*;
class GreatestOfThree{


   static int greatestOfThree(int n1, int n2,int n3)
     {
       if(n1>n2 && n1 >n3)
         {
           return n1;
         }
       else
         {
          if(n2>n3)
            {
             return n2;
            }
          }
       return n3;
     }
   public static void main(String[] args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter two Number");
       int n1=sc.nextInt();
       int n2=sc.nextInt();
       int n3=sc.nextInt();

       
       System.out.println("Output :"+greatestOfThree(n1,n2,n3));
       
       
     }
}