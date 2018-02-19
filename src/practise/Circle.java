package practise;

import java.util.Scanner;

public class Circle 
{

	public static void main(String[] args)
	{
		float r;
		Double C,A;
		Scanner w = new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");
		
		r=w.nextInt();
		
		C=2*3.24*r;
		A=3.14*r*r;
		
		System.out.println("Circumference of a circle =" + C);
		
		System.out.println("Area of a circle =" + A);
	}

}
