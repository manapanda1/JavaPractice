import java.util.*;

class RemoveVowel {
    static String removeVowel(String s) {
        int low = 0, high = s.length() - 1;
        String str="";

        while (low <= high) {
            char a = Character.toLowerCase(s.charAt(low));

            if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
                low++;
                continue;
            } else if (a == ' ') {
                str+=a;
            } else if (Character.isLetter(a)) {
               str+=a;
            }
            low++;
        }

       return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence:");
        String s = sc.nextLine();
        System.out.println("After removal :"+removeVowel(s));
    }
}
