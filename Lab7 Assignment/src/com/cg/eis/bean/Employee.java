//Author:Shakamuri Sushma
//Date:11/07/2020
//Desc:, create “Employee” class with different attributes such as id, name, salary, designation, insuranceScheme.
package com.cg.eis.bean;

public class Employee {
	private long id;
	private double salary;
	private String name, designation, insuranceScheme;

	public Employee(long id, String name, double salary, String designation) {//Creating parameterized constructor
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}

	public void setId(long id) {//Creating getters and setters for attributes
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDesignation() {
		return designation;
	}

	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}

	public String getInsuranceScheme() {
		return insuranceScheme;
	}

	@Override
	public String toString() {//Overriding string method
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", insuranceScheme=" + insuranceScheme + "]";

	}
}
