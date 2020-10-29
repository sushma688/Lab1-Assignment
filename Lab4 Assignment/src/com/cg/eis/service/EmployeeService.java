//Author:Sushma
//Date:29/10/2020
package com.cg.eis.service;
import com.cg.eis.bean.Employee;
public interface EmployeeService {
	Employee getEmployeeDetails();
	String findInsuranceScheme(Employee emp);
	void displayDetails(Employee emp);
}
