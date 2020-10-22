//Author:Shakamuri Sushma
//Date:10/22/2020
//Dec:Java Program for Creating a method to find sum of cubes of the digits of an n digit number
import java.util.*;
public class cubeSum {
	public static void main(String args[]){		
		Sum();
		}

	private static void Sum() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		int rem=0;
		int sumofcubes=0;
		while(n>0)
		{
		rem=n%10;
		sumofcubes=sumofcubes+(rem*rem*rem);
		n=n/10;
		}
	
	System.out.println("Sum of the cubes of the digits in a number:"+sumofcubes);
	}
}
