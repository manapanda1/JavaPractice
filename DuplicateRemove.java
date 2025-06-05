import java.util.*;
class DuplicateRemove{

       public static int removeDuplicate(int[] arr)
         {
	   HashSet<Integer> set=new HashSet<>();
           for(int i=0;i<arr.length;i++)
	        {
		  set.add(arr[i]);
		}
	   int k=set.size();
	   int j=0;
           for(int x:set)
               {
		arr[j++]=x;
		}
	   return k;
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
          int k= removeDuplicate(arr);
           System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
	}
}