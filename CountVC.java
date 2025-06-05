import java.util.*;

class CountVC {
    static void countVC(String s) {
        int low = 0, high = s.length() - 1;
        int vowels = 0, cons = 0, whitespace = 0;

        while (low <= high) {
            char a = Character.toLowerCase(s.charAt(low));

            if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
                vowels++;
            } else if (a == ' ') {
                whitespace++;
            } else if (Character.isLetter(a)) {
                cons++;
            }
            low++;
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + cons);
        System.out.println("Whitespace: " + whitespace);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence:");
        String s = sc.nextLine();
        countVC(s);
    }
}
