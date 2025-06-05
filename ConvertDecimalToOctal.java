import java.util.*;
class ConvertDecimalToOctal{


   static String printAns(int n)
     {
      StringBuffer sb=new StringBuffer();
       while(n>0)
        {
         int ans=n%8;
         sb.insert(0,ans);
          n=n/8;
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