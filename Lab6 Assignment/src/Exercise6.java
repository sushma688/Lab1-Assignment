//Author:Sushma
//Date:11/06/2020
//Desc:Java Program to display the voterList
import java.util.*;
public class Exercise6 {
	public static void main(String[] args) {
		Map<Integer,Integer> voterList=new HashMap<Integer,Integer>();//Creating map and putting key and value pairs to voterList
		voterList.put(101, 38);
		voterList.put(102, 15);
		voterList.put(103, 27);
		voterList.put(104, 69);
		List<Integer>voterDetails=votersList(voterList);//Creating List and callig method
		System.out.println(voterDetails);
	}

	private static List<Integer> votersList(Map<Integer, Integer> voterList) {
		List<Integer> voterDetails=new ArrayList<>();
		for(Map.Entry<Integer, Integer>entry: voterList.entrySet()) {//using entry method we can get values
			if(entry.getValue()>18) {
				voterDetails.add(entry.getKey());
			}
		}
		return voterDetails;//returning the details of voters who are greater than 18
	}
}
