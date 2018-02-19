package practise;

import java.util.Scanner;

public class Pattern3 
{

	public static void main(String[] args) 
	{
		int i,k,j;
		
		Scanner s = new Scanner(System.in);
		for(i=1;i<=5;i++)
		{
			for(j=i;j>=1;j--)
			{
				System.out.print(j%2);
			}
			System.out.println();
		}
	}

}
