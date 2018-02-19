package practise;

import java.util.Scanner;

public class Areasquare
{

	public static void main(String[] args) 
	{
	
		Scanner in = new Scanner(System.in);
		System.out.println("enter the length of the sqaure: ");
		int length = in.nextInt();
		
		//Calculate Area
		int Area = length*length;
		
		System.out.println("The area of the square is: " + Area);
		Area= in.nextInt();
	}

}
