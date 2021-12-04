package tech_Department;
import department_name.*;


public class techDepartment extends Super_Department
{
public techDepartment()
{
	super.isTodayAHoliday();
}
public String departmentname() 
	{
			String dname ="Tech Department"; 
			return dname;
		
	}

	public String getTodaysWork()
		{
			String twork = "Complete coding of module 1";
			return twork;
			
		}
	public String getWorkDeadline()
		{
			String dwork ="Complete by EOD";
			return dwork;
			
		}
	public String doActivity()
	{
		String activity ="Core Java";
		return activity;
		
	}
}
