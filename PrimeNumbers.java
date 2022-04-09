package assignment;
import java.util.Scanner;
public class PrimeNumbers {
	public static void main(String[] args)
	{
	int n,j=0,i=0;
	
	System.out.println("enter the number");
	Scanner Obj= new Scanner(System.in);
	n= Obj.nextInt();
	for(j=2;j<=n;j++)
	{
		boolean Flag=false;
	if(j==2)	
	
	System.out.println(j);	
	
	
	else
	{
	for(i=2;i<j;i++)
	{
	if(j%i==0)
	{
		Flag=true;
	break;
	
	}
	}
	if(Flag==false)
		
	System.out.println(j);
}
}}}

	


