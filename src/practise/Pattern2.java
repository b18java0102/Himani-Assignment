package practise;

import java.util.Scanner;

public class Pattern2 
{

	public static void main(String[] args) 
	{
		Scanner w = new Scanner(System.in);
		
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k>i;k--)
		{
			System.out.print(' ');
		}
		for(int j=1;j<=2*i-1;j++)
		{
			System.out.print(" * ");
		}
		System.out.println();
	}
		
	}
}


