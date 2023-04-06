package com.amazon.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login_tc1_pagefactory {
@Test
	public void c1_pagefactory() throws IOException {
		// TODO Auto-generated method stub
	String projectpath=System.getProperty("user.dir");
	ExtentReports extent=new ExtentReports();
	ExtentSparkReporter spark=new ExtentSparkReporter(projectpath+"\\Reports\\TC2.html");
	extent.attachReporter(spark);
	ExtentTest test=extent.createTest("Signin to Amazon");
	
	String propertypath="C:\\Users\\Administrator\\Desktop\\Eclipse\\march\\src\\test\\java\\com\\Amazon\\testdata\\input.properties";
	propertypath=propertypath.trim();
	InputStream input=new FileInputStream(propertypath);
	Properties prob=new Properties();
	prob.load(input);
	String url=prob.getProperty("url");
	
	File f1=new File("C:\\Users\\Administrator\\Desktop\\Eclipse\\march\\src\\test\\java\\com\\Amazon\\testdata\\amazon.xlsx");
	FileInputStream fis=new FileInputStream(f1);
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	XSSFSheet sheet=workbook.getSheetAt(0);
	int rowcount=sheet.getPhysicalNumberOfRows();
	for(int i=1;i<rowcount;i++)
	{
		  
		
String email=sheet.getRow(i).getCell(0).getStringCellValue();
String password=sheet.getRow(i).getCell(1).getStringCellValue();

		 WebDriverManager.edgedriver().setup();
		 
	     WebDriver driver=new EdgeDriver();
	     
	     login_Pagefactory obj=PageFactory.initElements(driver,login_Pagefactory.class);
	     
	     driver.get(url);
	     
	     obj.clickonyouraccount();
	     
	     test.pass("your Account is clicked");
	     		     
	     
	     obj.clickonsigninlink();
	     
	    	test.pass("your signinlink is clicked");
	   
	     
	     obj.enteremail(email);
	    
	    	 test.pass("your email is entered");
	     
	     
	     obj.clickoncontinue();
	     
	    	 test.pass("your continue button is clicked");
	     
	     obj.enterpassword(password);
	     
	    	 test.pass("your password is entered");
	     
	     obj.clickonsigninsubmit();
	     
	    	 test.pass("your submit button is clicked");
	         extent.flush();
 }
}
}


