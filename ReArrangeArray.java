import java.util.*;
public ReArrangeArray{
public static void printArray(int[] arr)
  {
	for(int i=0;i<arr.length;i++)
	    {
	       System.out.print(arr[i]+" ");
	    }
  }


  public void rearrangeArray(int[] arr)
     {
	Arrays.sort(arr);
	int size=arr.length;
	for(int i=0;i<size/2;i++)
          {
	    System.out.println(arr[i]);
	  }
 	for(int i=size-1;i>=size/2;i--)
          {
	    System.out.println(arr[i]);
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
    rearrangeArray(arr);
   

     }	

}