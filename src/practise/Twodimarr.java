package practise;

import java.util.Scanner;

public class Twodimarr
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int[][]a = new int[3][3];
		for(int i=0;i<3;i++)
		{
			for( int j=0;j<3;j++)
			{
				a[i][j] = s.nextInt();
				
			}
		}
		System.out.println(" The Elements are:");
		for(int i=0;i<3;i++)
		{
			for( int j=0;j<3;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		int max = a[0][0];
		for(int i=0;i<3;i++)
		{
			for( int j=0;j<3;j++)
			{
				if(a[i][j] > max)
				{
					max=a[i][j];
				}
			}
		}
		System.out.println("Maximum Value is: ");
	}
	

}

