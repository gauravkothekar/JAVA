import java.util.Scanner;

public class StarPatternsNew 
{
	public static void main(String[] args) 
	{
		
		StarPatternsNew.Pattern();
	}
	
	public static void Pattern()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the value in n ");
		int n=s1.nextInt();
		int col=n*2-1;
		for(int i=1;i<=n;i++)
		{
			int a=0;
			int numberOfSpaces=2*n-i-a;
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			for(int j=i+1;j<numberOfSpaces;j++)
			{
				System.out.print("  ");
			}
			for(int j=numberOfSpaces;j<n*2;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
			a+=1;
		}
	}
}
