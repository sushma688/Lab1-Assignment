//Author:Shakamuri Sushma
//Date:10/23/2020
//Desc: Java Program to find the second smallest number in array
import java.util.*;
public class SecondSmall {
	public static int SecondSmallest(int array[],int size)//Creating a method
	{
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(array[i]<array[j])
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		return array[1];
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of a array:");// Taking the size of the array
		int arraySize=sc.nextInt();
		int []array=new int[arraySize];
		for(int index=0;index<arraySize;index++)
		{
			array[index]=sc.nextInt();
			
		}
		int result=SecondSmallest(array,arraySize);// Calling Method
		System.out.println("Second smallest element is: "+result);//Prints Second smallest element
		sc.close();
	}
}
