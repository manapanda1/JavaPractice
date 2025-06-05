import java.util.*;

class RemoveCharExceptAlphabet {


    public static String removeCharacter(String s)
        {
          int low=0,high=s.length()-1;
	  String str="";
          while(low<=high)
             {
		char ch=Character.toLowerCase(s.charAt(low));
                if((ch >='a' && ch <='z')|| (ch >='A' && ch <='Z'))
                  {
		    str+=ch;
		  }
		low++;
             }
          return str;
	}   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence:");
        String s = sc.nextLine();
        System.out.println("After removal :"+removeCharacter(s));
    }
}
