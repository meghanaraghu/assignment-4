package assignment;
import java.util.Scanner;

public class SumOfnNaturalNumbers
{
	public static void main(String[] args)
	{
	
Scanner obj= new Scanner(System.in);
int n,sum=0,i;
System.out.println("enter the number");
n=obj.nextInt();
for(i=0;i<=n;i++)
{
	sum+=i;
	
}
System.out.println("sum of " +n+ "natural numbers is" +sum);
}
}