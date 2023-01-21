package com.firsttest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestCase3 {
	@Test
	public void orangeHrm() {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		String actual_url=driver.getCurrentUrl();
		System.out.println(actual_url);
		String desired_url="com.firsttest.TestCase3.orangeHrm";
		if (actual_url.equals(desired_url)) {
			System.out.println("Pass");
			
		} else {
			System.out.println("fail");

		}
		String actual_title=driver.getTitle();
		System.out.println(actual_title);
		String desired_title="OrangeHRM";
		if (actual_title.equals(desired_title)) {
			System.out.println("Pass");
			
		} else {
			System.out.println("Fail");

		}
		driver.close();
		

	}

}
