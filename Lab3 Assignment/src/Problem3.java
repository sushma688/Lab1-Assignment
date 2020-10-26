//Author:Shakamuri Sushma
//Date:26/10/2020
//Desc:Java program to modify a number it as per the requirement.
import java.util.*;
import java.lang.*;
public class Problem3 {

		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value");
			int num=sc.nextInt();
			int r=modifyNumber(num);
		}
		public static int modifyNumber(int r)
		{
	
			int sum=0;
			int h=r%10;
			while(r!=0)
			{
				int a=r%10;
				sum=sum*10+a;
				r=r/10;
				
			}		
			
			while(sum!=0)
			{
				int k=sum%10;
				sum=sum/10;
				int l=sum%10;
				
				int result=(k-l);
				System.out.print(Math.abs(result));
			
			}
			//System.out.print(h);
			return r;
	
		}

	}



