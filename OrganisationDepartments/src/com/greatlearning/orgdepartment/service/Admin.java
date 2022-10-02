package com.greatlearning.orgdepartment.service;
import com.greatlearning.orgdepartment.model.*;

public class Admin extends SuperDepartment{
	
	public String departmentName() {
		return(" Welcome to Admin Department");
		
	}
	public String getTodaysWork() {
		return(" Complete your documents Submission ");
		
	}
	public String getWorkDeadline() {
		return( " Complete by EOD ");
		
	}
	public void getFullInfo() {
		System.out.println(departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(isTodayAHoliday());
		
	}
	
}