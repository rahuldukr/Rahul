package com.firsttest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Testcase4 {
	@Test
	public void pricesinascendingordercarwale() throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
		driver.get("https://www.carwale.com");
		driver.findElement(By.xpath("//input[@ placeholder=\"Type to select car name\"]")).click();
		driver.findElement(By.xpath("//input[@ placeholder=\\\"Type to select car name\\\"]")).sendKeys("Hyundai Creta");
		Thread.sleep(3000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),\"View More Versions\")]/preceding-sibling::table")));
		List<WebElement>prices=driver.findElements(By.xpath("//div[@data-sectionhash=\"versions\"]/descendant::table/tbody/tr/td[2]/span"));
		for (WebElement price : prices) {
			System.out.println(price.getText());
		}
		

	}

}
