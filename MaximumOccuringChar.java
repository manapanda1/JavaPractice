import java.util.*;
class MaximumOccuringChar{

    public static void maximumOccuringChar(String s)
         {
           int maxF=1;
           int idx=0;
	   int[] freq=new int[26];
           for(int i=0;i<s.length();i++)
             {
		freq[s.charAt(i)-'a']++;
	     }
           for(int i=0;i<26;i++)
             {
		if(freq[i]>maxF)
                  {
		    maxF=freq[i];
                    idx=i;
                  }
             }
          System.out.print((char)(idx+'a'));
          System.out.print(" --> "+freq[idx]);
          System.out.println();
	 }
    public static void main(String[] args)
         {
	Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence:");
        String s = sc.nextLine();
        maximumOccuringChar(s);

	 }
}