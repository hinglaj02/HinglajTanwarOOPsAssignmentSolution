package hr_Department;
import department_name.*;




public class HrDepartment extends Super_Department
{
 public HrDepartment()
 {
	 super.isTodayAHoliday();
 }
 public String departmentname() 
	{
			String dname ="Hr Department"; 
			return dname;
		
	}

	public String getTodaysWork()
		{
			String twork = "Fill today’s timesheet and mark your attendance";
			return twork;
			
		}
	public String getWorkDeadline()
		{
			String dwork ="Complete by EOD";
			return dwork;
			
		}
	public String doActivity()
	{
		String activity ="Team Lunch";
		return activity;
		
	}
	
}
