import java.util.*;
class Largest{

public static int largestEle(int[] arr)
 {
   int max=-1;
   for(int i=0;i<arr.length;i++)
      {
       if(arr[i]>max)
          {
            max=arr[i];
           }
       }
    return max;
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
 int ans=largestEle(arr);
  System.out.println("The largest Element is:"+ans);
}


}