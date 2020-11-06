//Author:Sushma
//Date:11/06/2020
//Desc:Java Program to Count of characters
import java.util.*;
public class Exercise2 {
	public static void main(String[] args) {
		char[] character= {'m','a','s','h','m','a','s'};
		Map<Character,Integer> charOccurence=countChars(character);//Calling method
		System.out.println(charOccurence);
	}

	private static Map<Character, Integer> countChars(char[] character) {
		Map<Character,Integer> countChar=new HashMap<Character,Integer>();//Creating hashmap
		for(char ch:character) {
			if(countChar.containsKey(ch)) {
				countChar.put(ch,countChar.get(ch)+1);//By using put method storing values
				}
			else {
				countChar.put(ch,1);
				}
		}
		for(Map.Entry<Character,Integer> entry: countChar.entrySet()) {//Using of entrySet
			countChar.put(entry.getKey(),entry.getValue());
		}
		return countChar;
	}
}
