package com.firsttest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftAssert {
	@Test
	public void soft_assert1() {
		SoftAssert sa = new SoftAssert();
		String a = "Rahul";
		String b = "Rahul";
		Assert.assertEquals(a, b);;
		System.out.println("First Soft assert is passed");
		String c = "Rahul";
		String d = "Dukre";
		Assert.assertEquals(c, d);
		System.out.println("Second Soft assrert is fail");
		String e = "Dukre";
		String f = "Dukre";
		Assert.assertEquals(e, f);
		System.out.println("Third Soft assrert is pass");
		sa.assertAll();

	}

	public void assertAll() {
		
		
		
	}

}
