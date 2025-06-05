import java.util.*;

class ASCII {
   
    public static int countASCII(char s)
        {
	  int res=(int) s;
          return res;
	}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence:");
        char s = 'm';
        int ans=countASCII(s);
        System.out.println("The ASCII Value of the Char is :"+ans);
    }
}
