import java.util.*;

class RemoveDuplicatesIn-placeFromSortedArray{

    static void removeDuplicateElementFromSorted(int[] arr)
       {
         ArrayList ans=new ArrayList<>();
         int j=0;
	 for(int i=0;i<arr.length;i++)
            {
             j=i+1;
             if(arr[i]!=arr[j]) ans.add(arr[i]);
             
	     
            }
         System.out.println(ans);
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
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Original Array: ");
        printArray(arr);

        
    }
}
