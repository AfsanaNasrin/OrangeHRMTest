package com.bitm.HWofMavenPROJECT.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

	static {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mst. Afsana Nasrin\\Downloads\\SeleniumFiles\\chromedriver.exe");
	}

	public static WebDriver driver = new ChromeDriver();

	DriverManager() {

	}
}
