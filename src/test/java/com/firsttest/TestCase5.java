package com.firsttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase5 {
	@Test
	public void test_APP() {
		
		
		RemoteWebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		String expectedTitle="Automation Testing Practice";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle,"Title");
		System.out.println("Verifying presence of wikipidia-icon");
		WebElement element =driver.findElement(By.xpath("//img[@class=\"wikipedia-icon\"]"));
		Assert.assertTrue(element.isDisplayed());
		WebElement element2=driver.findElement(By.className("wikipedia-search-button"));
		Assert.assertTrue(element2.isDisplayed());
		driver.close();

	}

}
