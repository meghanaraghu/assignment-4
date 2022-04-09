package assignment;
import java.util.Scanner;

public class PatternPrinting {
	public static void main(String[] args)
	{
		int i,j,k,n;
		Scanner obj= new Scanner(System.in);
		System.out.println("enter the size");
		n=obj.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println(" ");
			for(j=1;j<=n;j++)
			{
				
				if(i==1||i==n||j==1||j==n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
		}
	}

}
