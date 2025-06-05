import java.util.*;
class MaximumProductSubarray{

     public static int maximumProductSubarray(int[] arr)
	{
	  int maxP=0;
	  int ans=1;
	  for(int i=0;i<arr.length;i++)
	     {
		if(arr[i]!=0)
		  {
		    
	            ans=ans*Math.abs(arr[i]);
		    maxP=Math.max(maxP,ans);
		  }
                else{
		      ans=1;
                    }
	   
	     }
	return maxP;
 	}
     public static void printArray(int[] arr)
        {
	for(int i=0;i<arr.length;i++)
	    {
	       System.out.print(arr[i]+" ");
	    }
         }

    public static void main(String[] args)
        {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the size of the array:");
	  int n=sc.nextInt();
	  int[] arr=new int[n];
	  System.out.println("Enter the elements of the array the array:");
          for(int i=0;i<n;i++)
	    {
		arr[i]=sc.nextInt();
	    }
           printArray(arr);
          int maxi=maximumProductSubarray(arr);
	   System.out.println("Maximum Product of Subarray:"+maxi);
          
        }
}