package practise;

import java.util.Scanner;

public class Swap 
{

	public static void main(String[] args)
	{
		int x,y,change;
		System.out.println("Enter x and y: ");
		Scanner in = new Scanner(System.in);
		
		x=in.nextInt();
		y=in.nextInt();
		
		System.out.println(" Before Swapping x = "+ x +" y = "+ y + " ");
		change=x;
		x=y;
		y=change;
		
		System.out.println("After Swapping  x = "+ x +"  y = "+ y+" ");
				

	}

}
