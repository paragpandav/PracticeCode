import java.util.*;

public class CheckStaticc
{
  public static void main(String[] args) {
  
   // list<Integer> arr=new Arraylist<Integer>();
    
    Integer[] arr1= {10,6,4,8,7,9,11,3};
    System.out.println("Before Sorting Array "+Arrays.toString(arr1));
    sortoldinsertion(arr1);
    System.out.println("After Sorting Array "+Arrays.toString(arr1));
  }

  public static void sortOldBubble(Integer[] arr)
  {
    int temp=0;
    for(int m=arr.length;m>0;m--)
    for(int i=0; i<m-1; i++)
    {
        if(arr[i]>arr[i+1])
        {
            temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
  }

  public static Integer[] sortNewBubble(Integer[] arr)
  {
    Arrays.sort(arr, (i1, i2) -> i1.compareTo(i2));
    System.out.println("After Sorting Array inside Sort method = "+Arrays.toString(arr));
    return arr;
  }

  public static void sortoldinsertion(Integer[] arr)
  {
    int temp;
    for(int i=1; i<arr.length; i++)
    {
      temp=0;
      for(int j=0; j<i; j++)
      {
        if(arr[j]>arr[i])
        {
          temp=arr[i];
          for (int k=i; k>j; k--)
          arr[k]=arr[k-1];
          arr[j]=temp;
        }
        
      }
    }
  }
}