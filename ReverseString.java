import java.util.*;
class ReverseString{
   
    public static void main(String[] args)
      {
        String str="HELLO";
        char[] reverseString=new char[str.length()];
        Stack<Character> stack=new Stack<Character>();
        

        for(int i=0;i<str.length();i++)
           {
             stack.push(str.charAt(i));
           }
           
        int i=0;
	while(!stack.isEmpty())
          {
	    reverseString[i++]=stack.pop();
	  }       
	str=new String(reverseString);
	System.out.print("The reverse string is :- "+str);

      }

}