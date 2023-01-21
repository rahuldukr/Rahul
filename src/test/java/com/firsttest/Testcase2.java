package com.firsttest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.Keywords.Keyword;
import com.testing.TestBase;

public class Testcase2 extends TestBase {
	@Test
	public void m1() throws InterruptedException {
		
		Keyword.enterText("twotabsearchtextbox", "polo for men");
		Keyword.hitKeys("twotabsearchtextbox", Keys.RETURN);
		
		
		
		Keyword.clickOn("//body[contains(@class,\\\"a\\\")]");
		
		
		
		
		}
        
}
