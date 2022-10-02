package com.greatlearning.orgdepartment.driver;
import com.greatlearning.orgdepartment.service.*;

public class Main {
	
	public static void main(String args[]) {
		HumanResource humanresource = new HumanResource();
		Admin admin = new Admin();
		Technical tech = new Technical();
		admin.getFullInfo();
		
		System.out.println(" ");
		
		System.out.println(humanresource.departmentName());
		System.out.println(humanresource.doActivity());
		System.out.println(humanresource.getTodaysWork());
		System.out.println(humanresource.getWorkDeadline());
		System.out.println(humanresource.isTodayAHoliday());
		
		System.out.println(" ");
		
		System.out.println(tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
		
		
		
	}
}