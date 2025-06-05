import java.util.*;
class SumOfNumber{
  	static int sumOfNumber(String s)
	  {
	     String tempSum="";
             int sum=0;
             for(int i=0;i<s.length();i++)
               {
                 char ch=s.charAt(i);
		 if(Character.isDigit(ch))
		   {
		     tempSum+=ch;
		   }
		else
		  {
		    sum+=Integer.parseInt(tempSum);
		    tempSum="0";
		  }
               }
	   return sum+Integer.parseInt(tempSum);
	  }
	public static void main(String[] args)
	  {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
                String s = sc.next();
                System.out.println("After removal :"+sumOfNumber(s));

	  }


}