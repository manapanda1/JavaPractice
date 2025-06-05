import java.util.*;
class DuplicateRemove2{

       public static int removeDuplicate(int[] arr)
         {
	    int i=0;
             
	    for(int j=1;j<arr.length;j++)
                {
		  if(arr[i]!=arr[j])
		    {
		      i++;
	              arr[i]=arr[j];
		    }
		}
             return i+1;
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