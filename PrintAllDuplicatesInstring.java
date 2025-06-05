import java.util.*;
class PrintAllDuplicatesInstring{
    
    public static void printDuplicate(String s)
	 {
	  
          int[] freq=new int[26];
          for(int i=0;i<s.length();i++)
             {
               
               freq[s.charAt(i)-'a']++;
         
	     }
           for(int i=0;i<26;i++)
             {
               if(freq[i]>1)
                 {
		   System.out.println((char)(i+'a')+"--> "+freq[i]);
                 }
             }
          
	 }
    
    public static void main(String[] args)
         {
	Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = sc.next();
        printDuplicate(s);

	 }
}