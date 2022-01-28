

import java.util.Scanner;

public class insertionsort 
{ 	
	//ENTER ARRAY SIZE scan
	Scanner s1 =new Scanner(System.in); 
	int count; 
	int arr_num[];
	//INITIALZING ARRAY SIZE AND CALLING INPUTE METHOD
	void ini()
	{
		System.out.println("enter the size of number");
		count=s1.nextInt();
		arr_num=new int[count];
		this.input();
	}
	//entering values in the array
	public void input()
	{
		for(int i=0;i<count;i++) 
		{
			arr_num[i]=s1.nextInt();
		}
		this.sorting();
	}
	//sorting array in asc order
	public void sorting()
	{
		for(int i=1;i<count;i++)
		{
			boolean ifswapped=false;
			//System.out.println(i);
			int temp=arr_num[i];
			int j=i-1;
			while(j>=0 && arr_num[j]>temp)
			{
				ifswapped=true; 
				arr_num[j+1]=arr_num[j];
				j=j-1;
			}
			//System.out.println("value of J+i before  "+arr_num[j+1]);
			arr_num[j+1]=temp;
			//System.out.println("after sorting "+i);
			//System.out.println("arr location i  "+arr_num[j+1]);
			if(!ifswapped)
			{
				System.out.println("ifswapped called");
				break;
			}
		}
		this.Printarr();
	}
	//printing sorted array 
	void Printarr()
	{
		for(int i=0;i<count;i++)
		{
			 System.out.println(arr_num[i]);
		}
		System.out.print("again ");
		this.ini();
	}
	public static void main(String[] args) 
	{
		//int n=5;
		//for (int i=1;i<n;++i)
		//{
		//	System.out.println(i);	
		//}
		insertionsort b1=new insertionsort();
		b1.ini();
	}
}
