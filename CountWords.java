import java.util.*;
class CountWords{
   
    public static int countWords(String s)
         {
           int count=0;
           for(int i=0;i<s.length();i++)
             {
               if(s.charAt(i)==' ')
                {
                  count++;
                }
             }
           return count+1;
         }

   
    public static void main(String[] args)
         {
	Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence:");
        String s = sc.nextLine();
        System.out.println("Output :"+countWords(s));

	 }
}