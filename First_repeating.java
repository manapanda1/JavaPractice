import java.util.*;

public class First_repeating{

public static int findFirstRepeatingElement(int[] arr, int n)
{
 Map<Integer,Integer> m=new HashMap<>();
 for(int i=0;i<n;i++)
{
 if(m.containsKey(arr[i]))
{
 m.put(arr[i],m.get(arr[i])+1);
}
else
{
 m.put(arr[i],1);
}

}
for(int i=0;i<n;i++)
{
 if (m.get(arr[i]) == 1)
{
return arr[i];
}

}
return -1;

}


public static void main(String[] args)
{
  int[] arr={9,4,4,9,7};
  int n=arr.length;
int ans=0;
  ans=findFirstRepeatingElement(arr,n);
  
  System.out.println("The element occuring only once is :"+ans);
}


}