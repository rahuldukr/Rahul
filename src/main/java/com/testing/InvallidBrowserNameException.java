package com.testing;

public class InvallidBrowserNameException extends RuntimeException  {
	String browserName=null;
	public InvallidBrowserNameException(String browserName) {
		
	}
	@Override
	public String getMessage() {
		
		return "InvallidBrowserName";
	}

}
