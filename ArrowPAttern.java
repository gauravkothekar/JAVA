import java.util.Scanner;

public class ArrowPAttern {

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the Rows ");
		int temp=s1.nextInt();
		for(int row=1;row<=2*temp-1;row++)
		{
			if(row<=temp)
			{
				for(int col=1;col<=row;col++)
				{
					System.out.print("*" +" ");
				}
				System.out.println(" ");
			}	
			else
			{
				for(int col=1;col<=2*temp-row;col++)
				{
					System.out.print("*"+" ");
				}
				System.out.println(" ");
			}
		}
	}
}
