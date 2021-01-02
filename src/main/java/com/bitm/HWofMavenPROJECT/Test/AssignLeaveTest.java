package com.bitm.HWofMavenPROJECT.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.bitm.HWofMavenPROJECT.Utils.DriverManager;
import com.bitm.HWofMavenPROJECT.Utils.XpathUtils;

public class AssignLeaveTest {
	
	private WebDriver driver = null;

	@Test
	public void assignleavetest() {
		driver = DriverManager.driver;
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathUtils.assignLeaveModule.assignleaveBtn)));

		driver.findElement(By.xpath(XpathUtils.assignLeaveModule.assignleaveBtn)).click();
		
		driver.findElement(By.xpath(XpathUtils.assignLeaveModule.EmployeeName)).sendKeys("Odis Adalwin");
		new Select(driver.findElement(By.xpath(XpathUtils.assignLeaveModule.LeaveType))).selectByVisibleText("CAN - Vacation");
		driver.findElement(By.xpath(XpathUtils.assignLeaveModule.FromDate)).click();
		driver.findElement(By.xpath(XpathUtils.assignLeaveModule.FromDateSelect)).click();
		driver.findElement(By.xpath(XpathUtils.assignLeaveModule.ToDate)).click();
		driver.findElement(By.xpath(XpathUtils.assignLeaveModule.ToDateSelect)).click();
		driver.findElement(By.xpath(XpathUtils.assignLeaveModule.Comment)).sendKeys("My homeWork!");
		driver.findElement(By.xpath(XpathUtils.assignLeaveModule.SubmitAssign)).click();
		
		
		
		
	
}
}
