import java.util.Scanner;

public class peri 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the value of n");	
		int n=s1.nextInt();
		peri.pattern(n);
	}
	static void pattern(int n)
	{
		for(int row=1;row<=n;row++)
		{
			int num_ofspace=n-row;
			for(int k=1;k<=num_ofspace;k++)
			{
				System.out.print(" ");
			}
			for(int j=n+1;j<=n+row;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
