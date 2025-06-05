import java.util.*;
class RemoveBrackets{

    public static String removeBrackets(String s)
          {
	    char[] ans=new char[s.length()];
	    Stack<Character> st=new Stack<Character>();
            
            for(int i=0;i<s.length();i++)
              {
		st.push(s.charAt(i));
	      }
           int i=0;
            while(!st.isEmpty())
              {
		char ch=st.pop();
                if(ch=='(' || ch==')')
                  {
		    i++;
		  }
                else
                  {
		   ans[i++]=ch;
                  }
	      }
            return new String(ans, 0, i);
	  }
    public static void main(String[] args)
         {
	Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence:");
        String s = sc.nextLine();
        System.out.println("After removal :"+removeBrackets(s));

	 }
}