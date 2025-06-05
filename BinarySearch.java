import java.util.*;
class BinarySearch
{
 public static int binarySearch(int[] arr,int k)
   {
     int low=0;
     int high=arr.length-1;
     while(low<=high)
       {
         int mid=(low+high)/2;
         if(arr[mid]==k)
           {
             return mid;
           }
         else if(arr[mid]<k)
           {
             low=mid+1;
           }
         else
           {
            high=mid-1;
           }
       }
     return -1;
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
   for(int i=0;i<n;i++)
      {
       arr[i]=sc.nextInt();
       }
   System.out.println("Printing the array:");
   printArray(arr);
   System.out.println("Enter the item you want to search:");
   int k=sc.nextInt();
   int ans=binarySearch(arr,k);
   System.out.println("The element is found in index :"+ans);
  
  }



}