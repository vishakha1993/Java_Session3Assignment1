import java.util.Scanner;


public class math_functions
{
	public static void main(String arg[])
	{
		int num;
		Scanner scan=new Scanner(System.in);
		
		
	    System.out.println("Enter Number : ");
		num=scan.nextInt();
	
		System.out.println("Square root of given number is : "+Math.sqrt(num));
		System.out.println("Cube root of given number is : "+Math.cbrt(num));
	}



}

