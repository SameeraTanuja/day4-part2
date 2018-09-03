package com.capgemini.day4;

public class Employee {
	private long employeeId;
	private String employeeName;
	private String employeeAddress;
	private double employeePhone;
	private double basicSalary;
	
	public final double specialAllowance=250.80;
	public final double hra=1000.50;
	


public Employee(long id, String name, String address, double phone) {
	this.employeeId=id;
	this.employeeName=name;
	this.employeeAddress=address;
	this.employeePhone=phone;
	
}
public double calculateSalary(){
	double salary;
	salary=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*hra/100);
	System.out.println(salary);
	return salary;
	
}
}



