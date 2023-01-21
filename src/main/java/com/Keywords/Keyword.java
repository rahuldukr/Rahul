package com.Keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.testing.InvallidBrowserNameException;

public class Keyword {

	public static WebDriver driver = null;

	public static void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Safari")) {
			driver = new SafariDriver();
		} else {
			throw new InvallidBrowserNameException(browserName);
		}

	}

	public static void launchedURL(String url) {
		driver.get(url);

	}

	public static void closeBrowser() {
		driver.close();

	}

	public static void quitBrowser() {
		driver.quit();

	}
	public static void enterText(WebElement element,String text) {
		element.sendKeys(text);
		

	}
	public static void enterText(String xpath,String text) {
		driver.findElement(By.id(text));
		

	}
	public static void clickOn(WebElement element) {
		element.click();

	}
	public static void clickOn(String xpath) {
		driver.findElement(By.xpath(xpath));
		

	}
	public static void hitKeys( String xpath,Keys key) {
		driver.findElement(By.id(xpath)).sendKeys(key);
		

	}
	

}
