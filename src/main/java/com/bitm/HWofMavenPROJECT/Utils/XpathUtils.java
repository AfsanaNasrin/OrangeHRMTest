package com.bitm.HWofMavenPROJECT.Utils;

public class XpathUtils {
	
public static class LoginModule{
		
		public static final String username="/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[2]/input";
		public static final String password="/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[3]/input";
		public static final String loginBtn="btnLogin";
	}
	
	public static class assignLeaveModule{
		
		public static final String assignleaveBtn="/html/body/div[1]/div[3]/div/div[2]/div[1]/div/div/div/fieldset/div/div/table/tbody/tr/td[1]/div/a/img";
		public static final String EmployeeName="//*[@id=\"assignleave_txtEmployee_empName\"]";
		public static final String LeaveType="//*[@id=\"assignleave_txtLeaveType\"]";
		public static final String FromDate="//*[@id=\"assignleave_txtFromDate\"]";
		public static final String FromDateSelect="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[4]/a";
		public static final String ToDate="//*[@id=\"assignleave_txtToDate\"]";
		public static final String ToDateSelect="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[6]/a";
		public static final String Comment="//*[@id=\"assignleave_txtComment\"]";
		public static final String SubmitAssign="//*[@id=\"assignBtn\"]";
	}

}
