package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GSRShop {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ziaha\\git\\AutomationLecture\\AutomationLecture\\Driver");	
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.yahoo.com");
		
	}

}
