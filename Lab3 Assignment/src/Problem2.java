//Author:Shakamuri Sushma
//Author:Shakamuri Sushma
//Date:26/10/2020
//Desc:Replacing the constants with the next character java program
import java.util.*;
public class Problem2 {
	public static void main(String[] args ) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the String");//Taking the input from the user
				String str=sc.nextLine();
				String r=alterString(str);//Calling a method
	}
	public static String alterString(String r)//Creating a method
	{
				int k=r.length();//Finding the length of the string
				for(int i=0;i<k;i++)
				{
			         char j=r.charAt(i);
				
					if(j=='a'||j=='e'||j=='i'||j=='o'||j=='u') {
						
						System.out.print(j);
						}
					else {
						char ch=r.charAt(i);
						ch++;
						System.out.print(ch);
					
						}
				}
				return r;		
	}

}




