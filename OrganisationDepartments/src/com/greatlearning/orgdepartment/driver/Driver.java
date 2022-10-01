package com.greatlearning.orgdepartment.driver;
import com.greatlearning.orgdepartment.service.*;

public class Driver {
	
	public static void main(String args[]) {
		HumanResource humanresource = new HumanResource();
		Admin admin = new Admin();
		Technical tech = new Technical();
		admin.departmentName();
		admin.getTodaysWork();
		admin.getWorkDeadline();
		admin.isTodayAHoliday();
		
		System.out.println(" ");
		
		humanresource.departmentName();
		humanresource.doActivity();
		humanresource.getTodaysWork();
		humanresource.getWorkDeadline();
		humanresource.isTodayAHoliday();
		
		System.out.println(" ");
		
		tech.departmentName();
		tech.getTodaysWork();
		tech.getWorkDeadline();
		tech.getTechStackInformation();
		tech.isTodayAHoliday();
		
		
		
	}
}