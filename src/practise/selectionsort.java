package practise;

import java.util.Scanner;

public class selectionsort 
{

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		int a[]=new int[7];
System.out.println("Enter the elements of array");
for(int i=0;i<7;i++)
{
	a[i]=s.nextInt();
	
}
for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i]>a[j])
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
System.out.println("Sorted array after pass "+ (i+1));
	for(int k=0;k<7;k++)
	{
		System.out.print(a[k]+" ");
	
	}
	System.out.println();
	}

}
}
