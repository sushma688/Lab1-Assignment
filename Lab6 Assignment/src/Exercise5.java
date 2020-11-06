//Author:Sushma
//Date:11/06/2020
//Desc:Java Program to find second smallest element in a list
import java.util.*;
public class Exercise5 {
	public static void main(String[] args) {
		Integer numArray[]= {52,74,12,59,63,57};//Assigning the elements to numArray
		int secondSmallestElement=getSecondSmallest(numArray);//Calling the method
		System.out.println("Second Smallest element is : "+secondSmallestElement);
	}

	
		private static int getSecondSmallest(Integer[] numArray) {
		List<Integer> element=Arrays.asList(numArray);
		Collections.sort(element);//Sorting the elements using sort method
		//return element;
		System.out.println("Sorting Array\n"+element);
		Integer secondSmallest=element.get(1);//By using get method we can get second smallest element after sorting
		return secondSmallest;//returning the second smallest element to main method
	}
}
