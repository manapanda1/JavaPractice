import java.util.*;

class FrequencyCount{

public static void printArray(int[] arr)
  {
	for(int i=0;i<arr.length;i++)
	    {
	       System.out.print(arr[i]+" ");
	    }
  }

public static void countFrequency(int[] arr)
   {
     Map<Integer,Integer> ans=new HashMap<>();
     for(int i=0;i<arr.length;i++)
       {
	if(ans.containsKey(arr[i]))
          {
	    ans.put(arr[i],ans.get(arr[i])+1);
	  }
	else
	  {
	    ans.put(arr[i],1);
	  }
       }
       
for (Map.Entry<Integer,Integer> entry : ans.entrySet())
    {
        System.out.println(entry.getKey() + " " + entry.getValue());
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
    countFrequency(arr);

   }


}
