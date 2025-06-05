import java.util.*;

class RemoveDuplicatesInplaceFromSortedArray {

    static void removeDuplicateElementFromSorted(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;

        if (n == 0) {
            System.out.println("[]");
            return;
        }

        
        ans.add(arr[0]);

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                ans.add(arr[i]);
            }
        }

        System.out.println("Array after removing duplicates: " + ans);
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements (sorted):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Original Array: ");
        printArray(arr);

    
        removeDuplicateElementFromSorted(arr);
    }
}
