import java.util.*;

class RemoveDuplicatesFromUnsortedArray {

    static void removeDuplicateElementFromSorted(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        int n = arr.length;

        if (n == 0) {
            System.out.println("[]");
            return;
        }
        
        for(int i=0;i<n;i++)
           {
             if(!map.containsKey(arr[i]))
               {
                 System.out.print(arr[i] + " ");
                 map.put(arr[i],1);
               }
           }
       
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
