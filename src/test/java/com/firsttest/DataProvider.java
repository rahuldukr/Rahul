package com.firsttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DataProvider {
	@Test(dataProvider="Books Data")
	public void m1(String booktitle,String author) {
		System.out.println("Book Title: "+booktitle+"\t"+"Author: "+author);
		
		
		

	}
	@org.testng.annotations.DataProvider(name="Books Data")
	public Object[][]  dataProvider() {
		Object[][]obj= {{"Shyamchi Aai","Saneguruji"},
		{"Test  of myiLife","SachinTendulkar"}};
		return obj;
		

	}
	
	
	

}
