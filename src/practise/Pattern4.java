package practise;

import java.util.Scanner;

public class Pattern4 
{

	public static void main(String[] args)
	{
		Scanner a = new Scanner(System.in);
		
		for(int i=1;i<=3;i++)
		{
			int z=97;
			for(int k=2;k<=i;k++)
			{
				{
					System.out.print(" ");
				}
				for(int j=1;j<i;j++)
				{
					System.out.println((char)z);
					z=z+1;
				}
				int y=z-2;
				
				for(k=1;k<i;k++)
				{
					System.out.print((char)y);
					y--;
				}
				System.out.println();
			}
		
		//REVERSE
		for(int c=2;c>=1;c--)
		{
			int d=97;
			for(int k=2;k>=c;k--)
			{
				{
					System.out.print(" ");
				}
				for(int j=1;j<c;j++)
				{
					System.out.println((char)d);
					d=d+1;
				}
				int y=d-2;
				
				for(k=c;k>1;k--)
				{
					System.out.print((char)y);
					y--;
				}
				System.out.println();
				}
			}
		}
	}
}
