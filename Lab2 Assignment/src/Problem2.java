//Author:Shakamuri Sushma
//Date:10/23/2020
//Desc: Java Program to sort array of string in Alphabetical order

import java.util.Scanner;
import java.util.Arrays;
public class Problem2 {
	public static void main(String[] args) {
		String[] names = new String[5];//Creating am array for strings
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the names: ");
		for (int i=0;i<((names.length/2)+1 );i++ ) {
			names[i] = sc.next();
		}
		for(int i=((names.length/2)+1 );i<names.length;i++) {
			names[i]=sc.next();
	    }
		Arrays.sort(names);//Sorting names using the sort function
		for (int i=0;i<names.length ;i++) {
			System.out.println(names[i]);//Printing the list sorted names
		}
	}
}
