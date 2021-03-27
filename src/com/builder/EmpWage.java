package com.builder;

class EmpWage {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH = 10;

	static void ComputeEmpWage() {

	public static int ComputeEmpWage(String company, int empRatePerHour,
				int numOfWorkingDays, int maxHoursPerMonth) {
			//Variables
			int empHrs = 0;
			int totalEmpHrs = 0;
			int totalWorkingDays = 0;

			while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
			while (totalEmpHrs <= maxHoursPerMonth &&
					totalWorkingDays < numOfWorkingDays) {
				totalWorkingDays++;
				int empCheck = (int) Math.floor(Math.random() * 10) % 2;
				int empCheck = (int) Math.floor(Math.random() * 10) % 3;
				switch (empCheck) {
				case IS_PART_TIME:
					empHrs = 8;
					empHrs = 4;
					break;
				case IS_FULL_TIME:
					empHrs = 4;
					empHrs = 8;
					break;
				default:
					empHrs = 0;
				}
				totalEmpHrs += empHrs;
				System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " + empHrs);
			}
			int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
			System.out.println("Total Emp Wage: " + totalEmpWage);
			int totalEmpWage = totalEmpHrs * empRatePerHour;
			System.out.println("Total Emp Wage for Company: " +company+" is: "+totalEmpWage);
		 return totalEmpWage;
		}

	public static void main(String[] args) {
		ComputeEmpWage();
		ComputeEmpWage("Dmart", 20, 2, 10);
		ComputeEmpWage("Reliance", 10, 4, 20);

	}
}

