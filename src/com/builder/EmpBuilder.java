package com.builder;

public class EmpBuilder{
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Detail");
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR = 20;
		int empHrs = 0;
		int empWage = 0;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME) {
			empHrs = 8;
			System.out.println("Employee is present");
		} else {
			empHrs = 0;
			System.out.println("Employee is Abscent");

		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage " + empWage);

	}

}