
public class Floore_char 
{

	public static void main(String[] args)
	{
		char arr[]= {'a','b','c','f','h','k'};
		char target='f';
		char element=floorechar(arr,target);
		System.out.println(element);

	}

	static public char floorechar(char[] letters, char target) 
	{
		int start=0;
		int end=letters  .length-1;
		
		while (start<=end)
		{
			int mid=start+(end-start)/2;
			if(target<letters[mid])
			{
				end=mid-1;
			}
			else
			{
                start=mid+1;
			}
        
		}
		return letters[start % letters.length];
	}
}

