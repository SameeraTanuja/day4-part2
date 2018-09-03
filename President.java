package com.capgemini.day4;

public class President extends Employee1{
	
	private double kilometerTravelled;
	private int tourAllowance;
	public final double telephoneAllowance=2000;
	


	
	
	
	public President(double basicSalary, long employeeId, String employeeName, double kilometerTravelled) {
		super(basicSalary, employeeId, employeeName);
		this.kilometerTravelled=kilometerTravelled;
		// TODO Auto-generated constructor stub
	}






	@Override
	public double calculateNetSalary()
	{
		return super.calculateNetSalary()+kilometerTravelled*8+telephoneAllowance;
		
	}

}
