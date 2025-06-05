
import java.util.*;
class SecondLS{
     
     public static int findSecSmallest(int[] arr)
      {
         int mini1=arr[0];
   	 int mini2=arr[0];
	for(int i=0;i<arr.length;i++)
	  {
	    if(arr[i]<mini1)
               {
		mini2=mini1;
		mini1=arr[i];
		
 	       }
          }
         return mini2;
      }
   
 public static int findSecLargest(int[] arr)
      {
         int maxi1=arr[0];
   	 int maxi2=arr[0];
	for(int i=0;i<arr.length;i++)
	  {
	    if(arr[i]>maxi1)
               {
		maxi2=maxi1;
		maxi1=arr[i];
		
 	       }
          }
         return maxi2;
      }



     public static void main(String[] args)
     {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Size of the array:");
	int n=sc.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<n;i++)
	 {
	   arr[i]=sc.nextInt();
	 }
	int ans1=findSecSmallest(arr);
        System.out.println("The 2nd Smallest element is :"+ans1);
	int ans2=findSecLargest(arr);
	System.out.println("The 2nd Largest element is :"+ans2);
     }

}