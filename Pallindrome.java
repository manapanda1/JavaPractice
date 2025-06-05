import java.util.*;
class Pallindrome{

     static boolean isPallindrome(String str)
          {
            int left=0, right=str.length()-1;
	    while(left<right)
                {
		  char l=str.charAt(left), r=str.charAt(right);
		  if(!Character.isLetterOrDigit(l))
                    left++;
                  if(!Character.isLetterOrDigit(r))
		    right--;
		  if(Character.toLowerCase(l)!=Character.toLowerCase(r))
                     return false;
                  else
                    {
			left++;
	                right--;
		    }
		}
             return true;
          }
     public static void main(String[] args)
         {
	   String str="MANA";
      	   boolean ans=isPallindrome(str);
 	   if(ans==true)
		{
		  System.out.println("Pallindrome...");
		}
	  else
            {
              System.out.println("NOT Pallindrome...");
	    }
         }
}

