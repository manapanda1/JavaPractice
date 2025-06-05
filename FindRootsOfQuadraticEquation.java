import java.util.*;

class FindRootsOfQuadraticEquation {

    static void findRoot(int a, int b, int c) {
        double dis = (b * b) - 4 * a * c;
        double sqrt_val;

        if (dis == 0) {
            double root = -b / (2.0 * a);
            System.out.println("Roots are real and equal:");
            System.out.println("Root: " + root);
        } else if (dis > 0) {
            sqrt_val = Math.sqrt(dis);
            double root1 = (-b + sqrt_val) / (2 * a);
            double root2 = (-b - sqrt_val) / (2 * a);
            System.out.println("Roots are real and distinct:");
            System.out.println("Root1: " + root1);
            System.out.println("Root2: " + root2);
        } else {
            sqrt_val = Math.sqrt(-dis); // make it positive
            double realPart = -b / (2.0 * a);
            double imaginaryPart = sqrt_val / (2.0 * a);
            System.out.println("Roots are complex:");
            System.out.println("Root1: " + realPart + " + i" + imaginaryPart);
            System.out.println("Root2: " + realPart + " - i" + imaginaryPart);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coefficients a, b, and c:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        findRoot(n1, n2, n3);
        sc.close();
    }
}
