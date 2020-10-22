//Author:Shakamuri Sushma
//Date:10/22/2020
//Dec:Java program for Whether the number is in increasing order
import java.util.Scanner;
public class CheckIncreasing {
	public static void main(String args[] ) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter a number : ");
		int num = sc.nextInt();
		CheckIncreasing src=new CheckIncreasing();
		System.out.println(src.checkNumber(num));
		}
		public boolean checkNumber(int input)
		{
			int lastSeen=10;
			int current;
			while(input>0)
			{
				current=input%10;
				if(lastSeen<current)
				return false;
				lastSeen=current;
				input/=10;
			}
			return true;
		}
}