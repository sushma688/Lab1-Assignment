//Author:Sushma
//Date:11/06/2020
//Desc:Java Program for squaring each number
import java.util.*;
public class Exercise3 {
	public static void main(String[] args) {
		int sqNum[]= {88,6,98,91,904,92};
		Map<Integer,Integer> squareNum=getSquares(sqNum);//Creating map and calling getSquares method
		System.out.println(squareNum);
		
	}

	private static Map<Integer, Integer> getSquares(int[] sqNum) {
		
		Map<Integer,Integer> squareMap=new HashMap<>();
		for(int square:sqNum) {
			squareMap.put(square,square*square);//By using put method ,we can put by squaring a number.
		}
		return squareMap;//returning the value to main method
	}
}
