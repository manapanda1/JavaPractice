import java.util.*;
class ConvertDecimalToBinary{


   static String printAns(int n)
     {
      StringBuffer sb=new StringBuffer();
       while(n>0)
        {
         if(n%2==1){
          sb.insert(0,'1');
         }
         else
          {
           sb.insert(0,'0');
          }
          n=n/2;
        }
       return sb.toString();
     }
   public static void main(String[] args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Number");
       int n=sc.nextInt();
       System.out.println(printAns(n));
     }
}