import java.util.*;
class ChangeLexicographic{

    public static String changeLexicographically(String s)
         {
	  StringBuffer sb=new StringBuffer();
          for(int i=0;i<s.length();i++)
           {
             if(s.charAt(i)=='z')
               {
                 sb.append((char)((int)s.charAt(i)-25));
               }
             else if(s.charAt(i)=='Z')
               {
                 sb.append((char)((int)s.charAt(i)-25));
               }
             else
               {
                sb.append((char)((int)s.charAt(i)+1));
               }
           }
           return sb.toString();
         }
    public static void main(String[] args)
         {
	Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence:");
        String s = sc.next();
        System.out.println("Output :"+changeLexicographically(s));

	 }
}