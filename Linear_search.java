import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Linear_search 
{

	public static void main(String[] args) 
	{
		int arr[]= {18,23,56,34,88,34,12};
		//int ele =Search_ele(arr, 88);
		//System.out.println(ele);
		int max=maxvalue(arr);
		System.out.println(max);
	}
	static int maxvalue(int arr[])
	{
		int Max=Integer.MIN_VALUE;
		for (int i : arr)
		{
			if(arr[i]>Max)
			{
				Max=arr[i];
			}
		}
		
		return Max;
		
	}
	
	static int Search_ele(int arr[],int target)
	{
		//checks if there is any value in array or not
		if(arr.length == 0)
		{
			return -1;
		}
		
		//for loop to search the element in array
		for(int index=0;index<arr.length;index++)
		{
			int element=arr[index];
			if(element == target)
			{
				return index;
			}
		}
		
		//if loop do not find any element 
		
		return -1;
	}

}
