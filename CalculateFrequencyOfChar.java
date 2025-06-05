import java.util.*;
class CalculateFrequencyOfChar{

    public static void countFrequency(String s)
         {
	   int[] freq=new int[26];
           for(int i=0;i<s.length();i++)
             {
		freq[s.charAt(i)-'a']++;
	     }
           for(int i=0;i<=26;i++)
             {
		if(freq[i]!=0)
                  {
		    System.out.print((char)(i+'a'));
                    System.out.print(freq[i]);
                    System.out.println();
                  }
             }
	 }
    public static void main(String[] args)
         {
	Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence:");
        String s = sc.nextLine();
        countFrequency(s);

	 }
}