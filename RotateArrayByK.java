import java.util.*;

class RotateArrayByK{

    public static void rotateArray(int[] arr,int k)
        {
	  for(int x=1;x<=k;x++)
             {
		int temp=arr[0];
		for(int i=0;i<arr.length-1;i++)
	            {
		      arr[i]=arr[i+1];
	            }
                arr[arr.length-1]=temp;
	     }
        }
    public static void main(String[] args)
        {
     	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the size of array:");
           int n=sc.nextInt();
            System.out.println("Enter the value of K:");
           int k=sc.nextInt();

           int[] arr=new int[n];
	   System.out.println("Enter the elements of array:");
           for(int i=0;i<n;i++)
	      {
		arr[i]=sc.nextInt();
	      }
	   System.out.println("Print the elements of array:");
           for(int i=0;i<n;i++)
	      {
		System.out.println(arr[i]);
	      }
	   rotateArray(arr,k);
	   
            System.out.println("Print the elements of array:");
           for(int i=0;i<n;i++)
	      {
		System.out.println(arr[i]);
	      }

	}
}