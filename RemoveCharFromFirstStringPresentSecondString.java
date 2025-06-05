import java.util.*;
class RemoveCharFromFirstStringPresentSecondString{

    public static String removeCharacter(String s1, String s2)
         {
	  StringBuffer sb=new StringBuffer();
	  for(int i=0;i<s1.length();i++)
            {
              int f=1;
              for(int j=0;j<s2.length();j++)
                {
		  if(s1.charAt(i)==(s2.charAt(j)))
                    {
                      f=0;
                    }
		}
              if(f==1)
                {
                  sb.append(s1.charAt(i));
                }
            }
            return sb.toString();
	 }
    public static void main(String[] args)
         {
	Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st String:");
        String s1 = sc.next();
        System.out.println("Enter the 2nd String:");
        String s2 = sc.next();
        System.out.println("Output: "+removeCharacter(s1,s2));

	 }
}