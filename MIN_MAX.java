import java.util.Scanner;

public class MIN_MAX 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the Matrix size ");
		int Row=s1.nextInt();
		int Column=s1.nextInt();
		int Mat[][]=new int[Row][Column];
		for(int i=0;i<Row;i++)
		{
			for(int j=0;j<Column;j++)
			{
				Mat[i][j]=s1.nextInt();
			}
		}
		MIN_MAX m1=new MIN_MAX();
		m1.Distinct(Mat,Row,Column);
	}
	public int Distinct(int mat[][],int Row,int Column)
	{
		int Count;
		for(int i=0;i<Row;i++)
		{
			for(int j=0;j<Column;j++)
			{
				int row_Arr[]=new int[Row];
				
				int column_Arr[]=new int[Row];
		
				for(int k=0;k<Row;k++)
				{
					row_Arr[k]=mat[k][j];
					System.out.println(row_Arr[k]);
				}
				for(int k=0;k<Column;k++)
				{
					row_Arr[k]=mat[i][k];
					System.out.println(row_Arr[k]);
				}
				
				
			}
		}
		return 0;
	}
	public boolean min(int mat[][],int arr_row[],int arr_column[],int Row,int Column)
	{
		int temp_min=mat[Row][Column];
		for(int i=0;i<arr_row.length;i++)
		{
			if((arr_column[i]< temp_min) && (arr_row[i]<temp_min))
			{
				
			}
		}
		return true;
	}
}
