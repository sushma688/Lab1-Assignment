//Author:Sushma
//Date:11/06/2020
//Desc:Java Program to sort names using hashmap
import java.util.*;

public class Hash {
	public static void main(String args[]) {
	HashMap <Integer,String> hashMap=new HashMap <Integer,String>();
	hashMap.put(1, "Mashma");
	hashMap.put(2,"Sushma");
	hashMap.put(3,"Manisha");
	List<String> sortedHashMap=new ArrayList<String>();
	sortedHashMap=getValues(hashMap);//Calling method named getValues
	System.out.println(sortedHashMap);
	
	
}

private static List<String> getValues(HashMap<Integer, String> hashMap) {
	
	List<String> sortedHashMap=new ArrayList<String>();//Creating a list
	for(Map.Entry<Integer, String> entry:hashMap.entrySet()) {//Using hashmap entry to get values
		sortedHashMap.add(entry.getValue());
	}
	Collections.sort(sortedHashMap);//By using sort method ,we can sort names
	
	return sortedHashMap;
	}
}
