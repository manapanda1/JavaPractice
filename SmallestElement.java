import java.util.*;
class SmallestElement{

public static int smallestEle(int[] arr)
 {
   int min=100;
   for(int i=0;i<arr.length;i++)
      {
       if(arr[i]<min)
          {
            min=arr[i];
           }
       }
    return min;
  }

public static void main( String[] args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the size of the array:");
  int n=sc.nextInt();
  int[] arr=new int[n];
  for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
 int ans=smallestEle(arr);
  System.out.println("The Smallest Element is:"+ans);
}


}