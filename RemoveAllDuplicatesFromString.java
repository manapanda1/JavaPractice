import java.util.*;
class RemoveAllDuplicatesFromString{
    
    public static String removeDuplicate(String s)
	 {
	  StringBuffer sb=new StringBuffer();
          int[] freq=new int[26];
          for(int i=0;i<s.length();i++)
             {
               
               freq[s.charAt(i)-'a']++;
               if(freq[s.charAt(i)-'a']==1)
                {
		  sb.append(s.charAt(i));
	        }
                

	     }
          
           return sb.toString();
	 }
    
    public static void main(String[] args)
         {
	Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = sc.next();
        System.out.println("After remove:"+removeDuplicate(s));

	 }
}