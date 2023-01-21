package com.firsttest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Excellreading {
	Object[][]obj=null;
	FileInputStream fis=null;
	XSSFWorkbook book=null;
	@DataProvider
	public Object[][] credentialsProvider() {
		Object[][]obj=new Object[4][3];
		try {
			FileInputStream fis = new FileInputStream("");
		} catch (FileNotFoundException e) {
			System.err.println("The file is not present at specified location");
			try {
				book=new XSSFWorkbook(fis);
			} catch (IOException e1) {
				System.err.println("somthing is wrong with excel file");
			}
			XSSFSheet sheet = book.getSheet("Sheet1");
			int lastrow=sheet.getLastRowNum();
			for(int rowNum = 1;rowNum<=lastrow;rowNum++);
			XSSFRow row=sheet.getRow(rowNum);
			
			
			String value= cell.getStringCellValue();
			System.out.println(value);
			
			
		}
		return obj;
		
		

		
	}
	

	
	

	}
	


