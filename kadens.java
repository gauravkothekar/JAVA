
public class kadens 
{
	public static void main(String[] args) 
	{	
		int a[] = {5,6,-8,4,-6};
		System.out.println(" MaxSumSubArray  "+massumSubArray(a));
		
		
	}

	static int massumSubArray(int[] a) 
	{
		int MaxSum=0;
		int CurSum =0;
		for(int i=0;i<a.length;i++)
		{
			CurSum=CurSum+a[i];
			if(CurSum > MaxSum)
			{
				MaxSum = CurSum;	
			}
			if(CurSum<0)
			{
				CurSum=0;
			}
			
		}
		return MaxSum;
		
	}

}
