//Author:Shakamuri Sushma
//Date:10/23/2020
//Desc: Java Program to sort the array
import java.util.*;
public class Problem3 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[4];
		System.out.println("Enter values of an array:");
		for(int i=0;i<4;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		Problem3 obj=new Problem3();//Creating Object
		obj.revArray(arr);
	}
	void revArray(int arr[]){
		String str=Arrays.toString(arr);
		Arrays.sort(arr);        //Sorting can be done using sort function
		System.out.println("sorted array is:"+Arrays.toString(arr));
	}
}
