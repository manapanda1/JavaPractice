import java.util.*;
class SortString{
   
    public static String sorting(String s)
         {
           char c[]=s.toCharArray();
           Arrays.sort(c);
           return new String(c);
         }

   
    public static void main(String[] args)
         {
	Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence:");
        String s = sc.nextLine();
        System.out.println("Output :"+sorting(s));

	 }
}