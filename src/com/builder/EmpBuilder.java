package com.builder;

public class EmpBuilder{
	public static void main(String[] args) {
		//constants
		int IS_PART_TIME=1;
		int IS_FULL_TIME=2;
		int EMP_RATE_PER_HR=20;
		//variables
		int sal;
		int emp_Hrs;
		//computation
		double empCheck = Math.floor(Math.random() * 10)%3 ;
		if(empCheck==IS_FULL_TIME)
		{
			emp_Hrs=8;
		}
		else if(IS_PART_TIME==empCheck )
		{
			emp_Hrs=4;
		}
		else
		{
			emp_Hrs=0;
		}
			
		    sal=(emp_Hrs*EMP_RATE_PER_HR);
			System.out.println(sal);
		}
	

	}
