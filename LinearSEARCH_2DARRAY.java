import java.lang.reflect.Array;
import java.util.Arrays;

public class LinearSEARCH_2DARRAY 
{
	static int[] linearSearch(int arr[][],int target)
	{
		int max =Integer.MIN_VALUE;

		for(int row=0;row<arr.length;row++)
		{
			for(int column=0;column<arr[row].length;column++)
			{
								if(arr[row][column]==target)
				{
					return new int[]{row, column};
				}
			}
		}
		return new int[] {-1,-1};
		
	}

	public static void main(String[] args) 
	{
	
		int[][] arr= {
				{32,33,77,45,34,79},
				{343,777,54,232,788,44,22,},
				{323,465,23,1212,76,34,23,3453,545},
				{228,45,88,55,45,32}
				};
		int target =225445;
		int[] re_arr=linearSearch(arr, target);
		System.out.println(Arrays.toString(re_arr));

	}

}
