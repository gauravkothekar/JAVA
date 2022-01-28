import java.util.Scanner;

public class newte 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the value of n");	
		int n=s1.nextInt();
		newte.pattern(n);
	}
	static void pattern(int n)
	{
		for(int row=0;row<2*n;row++)
		{
			int number_ofRows= row > n ? 2 * n-row: row; 
			int num_space =n-number_ofRows;
			for(int s=0;s<num_space;s++)
			{
				System.out.print(" "); 
			}
			for(int k=0; k<number_ofRows;k++)
			{
				System.out.print("* "); 
			}
			System.out.println();
		}
	}
}
