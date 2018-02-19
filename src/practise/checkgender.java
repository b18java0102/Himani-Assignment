package practise;

import java.util.Scanner;

public class checkgender 
{

	public static void main(String[] args) 
	{
		Scanner o = new Scanner(System.in);
		System.out.println("Enter Age of the person: ");
		int age = o.nextInt();
		
		System.out.println("Enter Gender: ");
		char Gender = o.nextLine().charAt(0);
		if(age>=21 && Gender=='M')
			
			{
			System.out.println("eligible to Marry: ");
			}
			else if(age>=18 && Gender=='F')
				{
				System.out.println("Eligible to Marry: ");
				}
				else
					
				{
					System.out.println("Not Eligible to Marry: ");
				}
			
			
		
	}
}

	