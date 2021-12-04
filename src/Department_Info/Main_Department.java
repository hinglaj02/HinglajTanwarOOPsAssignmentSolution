package Department_Info;

import admin_Department.AdminDepartment;
import hr_Department.HrDepartment;
import tech_Department.techDepartment;


public class Main_Department {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	AdminDepartment obj1 = new AdminDepartment();
	System.out.println("Welcome to our " + obj1.departmentname());
	System.out.println(obj1.getTodaysWork());
	System.out.println(obj1.getWorkDeadline());
	System.out.println(obj1.isTodayAHoliday());
	System.out.println("");
	
	
	
	HrDepartment obj2 = new HrDepartment();
	System.out.println("Welcome to our " + obj2.departmentname());
	System.out.println(obj2.doActivity());
	System.out.println(obj2.getTodaysWork());
	System.out.println(obj2.getWorkDeadline());
	System.out.println(obj2.isTodayAHoliday());
	System.out.println("");

	techDepartment obj4= new techDepartment();
	System.out.println("Welcome to our " + obj4.departmentname());
	System.out.println(obj4.doActivity());
	System.out.println(obj4.getTodaysWork());
	System.out.println(obj4.getWorkDeadline());
	System.out.println(obj4.isTodayAHoliday());
	System.out.println("");
	
	

}
}