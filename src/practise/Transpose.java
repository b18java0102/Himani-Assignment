package practise;

import java.util.Scanner;

public class Transpose
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int i,j,r;
		System.out.println("Enter the size of the matrix: ");
		r=s.nextInt();
		
		int[][]a=new int[r][r];
		int[][]b=new int[r][r];
		
		//User Element
		System.out.println("Enter the Elements of matrix: ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<r;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		
		//print matrix
		System.out.println("Elements of matrix are: ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<r;j++)
			{
				System.out.print(a[i][j]+ "\t");
			}
			System.out.println();
	}
		//Transpose Matrix
		
		System.out.println("Enter the Elements of matrix: ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<r;j++)
			{
				b[i][j]=a[j][i];
			}
		}
		
		//print matrix
		
		System.out.println("Transpose of matrix :");
		System.out.println("Enter the Elements of matrix: ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<r;j++)
			{
				System.out.print(b[i][j]+ "\t");
			}
			
		System.out.println();
		}
	}

}
