import java.util.*;
class ReverseWordsInString{
   
    public static String reverseWords(String s)
         {
           Stack<String> st=new Stack<>();
           String str="";
           int count=0;
           int idx=0,j=0;
           for(int i=0;i<s.length();i++)
             {
              if(s.charAt(i)==' ')
                {
                 st.push(s.substring(idx,count+1));
                 idx=i+1;
                 j++;
                }
              else
                 {
                  count++;
                 }
                  
             }
           for(int x=0;x<=j;x++)
             {
               str+=st.peek()+" ";
               st.pop();
               
             }
           return str;
            
         }

   
    public static void main(String[] args)
         {
	Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence:");
        String s = sc.nextLine();
        System.out.println("Output :"+reverseWords(s));

	 }
}