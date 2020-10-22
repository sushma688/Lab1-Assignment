//Author:Shakamuri Sushma
//Date:10/22/2020
//Dec: Java Program for the entered number is power of two or not
import java.util.Scanner;

public class checkPower {
	public boolean checkNumber(int n)
	{
		int j=1;
		while(true)
		{
			j=j*2;
			if(j==n)
			{
				return true;
			}
			else if(j>n)
			{
				return false;
			}
		}
	}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value:");
int n=sc.nextInt();
checkPower labbook=new checkPower();
boolean y=labbook.checkNumber(n);
System.out.println(y);
}


	}

