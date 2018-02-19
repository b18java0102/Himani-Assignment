package practise;

import java.util.Scanner;

public class binarysearch
{

	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		int a[]= new int[5];
		int mid;
		System.out.println("enter the elements of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
		System.out.println("Enter the elements to be searched");
		int x=s.nextInt();
		
			mid = a.length/2;
			if(x==a[mid])
			{
				System.out.println("element found"+ (mid+1));
			}
			else if ( x < a[mid])
			{
					for(int i=0;i<mid;i++)
					{
						if(x==a[i])
						{
							System.out.println("Element: " + (i+1));
							break;
						}
					}
				}
			}
		}

	

