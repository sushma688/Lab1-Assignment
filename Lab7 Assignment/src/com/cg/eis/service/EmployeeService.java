//Author:Shakamuri Sushma
//Date:11/07/2020
//Desc:code for services offered in Employee Insurance System
package com.cg.eis.service;

import com.cg.eis.bean.Employee;
import java.util.*;
public class EmployeeService implements IEmployeeService {
	private Map<Long, Employee> employeeRepository;

	/**
	 * Create a new service.
	 */
	public EmployeeService() {
		employeeRepository = new HashMap<Long, Employee>();
	}

	@Override
	public void addEmployee(Employee emp) {
		employeeRepository.put(emp.getId(), emp);
		System.out.println("Employee successfully added.");

	}

	@Override
	public String findInsuranceScheme(Employee emp) {
		if (emp.getSalary() > 5000 && emp.getSalary() < 20000 && emp.getDesignation().equals("System Associate")) {
			return "Scheme C";
		} else if (emp.getSalary() >= 20000 && emp.getSalary() < 40000 && emp.getDesignation().equals("Programmer")) {
			return "Scheme B";
		} else if (emp.getSalary() >= 40000 && emp.getDesignation().equals("Manager")) {
			return "Scheme A";
		} else if (emp.getSalary() < 5000 && emp.getDesignation().equals("Clerk")) {
			return "No Scheme";
		}
		return "No Scheme";

	}
//From here these 2 are methods to be done in service 
	@Override
	public void displayEmployeeDetails(String insuranceScheme) {
		employeeRepository.forEach((Long id, Employee e) -> {//Using foreach loop
			if (e.getInsuranceScheme().equals(insuranceScheme)) {
				System.out.println(e);
			}
		});

	}

	@Override
	public boolean deleteEmployee(long employeeId) {
		Set<Long> employeeIds = employeeRepository.keySet();//Creating set named emploeeIds
		for (Long l : employeeIds) {
			if (l == employeeId) {
				employeeRepository.remove(l);
				return true;
			}
		}
		return false;
	}
}
