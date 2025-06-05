import java.util.*;
class DuplicateUnsorted2{

     public static void removeDuplicate(int[] arr)
	{
	  Map<Integer,Integer> ans=new HashMap<>();
	  for(int i=0;i<arr.length;i++)
	     {
	       if(!ans.containsKey(arr[i]))
		{
		  System.out.println(arr[i]);
		  ans.put(arr[i],1);
		}
	     }
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
          removeDuplicate(arr);
          
        }
	
	
}