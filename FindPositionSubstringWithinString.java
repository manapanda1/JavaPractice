import java.util.*;
class FindPositionSubstringWithinString{
   
    public static int checkPosition(String s1,String s2)
         {
           int size1=s1.length();
           int size2=s2.length();
           int temp=0;
           for(int i=0;i<size1;i++)
            {
              temp=i;
              int j=0;
              for( j=0;j<size2;j++)
                {
                  if(s1.charAt(temp)!=s2.charAt(j))
                   {
                     break;
                   }
                 temp++;
                }
               if(j==size2) return i;
            }
           return -1;
         }

   
    public static void main(String[] args)
         {
	Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st String");
        String s1 = sc.next();
        System.out.println("Enter the 1st String");
        String s2 = sc.next();

        System.out.println("Output :"+checkPosition(s1,s2));

	 }
}