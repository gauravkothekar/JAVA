import java.util.Scanner;

public class pattern30 
{
	 
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s1.nextInt();
		pattern30.pattern(n);
		int[] A=new int[s1.nextInt()];
		System.out.println(A.length);
	}
	
	public static void pattern(int n)
	{
		for(int row=1;row<=n;row++)
		{
			int number_ofspace=n-row;
			for(int k=0;k<number_ofspace;k++)
			{
				System.out.print("  ");
			}
			for (int col = row; col >=1; col--) 
			{
				System.out.print(col+" ");	
			}
			for (int col=2;col<=row;col++)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
}
