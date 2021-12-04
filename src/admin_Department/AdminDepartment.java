package admin_Department;
import department_name.*;

public class AdminDepartment extends Super_Department 
{
	public AdminDepartment()
	{
		super.isTodayAHoliday();
	}
	
	
	public String departmentname() 
	{
			String dname ="Admin Department"; 
			return dname;
		
	}

	public String getTodaysWork()
		{
			String twork = "Complete your documents Submission";
			return twork;
			
		}
	public String getWorkDeadline()
		{
			String dwork ="Complete by EOD";
			return dwork;
			
		}
	
	
	

}
