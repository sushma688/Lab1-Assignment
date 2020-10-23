//Author:Shakamuri Sushma
//Date:10/23/2020
//Desc:Java program for parking cars
import java.util.*;
import java.lang.*;
import java.io.*;
public class Problem5 {
	public static void main(String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("The Car parking capacity:");
		for(int i=0;i<5;i++) {
			System.out.println(i+1+" "+"store");
			arr[i]=sc.nextInt();
		}
		int arr1[]=new int[5];
		for(int i=0;i<5;i++) {
			System.out.println("How many cars to be parking in "+i+" ");
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++) {
			System.out.println(i+1+" "+"floor");
			System.out.println("No of parked cars are "+arr1[i]);
			System.out.println("no of empty car spaces "+(arr[i]-arr1[i]));
			System.out.println();
		}
	}
}











