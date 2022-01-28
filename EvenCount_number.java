
public class EvenCount_number 
{

	public static void main(String[] args) 
	{
		int arr[]= {1222,22,554,2231,232,555,45};
		 System.out.println(evenNumber(arr));
	}

	static int evenNumber(int[] arr)
	{
		int count = 0;
		for(int i : arr) 
		{
			if(even_number(i))
			{
				count++;
			}
		}
		return count;
	}

	static boolean even_number(int i) 
	{
		int NumberOFDigits=digit(i);
		
		if(NumberOFDigits % 2==0)
		{
			return true;
		}
		return false;
	}

	static int digit(int i) 
	{
		int count=0;
		if(i<0)
		{
			i=i*-1;
		}
		if(i==0)
		{
			return 1;
		}
		while (i>0)
		{
			count++;
			i=i % 10;
			
		}
		return count;
	}

}
