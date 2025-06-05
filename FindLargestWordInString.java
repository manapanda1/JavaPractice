import java.util.*;
class FindLargestWordInString{

    public static String changeLexicographically(String s)
         {
          int count=0;
          int ans=0;
          int idx=0;
          int start=0;
	  for(int i=0;i<s.length();i++)
           {
	     if(s.charAt(i)==' ')
               {
                if(count>ans)
                   {
                    idx=i;
                    ans=count;
                   }
                   
                count=0;
               }
             else
                {
                 count++;
                }
           }
           if(count>ans){
             idx=s.length()-1;
             ans=count;
            }
           return s.substring(idx-count-1,idx);	
         }
    public static void main(String[] args)
         {
	Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence:");
        String s = sc.nextLine();
        System.out.println("Output :"+changeLexicographically(s));

	 }
}