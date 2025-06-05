import java.util.*;
class ChangeCase{
   
    public static String changeCases(String s)
         {
           StringBuffer sb=new StringBuffer();
           for(int i=0;i<s.length();i++)
             {
               char ch=s.charAt(i);
               if((int) ch >=65 && (int) ch <=90)
                 {
                  ch=Character.toLowerCase(ch);
                  sb.append(ch);
                 }
                else
                 {
                  ch=Character.toUpperCase(ch);
                  sb.append(ch);
                 }
             }
           return sb.toString();
         }

   
    public static void main(String[] args)
         {
	Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence:");
        String s = sc.nextLine();
        System.out.println("Output :"+changeCases(s));

	 }
}