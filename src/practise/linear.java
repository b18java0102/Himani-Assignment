package practise;

import java.util.Scanner;

public class linear {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int arr[]={3,1,5,8,2};
	int flag=0;
	System.out.println("Enter the no to be searched");
	int x=s.nextInt();
	for(int i=0;i<arr.length;i++)
	{
		if(x==arr[i])
			{
			System.out.println("Element found: " + (i+1) );
			 flag=1;
			break;
			}		
			
	}
	if(flag==0)
	{
		System.out.println("Element not found");
	}

}}
