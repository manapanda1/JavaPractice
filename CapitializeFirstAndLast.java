import java.util.*;
class CapitializeFirstAndLast{

    public static String convertCapital(String s)
	 {
          int size=s.length();
	  StringBuffer sb=new StringBuffer(s);
	  for(int i=0;i<size;i++)
            {
		if(i==0 || i==(size-1) && (int)s.charAt(i)>=97)
                  {
                   sb.setCharAt(i,(char)((int)s.charAt(i)-32));
                  }
                else if(s.charAt(i)==' ')
                  {
		   if((int)s.charAt(i-1)-32 >= 65)
               		{
                          sb.setCharAt(i-1,(char)((int)s.charAt(i-1)-32));
			}
		   if((int)s.charAt(i+1)-32 >= 65)
               		{
                          sb.setCharAt(i+1,(char)((int)s.charAt(i+1)-32));
			}

                  }
	    }
           return sb.toString();
	 }
    public static void main(String[] args)
         {
	Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence:");
        String s = sc.nextLine();
        System.out.println("After Conversion :"+convertCapital(s));

	 }
}