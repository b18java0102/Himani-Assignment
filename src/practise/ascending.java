package practise;

import java.util.Scanner;

public class ascending 
{

	public static void main(String[] args)
	{
		Scanner a = new Scanner(System.in);
		int []d = new int[4];
		{
			System.out.println("Enter the elements: ");
		for(int i=1;i<=4;i++)
		{
			
			d[i]= a.nextInt();
		}
		
		// print the range
		System.out.println(" Elements of matrix are: ");
		for(int i=1;i<=4;i++)
		{
			System.out.print(d[i] + "\t");
		}
		System.out.println();
	}

}
}
