package assignment;

import java.util.Scanner;

public class PaternPrinting2 {
	public static void main(String[] args)
	{
		int i=0,j=0,n;
		
	Scanner Obj=new Scanner(System.in);
	System.out.println("enter the number");
	n=Obj.nextInt();
	for(i=1;i<=n;i++)
	{
		System.out.println();
		for(j=1;j<=i;j++)
		{
			System.out.print(j);
		}
	}


	}
	}


