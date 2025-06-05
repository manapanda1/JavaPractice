import java.util.*;

class ConvertOctalToBinary {

    static String printAns(int n) {
        if (n == 0) return "0";
        StringBuffer sb = new StringBuffer();
        while (n > 0) {
            sb.insert(0, n % 2);
            n = n / 2;
        }
        return sb.toString();
    }

    static int convertDecimal(int n) {
        int i = 0;
        int ans = 0;
        while (n > 0) {
            int d = n % 10;
            ans += d * Math.pow(8, i);
            i++;
            n = n / 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Octal Number:");
        int n = sc.nextInt();
        int decimal = convertDecimal(n);
        System.out.println(decimal);
        System.out.println("Binary: " + printAns(decimal));
    }
}
