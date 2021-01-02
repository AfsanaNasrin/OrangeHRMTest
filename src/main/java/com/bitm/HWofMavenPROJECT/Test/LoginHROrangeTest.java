package com.bitm.HWofMavenPROJECT.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bitm.HWofMavenPROJECT.Utils.DriverManager;
import com.bitm.HWofMavenPROJECT.Utils.UrlTextUtils;
import com.bitm.HWofMavenPROJECT.Utils.XpathUtils;

public class LoginHROrangeTest {
	
	private WebDriver driver = null;

	@Test
	public void homepagetitleverify() {
		driver = DriverManager.driver;
		driver.get(UrlTextUtils.URL.baseUrl);
        Assert.assertEquals(driver.getTitle(),UrlTextUtils.Text.homepageTitle);
        System.out.println("HomePage title verified!");
	}

	@Test(dependsOnMethods = "homepagetitleverify")
	public void logintest() {
		driver.findElement(By.xpath(XpathUtils.LoginModule.username)).sendKeys("Admin");
		driver.findElement(By.xpath(XpathUtils.LoginModule.password)).sendKeys("admin123");
		driver.findElement(By.id(XpathUtils.LoginModule.loginBtn)).click();		
		System.out.println("Logged In Successfully!");
		System.out.println("Added1");
	}	

}
