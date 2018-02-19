package practise;

import java.util.Scanner;

public class PatternH 
{

	public static void main(String[] args) 
	{
		Scanner d = new Scanner(System.in);
		int i,j,k;
		
		for(i=1;i<=5;i++)
		{
			for(k=1;k<=4;k++)
			{
				System.out.print(' ');
			}
			for(j=1;j<=4;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		
	}

}
