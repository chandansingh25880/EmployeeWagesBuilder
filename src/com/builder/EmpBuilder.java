package com.builder;

public class EmpBuilder {

	public static final int Is_Part_Time = 1;
	public static final int Is_Full_Time = 2;
	public static final int Emp_Rate_Per_Hrs = 20;
	public static final int No_Of_Working_Days = 2;

	public static void main(String[] args) {
		int EmpWage = 0;
		int Emphrs = 0;
		int totalEmpWage = 0;
		for (int days = 0; days < No_Of_Working_Days; days++) {
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case Is_Part_Time:
				Emphrs = 4;
				break;
			case Is_Full_Time:
				Emphrs = 8;
				break;
			default:
				Emphrs = 0;
			}
			EmpWage = Emphrs * Emp_Rate_Per_Hrs;
			totalEmpWage += EmpWage;
			System.out.println("Emp Wage" + " " + EmpWage);
		}
		System.out.println("totalEmpWage" + " " + totalEmpWage);

	}

}