//Author:Sushma
//Date:11/03/2020
//Desc:Java program to validate name
package validatename;
import java.util.*;
public class ValidFullNameException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/**
		 * input from the user
		 */
		System.out.println("Enter First Name of an Employee");
		String fname = sc.next();
		
		System.out.println("Enter Last Name of an Employee");
		String lname = sc.next(); // last name of an employee
		sc.close(); // scanner close

		try {
			/**
			 * check the full name of an employee is blank or not check the first name or
			 * last name contain digit if string contain digit then throw
			 * InvalidNameException
			 */
			if (fname.equals("null")||lname.equals("null")) {

				throw new InvalidNameException("Please Enter valid  Name of an Employee");
				
			} 
		} catch (InvalidNameException e) {
			// print the exception
			System.out.println(e.getMessage());

		}
	}

}
