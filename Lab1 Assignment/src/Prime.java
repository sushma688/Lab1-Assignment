//Author:Shakamuri Sushma
//Date:10/22/2020
//Dec: Java program To print Prime Numbers in given range
import java.util.*;
public class Prime {
	 public static void main(String[] args)
	 {
		 int n;int p;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number:");
		 n=sc.nextInt();
		 System.out.println("The Prime numbers are:");
		 for(int i=2;i<n;i++)
		 {
			 p=0;
			 for(int j=2;j<i;j++)
			 {
				 if(i%j==0)
					 p=1;
			 }
			 
			 if(p==0)
			 {

				 System.out.println(i);
			 }
			
		 }
		 
	 }

}
