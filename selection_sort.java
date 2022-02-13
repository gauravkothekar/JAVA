import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Vector;

public class selection_sort 
{

	public static void main(String[] args)
	{
		Vector<Integer>  aee =new Vector<Integer>();
		aee.add(11);
		aee.add(11);
		aee.add(11);
		System.out.println(aee);
		int arr[]= {8,4,9,5,4,2,1,5,2,3};
		selection(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void selection(int[] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			int last =arr.length-i-1;
			int maxIndex =maxindexvalue(arr , 0 ,last);
			System.out.println(arr[maxIndex]);
			swap(arr , maxIndex , last);
		}
		
		
	}

	private static void swap(int[] arr, int maxIndex, int last) 
	{
		int temp = arr[maxIndex];
		arr[maxIndex]=arr[last];
		arr[last]=temp;
	}

	private static int maxindexvalue(int[] arr, int start, int last) {
		int max=start;
		for(int i=start;i<=last;i++)
		{
			if(arr[max] < arr[i])
			{
				max=i;
			}
		}
		return max;
	}

}
