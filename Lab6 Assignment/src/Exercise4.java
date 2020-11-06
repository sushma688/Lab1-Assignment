//Author:Sushma
//Date:11/06/2020
//Desc:Java Program to display medalDetails
import java.util.*;
public class Exercise4 {
	public static void main(String[] args) {
		Map<Integer,Integer> student=new HashMap<>();//Creating hashMap named student
		student.put(101, 8);
		student.put(102, 90);
		student.put(103, 78);
		Map<Integer,String> medalDetails=getStudents(student);
		System.out.println(medalDetails);
	}

	private static Map<Integer, String> getStudents(Map<Integer, Integer> student) {
		Map<Integer,String> medalDetails=new HashMap<>();
		for(Map.Entry<Integer, Integer> entry:student.entrySet()) {//using entryset ,we can access values of hashmap
			if(entry.getValue()>90) {
				medalDetails.put(entry.getKey(),"Gold");
			}
			else if(entry.getValue()>80 && entry.getValue()<90) {
				medalDetails.put(entry.getKey(),"Silver");
			}
			else if(entry.getValue()>70 && entry.getValue()<80) {
				medalDetails.put(entry.getKey(),"Bronze");
			}
			
		}
		return medalDetails;//returning the value in terms of integer and string
	}
}
