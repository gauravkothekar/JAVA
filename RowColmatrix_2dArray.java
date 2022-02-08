import java.util.Arrays;

public class RowColmatrix_2dArray 
{

	public static void main(String[] args) 
	{
		int arrs[][]= {{10,20,30,40},
						{15,25,35,45,},
						{28,29,37,49},
						{33,34,38,50}};
		System.out.println(Arrays.toString(search(arrs, 38)));
	}
	static int[] search(int arr[][],int target)
	{
		int r=0;
		int c=arr.length-1;
		while(r<arr.length && c>=0) 
		{
			if(arr[r][c] == target)
			{
				return new int[] {r,c};
			}
			if(arr[r][c] > target)
			{
				c--;
			}
			else {
				r++;
			}
		}
		return new int[] {-1,-1};
	}
}
