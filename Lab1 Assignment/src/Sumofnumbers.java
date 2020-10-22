//Author:Shakamuri Sushma
//Date:10/22/2020
//Dec:sum of first n natural numbers which are divisible by 3 or 5 
import java.util.*;
public class Sumofnumbers {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range:");
		int Range=sc.nextInt();
		System.out.println("The sum of first n natural numbers which are divisible by 3 or 5 is:"+calculateSum(Range));
	}

	public static int calculateSum(int Range) {
	    int sum=0;
		for(int i=1;i<=Range;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
}
