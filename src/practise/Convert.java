package practise;

import java.util.Scanner;

public class Convert 
{

	public static void main(String[] args)
	{
		int num,days,months;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of days: ");
		num= s.nextInt();
		
		days= num%10;
		months=num/30;
		
		System.out.println(" "+num +" days "+ months +" months and "+ days +" days" );

	}

}
