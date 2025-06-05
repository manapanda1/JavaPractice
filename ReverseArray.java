import java.util.*;

class ReverseArray{

public static void printArray(int[] arr)
  {
	for(int i=0;i<arr.length;i++)
	    {
	       System.out.print(arr[i]+" ");
	    }
  }

public static void reverseArray(int[] arr)
  {
    int low=0;
    int high=arr.length-1;
    while(low<=high)
     {
        int temp=arr[low];
        arr[low]=arr[high];
	arr[high]=temp;
	low++;
	high--;
     }
  }


public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
	{
	  arr[i]=sc.nextInt();
	}
    System.out.println("Printing the element:");
    printArray(arr);
    reverseArray(arr);
    System.out.println("Printing the element after reverse:");
    printArray(arr);
  }  


}