//Author:Shakamuri Sushma
//Date:10/22/2020
//Dec: Java program that simulates a traffic light
import java.util.*;
public class TrafficLight {
	public static void main(String args[])
	{
		String color;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the color:");
		color=sc.nextLine();
		switch(color)
		{
		case "red":
			System.out.println("stop");
			break;
		case "yellow":
			System.out.println("Ready");
			break;
		case "green":
			System.out.println("Go");
			break;
			
		}
	}
}
