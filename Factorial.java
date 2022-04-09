package assignment;
import java.util.Scanner;
public class Factorial {
public static void main(String[] args)
{
int n,i;
int fact=1;
Scanner obj= new Scanner(System.in);
System.out.println("enter the number");

n=obj.nextInt();
if(n==0)
	System.out.println(1);
for(i=1;i<=n;i++)
{
	fact=fact*i;
}
System.out.println("factorial of " +n+ " is"  +fact);

}
}
