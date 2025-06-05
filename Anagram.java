import java.util.*;
class Anagram{

    public static boolean checkAnagram(String s1, String s2)
         {
	  int[] freq=new int[26];
          if(s1.length()!=s2.length()) return false;
          else
             {
               for(int i=0;i<s1.length();i++)
                 {
                   freq[s1.charAt(i)-'A']++;
                 }
               for(int i=0;i<s2.length();i++)
                 {
                  freq[s2.charAt(i)-'A']--;
                 }
               for(int i=0;i<26;i++)
                 {
		  if(freq[i]!=0) return false;
                 }
               return true;
             }
	 }
    public static void main(String[] args)
         {
	Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st Word:");
        String s1 = sc.next();
        System.out.println("Enter the 2nd Word:");
        String s2 = sc.next();
        boolean ans=checkAnagram(s1,s2);
        
        System.out.println("IS IT ANAGRAM ?"+ans);

	 }
}