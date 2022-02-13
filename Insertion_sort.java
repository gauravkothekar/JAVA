import java.util.Arrays;

public class Insertion_sort 
{

	public static void main(String[] args) 
	{
		int arr[]= {8,4,9,5,4,2,1,5,2,3};
		Inser(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void Inser(int[] arr) 
	{
		for(int i=0;i < arr.length -1 ; i++)
		{
			for(int j=i+1 ; j>0 ; j--)
			{
				if(arr[j] < arr[j-1])
				{
					swap(arr,j,j-1);
				}
				else
				{
					break;
				}
			}
		}
	}

	private static void swap(int[] arr, int j, int i) 
	{
		int temp=arr[j];
		arr[j]=arr[j-1];
		arr[j-1]=temp;
		
	}

}
