//Author:Shakamuri Sushma
//Date:26/10/2020
//Desc: java program to number of characters ,lines and words
import java.util.*;
public class Problem4 {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String");
			String str=sc.nextLine();
			int words=1,character=0,line=0;
			for(int i=0;i<str.length();i++)
			{
			if(str.charAt(i)==' ')//By comaparing with space we calculate no.of words.
			{
				words++;
			}
			if(str.charAt(i)=='\n')
			{
				line++;
			}
	        character++;
		}

			System.out.println("characters ="+ character+" words="+words+" Lines="+line);
	}
	}


