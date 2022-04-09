package assignment;
import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args)
	{
		Scanner Obj = new Scanner(System.in);
		int n;
		System.out.println("enter the number");
		n=Obj.nextInt();
		if(n%2==0)
			System.out.println("given number " +n+ " is even");
		else
			System.out.println("given number " +n+ " is odd");
		
		
	}
}


