//Author:Sushma
//Date:11/06/2020
//Desc:Java Program to sort reverse array
import java.util.*;
public class Exercise7 {
public static void main(String[] args) {
		
		List<Integer> result=new ArrayList<>(Arrays.asList(74,85,21,93,14));//converting arrays to list
		List<Integer> reverse = getSorted(result);//creating list and calling method
		System.out.println("Sorted Reverse Array\n "+reverse);
	}
	
	private static List<Integer> getSorted(List<Integer> result) {
		List<Integer> reverseSorted=new ArrayList<Integer>(result);
		Collections.reverse(reverseSorted);//by using reverse function we reverse the list
		 for(int i=0;i>result.size();i++) {
			 reverseSorted.add(i);
		 }
		 System.out.println("Reverse Sorted Array\n "+reverseSorted);
		 Collections.sort(reverseSorted);
		 for(int i=0;i>result.size();i++) {
			 reverseSorted.add(i);
		 }
		 return reverseSorted;
	}
}
