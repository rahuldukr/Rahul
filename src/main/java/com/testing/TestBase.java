package com.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

import com.Keywords.Keyword;



public class TestBase {
	private static final String APP_URL="https://www.amazon.in";
	@BeforeMethod
	public static void openBrowser() {
		Keyword.openBrowser("Chrome");
		Keyword.launchedURL(APP_URL);
		

	}
	@AfterClass
	public void tearDown() throws Exception {
		Keyword.closeBrowser();
		
	}

}
