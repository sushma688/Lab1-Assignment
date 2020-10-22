//Author:Shakamuri Sushma
//Date:10/22/2020
//Dec: Java program for Fibonacci Series
import java.util.*;
public class FibonacciSeries {
	public int Fibonacci(int n)
	{
		int x=1;
		int y=1;
		int i=2;
		int z=0;
		while(i!=n)
		{
			z=x+y;
			x=y;
			y=z;
			i++;
		}
		return z;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=sc.nextInt();
		FibonacciSeries Lab1=new FibonacciSeries();
		System.out.println (Lab1.Fibonacci(n));
	}

		
	}


