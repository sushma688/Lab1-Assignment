//Author:Shakamuri Sushma
//Date:26/10/2020
//Desc: java program to generate a mirror image of a string and adding to the existing string
import java.util.*;

public class Problem1 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String");
			String str=sc.nextLine();
			String r=getImage(str);
		   }
			public static String getImage(String r){
			int k=r.length();//Finding length of a string
			//System.out.println(k);
			for(int i=0;i<k;i++)
			{
				System.out.print(r.charAt(i));//Printing a string
			}
			System.out.print("||");
	      
			for(int i=(k-1);i>=0;i--)
			{
				System.out.print(r.charAt(i));//Printing a reverse of a string
			}
			
			return r;
}
}
		



