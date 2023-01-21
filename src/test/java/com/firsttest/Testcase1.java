package com.firsttest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class  Testcase1 {
	@Test
	public void Hard_assert() {
		String a="Rahul";
		String b="Rahul";
		Assert.assertEquals(a, b);
		System.out.println("First hard assert is passed");
		String c="Dukre";
		String d="Dukre";
		Assert.assertEquals(a, b);
		System.out.println("Second hard assert is passed");
	
	}

}
