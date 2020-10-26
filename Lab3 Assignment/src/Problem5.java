//Author:Shakamuri Sushma
//Date:26/10/2020
//Desc: java program to Know whether positive or negative string
import java.util.*;
public class Problem5 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String r=sc.nextLine();
		String str=checkPositive(r);
	}
	public static String checkPositive(String str) {
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i+1)<str.charAt(i))
			{
				System.out.println("Negative String");
			}
			else
			{
				System.out.println("Positive String");
			}
		}
		return str;
	}
}
